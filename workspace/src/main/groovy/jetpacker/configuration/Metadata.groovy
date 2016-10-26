package jetpacker.configuration

import groovy.transform.CompileStatic
import groovy.transform.ToString

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@ToString(includeNames = true)
@CompileStatic
class Metadata {
    String tag
    String description

    Tab tab
}
