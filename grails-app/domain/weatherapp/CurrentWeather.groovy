package weatherapp
import groovy.transform.CompileStatic

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
    }
}
