package jetpacker.configuration

import groovy.transform.ToString

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@ToString(includeNames = true, includeSuper = true)
class Application extends Metadata {
    Endpoint endpoint
    String namespace
}