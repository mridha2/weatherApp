package weatherapp

/**
 * A method the provides the speed and degree of the wind in the city
 */
class Wind {
    Float speed
    Float deg
    static constraints = {
        speed nullable: false
        deg nullable: false
    }

}
