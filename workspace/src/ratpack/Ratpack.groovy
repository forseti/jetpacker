import jetpacker.JetpackerModule
import jetpacker.configuration.JetpackerConfiguration
import ratpack.groovy.template.MarkupTemplateModule
import ratpack.rx.RxRatpack
import ratpack.server.BaseDir
import ratpack.server.ServerConfigBuilder
import ratpack.service.Service
import ratpack.service.StartEvent

import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
    serverConfig { ServerConfigBuilder builder ->
        builder
                .yaml("jetpacker.yml")
                .require("/jetpacker", JetpackerConfiguration.class)
                .baseDir(BaseDir.find())
        build()
    }

    bindings {
        module JetpackerModule
        module MarkupTemplateModule

        bindInstance Service, new Service() {
            @Override
            void onStart(StartEvent event) throws Exception {
                RxRatpack.initialize()
            }
        }
    }

    handlers {
        get {
            render groovyMarkupTemplate("index.gtpl", title: "My Ratpack App")
        }

        files { dir "public" }
    }
}
