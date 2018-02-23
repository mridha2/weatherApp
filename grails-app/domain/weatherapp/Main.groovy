package weatherapp
/**
 *this method is a part of the response that is returned by the api and has values like the temp, pressure, humidity, temp min, and temp max for the current city.
 */

class Main {
    Integer temp
    Integer pressure
    Integer humidity
    Integer temp_max
    Integer temp_min

    static constraints = {
        temp nullable: false
        pressure nullable: false
        humidity nullable: false
        temp_max nullable: false
        temp_min nullable: false
    }
}
