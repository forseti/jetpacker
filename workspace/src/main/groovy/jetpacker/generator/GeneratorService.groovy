package jetpacker.generator

import groovy.util.logging.Slf4j
import jetpacker.configuration.Jetpacker

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@Slf4j
@Singleton
class GeneratorService {
    private final Jetpacker jetpacker

    @Inject
    GeneratorService(Jetpacker jetpacker) {
        this.jetpacker = jetpacker
    }
}
