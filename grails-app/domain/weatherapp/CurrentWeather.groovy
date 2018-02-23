package weatherapp
import org.slf4j.Logger.*
/**
 * A method that returns the current weather for a city
 *@clouds calls the clouds method and gets the cloudiness of the city
 * @coordinates calls the coordinates class and gets the Longitude and Latitude
 * @sys calls the sys method and gets the city information
 * @List<Weather> Gets the list of the current and future weather forecasts for the city from the weather method
 * @Wind calls the wind method and gets the speed and degree for the wind in the city
 */

class CurrentWeather {
    Clouds clouds
    Coordinates coordinates
    Sys sys
    List<Weather> weatherList
    Wind wind
    Main main
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
        main nullable: false

    }

}
