package weatherapp
/**
 * @lon represents the longitude value that the api request returns
 * @lat represents the latitude value that the api request returns
 */
class Coordinates {

    Float lon
    Float lat
    static constraints = {
        lon nullable: false
        lat nullable: false
    }
}
