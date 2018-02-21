package weatherapp
import groovy.transform.CompileStatic

@CompileStatic
class Sys {
    Integer id
    String type
    String message
    String country
    Integer sunrise
    Integer sunset
    static constraints = {
    }
}
