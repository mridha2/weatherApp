package weatherapp
import groovy.transform.CompileStatic

@CompileStatic
/**
 * @lon represents the longitude value that the api request returns
 * @lat represents the latitude value that the api request returns
 */
class Coordinates {

    Float lon
    Float lat
    static constraints = {
    }
}
