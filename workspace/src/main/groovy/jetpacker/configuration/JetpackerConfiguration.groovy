package jetpacker.configuration

import groovy.transform.CompileStatic
import groovy.transform.ToString

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@ToString(includeNames = true)
@CompileStatic
class JetpackerConfiguration {
    Set<Integer> openjdk

    List<Sdk> sdks
    List<Box> boxes
    List<Application> databases
    List<Application> messageQueues
    List<Application> searchEngines
}