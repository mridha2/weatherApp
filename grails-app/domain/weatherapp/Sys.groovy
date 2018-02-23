package weatherapp

/**
 * A method that gives you general information about the city like the city id, type, a message value, the country that the city is in, a sunrise value, and sunset value
 */
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

}
