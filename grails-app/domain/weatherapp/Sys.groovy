package weatherapp
import groovy.transform.CompileStatic

/**
 * A method that gives you general information about the city like the city id, type, a message value, the country that the city is in, a sunrise value, and sunset value
 */
@CompileStatic
class Sys {
    Integer id
    String type
    Float message
    String country
    Integer sunrise
    Integer sunset
    static constraints = {
    }
}
