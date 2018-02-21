package weatherapp
import groovy.transform.CompileStatic

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
