package jetpacker.service

import com.google.common.cache.CacheBuilder
import com.google.common.cache.LoadingCache
import com.google.common.cache.RemovalListener
import com.google.common.cache.RemovalNotification
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
    private final JetpackerConfiguration jetpacker

    @Inject
    CacheService(HttpClient httpClient, JetpackerConfiguration jetpacker) {
        this.httpClient = httpClient
        this.jetpacker = jetpacker

//        LoadingCache<String, String> graphs = CacheBuilder.newBuilder()
//                .maximumSize(10000)
//                .expireAfterWrite(10, TimeUnit.MINUTES)
//                .removalListener(
//                    new RemovalListener() {
//                        @Override
//                        void onRemoval(RemovalNotification notification) {
//
//                        }
//                    }
//                )
//                .build(
//                    new CacheLoader<String, String>() {
//                        public String load(String key) throws AnyException {
//                            return createExpensiveGraph(key);
//                        }
//                    }
//                )
    }


}
