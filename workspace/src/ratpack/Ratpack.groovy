import jetpacker.configuration.Application
import jetpacker.configuration.Jetpacker
import jetpacker.generator.GeneratorModule
import jetpacker.generator.GeneratorService
import jetpacker.job.JobModule
import jetpacker.job.JobService
import ratpack.groovy.template.MarkupTemplateModule
import ratpack.server.ServerConfigBuilder

import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
    serverConfig { ServerConfigBuilder builder ->
        builder
                .yaml("application.yml")
                .require("/jetpacker", Jetpacker.class)
        build()
    }

    bindings {
        module JobModule
        module GeneratorModule
        module MarkupTemplateModule
    }

    handlers {
        get {
            render groovyMarkupTemplate("index.gtpl", title: "My Ratpack App")
        }

        files { dir "public" }
    }
}
