package weatherapp
import groovy.transform.CompileStatic
import org.slf4j.Logger.*
/**
 * A method that returns the current weather for a city
 *@clouds calls the clouds method and gets the cloudiness of the city
 * @coordinates calls the coordinates class and gets the Longitude and Latitude
 * @sys calls the sys method and gets the city information
 * @List<Weather> Gets the list of the current and future weather forecasts for the city from the weather method
 * @Wind calls the wind method and gets the speed and degree for the wind in the city
 */

@CompileStatic
class CurrentWeather {
    Clouds clouds
    Coordinates coordinates
    Sys sys
    List<Weather> weatherList
    Wind wind
    String base
    Integer visibility
    Integer dt
    Integer cityId
    String cityName
    Integer cod


    static constraints = {
        clouds nullable: false
        coordinates nullable: false
        sys nullable: false
        wind nullable: false
        base blank: false
        visibility nullable: false
        dt nullable: false
        cityId nullable: false
        cityName blank: false
        cod nullable: false
    }
    def logback(){
        log.info(clouds)
        log.info(coordinates)
        log.info(sys)
        log.info(weatherList)
        log.info(wind)
        log.info(base)
        log.info(visibility)
        log.info(dt)
        log.info(cityName)
        log.info(cityId)
        log.info(cod)
    }
}
