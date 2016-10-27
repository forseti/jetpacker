# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
  config.vm.box = 'ubuntu/trusty64'

  config.vm.provider "virtualbox" do |virtualbox|
    virtualbox.memory = 4096
  end

  # forwarded ports
  config.vm.network 'forwarded_port', guest: 8080, host: 8080, auto_correct: true

  config.vm.provision "docker"

  config.vm.provision 'ansible', run: "always", type: 'ansible_local' do |ansible|
    ansible.sudo = true
    ansible.verbose = true
    ansible.playbook = './playbook.yml'
    ansible.extra_vars = {
      application_name: 'my_app',
      time_zone: 'Asia/Singapore',

      workspace_root: '/vagrant/workspace',
      sdk_root: '/vagrant/.sdk',

      workspace_home: "/home/vagrant/workspace",
      configuration_home: "/home/vagrant/configuration",
      data_home: "/home/vagrant/data"
    }
  end
end