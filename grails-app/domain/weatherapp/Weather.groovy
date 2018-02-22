package weatherapp
import groovy.transform.CompileStatic

/**
 * a method that returns the general description for the weather of the city like the id, current main weather, a longer description of the current weather, and an icon for the weather
 *
 */
@CompileStatic
class Weather {
    Integer id
    String main
    String description
    String icon
    static constraints = {
        id nullable: false
        main blank: false
        description blank: false
        icon blank: false
    }
    def logback(){
        log.info(id)
        log.info(main)
        log.info(description)
        log.info(icon)
    }
}
