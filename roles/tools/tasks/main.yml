---
### sdkman ###
- stat: path={{ sdkman_home }}/bin/sdkman-init.sh
  register: sdkman

- name: install sdkman
  command: bash -lc "{{ item }}"
  with_items:
    - curl -s 'https://get.sdkman.io' | bash
    - source {{ sdkman_home }}/bin/sdkman-init.sh
  when: not sdkman.stat.exists

- name: update sdkman
  command: bash -lc "{{ item }}"
  with_items:
    - sdk selfupdate force
    - sdk flush candidates
    - sdk flush broadcast
    - sdk flush archives
    - sdk flush temp
  when: sdkman.stat.exists

### gradle ###
- stat: path={{ sdkman_candidates_home }}/gradle/{{ gradle_version }}
  register: gradle

- name: install gradle:{{ gradle_version }}
  command: bash -lc "{{ item }}"
  with_items:
    - sdk install gradle {{ gradle_version }}
    - sdk default gradle {{ gradle_version }}
    - mkdir -p {{ sdk_root }}/gradle
    - cp -R {{ sdkman_candidates_home }}/gradle/{{ gradle_version }} {{ sdk_root }}/gradle/{{ gradle_version }}
  when:
    - not gradle.stat.exists
    
### nvm ###
- stat: path={{ nvm_home }}
  register: nvm

- name: install nvm:{{ nvm_version }}
  command: bash -lc "curl -o- https://raw.githubusercontent.com/creationix/nvm/v{{ nvm_version }}/install.sh | bash"
  when: not nvm.stat.exists

### node ###
- stat: path={{ nvm_home }}/versions/node/v{{ node_version }}/bin/node
  register: node

- name: install node:{{ node_version }}
  command: bash -lc ". {{ nvm_home }}/nvm.sh && {{ item }}"
  with_items:
    - nvm install v{{ node_version }}
    - nvm alias default v{{ node_version }}
  when: 
    - not node.stat.exists

### guard ###
- stat: path={{ rvm_home }}
  register: rvm

- name: install guard
  command: bash -lc "{{ item }}"
  with_items:
    - gpg --keyserver hkp://keys.gnupg.net --recv-keys 409B6B1796C275462A1703113804BB82D39DC0E3
    - curl -sSL https://get.rvm.io | bash -s stable
    - rvm install {{ ruby_version }}
    - rvm --default use {{ ruby_version }}
    - gem install bundler
    - cd {{ workspace_root }} && bundle install
  when: 
    - not rvm.stat.exists