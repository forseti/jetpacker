package forseti.core

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

/**
 * Created by donny.wijaya on 19/10/2016.
 */
@Configuration
@EnableConfigurationProperties(Jetpacker.class)
class JetpackerConfiguration {
    private final Jetpacker jetpacker

    @Autowired
    JetpackerConfiguration(Jetpacker jetpacker) {
        this.jetpacker = jetpacker

        println "Jetpacker : ${jetpacker}"
    }
}