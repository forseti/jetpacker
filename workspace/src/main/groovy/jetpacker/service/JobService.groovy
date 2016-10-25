package jetpacker.service

import groovy.util.logging.Slf4j
import ratpack.service.Service
import ratpack.service.StartEvent
import ratpack.service.StopEvent

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@Slf4j
@Singleton
class JobService implements Service {
    private final CacheService cacheService

    @Inject
    JobService(CacheService cacheService) {
        this.cacheService = cacheService
        println "abc"
    }

    @Override
    void onStart(StartEvent event) throws Exception {

    }

    @Override
    void onStop(StopEvent event) throws Exception {
    }
}