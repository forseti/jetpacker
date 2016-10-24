package jetpacker.generator

import groovy.util.logging.Slf4j
import jetpacker.configuration.Jetpacker
import ratpack.guice.ConfigurableModule

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@Slf4j
class GeneratorModule extends ConfigurableModule<Jetpacker> {
    @Override
    protected void configure() {
        bind(GeneratorService).asEagerSingleton()
    }
}