package jetpacker.configuration

import groovy.transform.CompileStatic
import groovy.transform.ToString

/**
 * Created by wolf on 25/10/16.
 */
@ToString(includeNames = true, includeSuper = true)
@CompileStatic
class Sdk extends Application {
    List<String> plugins
    Sdk dependency
}
