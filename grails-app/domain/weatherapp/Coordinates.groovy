package weatherapp
import groovy.transform.CompileStatic
/**
 * @lon represents the longitude value that the api request returns
 * @lat represents the latitude value that the api request returns
 */
@CompileStatic
class Coordinates {

    Float lon
    Float lat
    static constraints = {
        lon nullable: false
        lat nullable: false
    }
    def logback(){
        log.info(lon)
        log.info(lat)
    }
}
