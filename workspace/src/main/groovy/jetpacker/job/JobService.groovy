package jetpacker.job

import groovy.util.logging.Slf4j
import jetpacker.configuration.Jetpacker

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@Slf4j
@Singleton
class JobService {
    private final Jetpacker jetpacker

    @Inject
    JobService(Jetpacker jetpacker) {
        this.jetpacker = jetpacker
    }
}