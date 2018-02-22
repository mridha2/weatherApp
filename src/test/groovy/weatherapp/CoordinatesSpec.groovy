package weatherapp

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Coordinates)
class CoordinatesSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test the coordinate domain class validation"(){
        when: 'invalid data'
        Coordinates coor = new Coordinates(lon: "hello", lat: "world")
        coor.save()

        then: 'The coordinate values are not correct and have not been saved'
        coor.hasErrors()
        coor.errors.getFieldError('lon')
        coor.errors.getFieldError('lat')
        Coordinates.count() == 0

        when: 'valid data'
        coor.lat = 51.51
        coor.lon = -0.13
        coor.save()

        then: 'The Coordinates are correct and have been saved'
        Coordinates.count() == 1
        Coordinates.first().lat == 51.51
        Coordinates.first().lon == -0.13


    }
}
