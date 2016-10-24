package jetpacker.configuration

import groovy.transform.ToString

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@ToString(includeNames = true)
class Jetpacker {
    Set<Integer> openjdk

    Application nvm
    Application node
    Application guard

    List<Box> boxes
    List<Application> databases
    List<Application> messageQueues
    List<Application> searchEngines
}