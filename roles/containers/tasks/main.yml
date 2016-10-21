---
### alpine ###
- name: run alpine:latest
  docker_container:
    name: alpine
    image: alpine:latest
    volumes: 
      # - "{{ postgresql_data_home }}:/var/lib/postgresql/data/pgdata"

      # - "{{ mysql_configuration_home }}:/etc/mysql/conf.d"
      # - "{{ mysql_data_home }}:/var/lib/mysql"
        
      # - "{{ mariadb_configuration_home }}:/etc/mysql/conf.d"
      # - "{{ mariadb_data_home }}:/var/lib/mysql"

      # - "{{ mongodb_data_home }}:/data/db"

      - "{{ redis_configuration_home }}:/usr/local/etc/redis"
      - "{{ redis_data_home }}:/data"

      # - "{{ rabbitmq_data_home }}:/var/lib/rabbitmq"
    command: "true"

### postgresql ###
# - name: run postgresql {{ postgresql_version }} container
#   docker_container:
#     name: postgresql
#     image: postgres:{{ postgresql_version }}
#     interactive: true
#     published_ports: "{{ postgresql_port }}"
#     volumes_from: alpine
#     state: started
#     recreate: true
#     env: 
#       POSTGRES_USER: "{{ postgresql_user }}"
#       POSTGRES_PASSWORD: "{{ postgresql_password }}"
#       POSTGRES_DB: "{{ postgresql_database }}"
#       PGDATA : /var/lib/postgresql/data/pgdata

### mysql ###
# - name: run mysql:{{ mysql_version }}
#   docker_container:
#     name: mysql
#     image: mysql:{{ mysql_version }}
#     interactive: true
#     published_ports: "{{ mysql_port }}"
#     volumes_from: alpine
#     state: started
#     recreate: true
#     env: 
#       MYSQL_ROOT_PASSWORD: "{{ mysql_root_password }}"
#       MYSQL_DATABASE: "{{ mysql_database }}"

### mariadb ###
# - name: run mariadb:{{ mariadb_version }}
#   docker_container:
#     name: mariadb
#     image: mariadb:{{ mariadb_version }}
#     interactive: true
#     published_ports: "{{ mariadb_port }}"
#     volumes_from: alpine
#     state: started
#     recreate: true
#     env:
#       MYSQL_ROOT_PASSWORD: "{{ mariadb_root_password }}"
#       MYSQL_DATABASE: "{{ mariadb_database }}"

### mongodb ###
# - name: run mongodb:{{ mongodb_version }}
#   docker_container:
#     name: mongodb
#     image: mongo:{{ mongodb_version }}
#     interactive: true
#     published_ports: "{{ mongodb_port }}"
#     volumes_from: alpine
#     state: started
#     recreate: true

### redis ###
- name: run redis:{{ redis_version }}
  docker_container:
    name: redis
    image: redis:{{ redis_version }}
    command: redis-server --appendonly yes
    interactive: true
    published_ports: "{{ redis_port }}"
    volumes_from: alpine
    state: started
    recreate: true

### rabbitmq ###
# - name: run rabbitmq:{{ rabbitmq_version }}
#   docker_container:
#     name: rabbitmq
#     image: rabbitmq:{{ rabbitmq_version }}-management
#     interactive: true
#     published_ports: "{{ rabbitmq_ports }}"
#     volumes_from: alpine
#     state: started
#     recreate: true
#     env: 
#       RABBITMQ_DEFAULT_USER: "{{ rabbitmq_user }}"
#       RABBITMQ_DEFAULT_PASS: "{{ rabbitmq_password }}"
#       RABBITMQ_NODE_NAME: "{{ rabbitmq_node_name }}"
#       RABBITMQ_ERLANG_COOKIE: "{{ rabbitmq_cookie }}"