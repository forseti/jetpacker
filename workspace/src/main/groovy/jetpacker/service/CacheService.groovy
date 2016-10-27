package jetpacker.service

import groovy.util.logging.Slf4j
import jetpacker.configuration.JetpackerConfiguration
import ratpack.http.client.HttpClient

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@Slf4j
@Singleton
class CacheService {
    private final HttpClient httpClient
    private final JetpackerConfiguration jetpackerConfiguration

    @Inject
    CacheService(HttpClient httpClient, JetpackerConfiguration jetpackerConfiguration) {
        this.httpClient = httpClient
        this.jetpackerConfiguration = jetpackerConfiguration
    }

    void update() {
    }
}
