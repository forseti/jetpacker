package jetpacker.service

import groovy.util.logging.Slf4j
import jetpacker.configuration.JetpackerConfiguration

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@Slf4j
@Singleton
class GeneratorService {
    private final JetpackerConfiguration jetpackerConfiguration

    @Inject
    GeneratorService(JetpackerConfiguration jetpackerConfiguration) {
        this.jetpackerConfiguration = jetpackerConfiguration
    }
}