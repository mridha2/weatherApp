package weatherapp
import groovy.transform.CompileStatic

/**
 * A method the provides the speed and degree of the wind in the city
 */
@CompileStatic
class Wind {
    Float speed
    Float deg
    static constraints = {
    }
}
