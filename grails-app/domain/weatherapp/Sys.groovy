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
        id nullable: false
        type blank: false
        message nullable: false
        country blank: false
        sunset nullable: false
        sunrise nullable: false
    }
    def logback(){
        log.info(id)
        log.info(type)
        log.info(message)
        log.info(country)
        log.info(sunrise)
        log.info(sunset)
    }
}
