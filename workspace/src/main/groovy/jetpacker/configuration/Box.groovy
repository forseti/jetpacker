package jetpacker.configuration

import groovy.transform.ToString

/**
 * Created by donny.wijaya on 24/10/2016.
 */
@ToString(includeNames = true, includeSuper = true)
class Box extends Metadata {
    Set<String> images
    String defaultImage
}