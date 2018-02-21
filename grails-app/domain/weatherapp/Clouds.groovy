package weatherapp
import groovy.transform.CompileStatic

/**
 * @all represents the cloudiness in a city returned by the api request
 */
@CompileStatic
class Clouds {
    Integer all

    static constraints = {
    }
}
