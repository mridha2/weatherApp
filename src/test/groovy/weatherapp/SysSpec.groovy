package weatherapp

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Sys)
class SysSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test the Sys domain class validation"(){
        when: 'invalid data'
        Sys sys = new Sys(type: "weather", id: "city", message: "hello", country: "lincoln", sunrise: "morning", sunset: "night" )
        sys.save()

        then: 'The sys values are not correct and have not been saved'
        sys.hasErrors()
        sys.errors.getFieldError('type')
        sys.errors.getFieldError('id')
        sys.errors.getFieldError('message')
        sys.errors.getFieldError('country')
        sys.errors.getFieldError('sunrise')
        sys.errors.getFieldError('sunset')
        Sys.count() == 0

        when: 'valid data'
        sys.type = 1
        sys.id = 5091
        sys.message = 0.0103
        sys.country = "GB"
        sys.sunrise = 1485762037
        sys.sunset = 1485794875

        then: 'The Sys values are correct and been been saved'
        Sys.count() == 1
        Sys.first().id == 5091
        Sys.first().country == "GB"


    }
}
