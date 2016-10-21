package forseti.core

import groovy.transform.ToString
import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Created by donny.wijaya on 19/10/2016.
 */
@ConfigurationProperties(prefix = "jetpacker")
@ToString(includeNames = true)
class Jetpacker {
    Map<String, Box> boxes
    Map<String, String> databases
    Map<String, String> messageQueues
    Map<String, String> searchEngines
}