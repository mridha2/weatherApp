package weatherapp

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Wind)
class WindSpec extends Specification {

    def setup() {

    }

    def cleanup() {
    }

    void "test the Wind domain class validation"(){
        when: 'invalid data'
        Wind wind = new Wind(speed: "fast", deg: "high")
        wind.save()

        then: 'The Wind values are not correct and have not been saved'
        wind.hasErrors()
        wind.errors.getFieldError('speed')
        wind.errors.getFieldError('deg')

        Wind.count() == 0

        when: 'valid data'
        wind.speed = 4.1
        wind.deg = 80

        then: 'The Wind values are correct and been been saved'
        Wind.count() == 1
        Wind.first().speed == 4.1
        Wind.first().deg == 90


    }
}
