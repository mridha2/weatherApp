package weatherapp

/**
 * @all represents the cloudiness in a city returned by the api request
 */

class Clouds {
    Long all
    static constraints = {

        all nullable: false
    }

}
