package forseti.core

import groovy.transform.ToString

/**
 * Created by donny.wijaya on 19/10/2016.
 */
@ToString(includeNames = true)
class Box {
    String description
    String defaultImage
    List<String> images
}