package jetpacker

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import jetpacker.configuration.JetpackerConfiguration
import jetpacker.service.CacheService
import jetpacker.service.GeneratorService
import jetpacker.service.JobService
import ratpack.guice.ConfigurableModule

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@Slf4j
@CompileStatic
class JetpackerModule extends ConfigurableModule<JetpackerConfiguration> {
    @Override
    protected void configure() {
        bind(CacheService.class)
        bind(GeneratorService.class)
        bind(JobService.class)
    }
}