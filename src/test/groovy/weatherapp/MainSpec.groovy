package weatherapp

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Main)
class MainSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test the Main domain class validation"(){
        when: 'invalid data'
        Main main = new Main(temp: "weather", pressure: "city", humidity: "hello", temp_min: "lincoln", temp_max: "morning")
        main.validate()

        then: 'The Main values are not correct and have not been saved'
        main.hasErrors()
        main.errors.getFieldError('temp')
        main.errors.getFieldError('pressure')
        main.errors.getFieldError('humidity')
        main.errors.getFieldError('temp_min')
        main.errors.getFieldError('temp_max')
        Main.count() == 0

        when: 'valid data'
        main.temp = 280.32
        main.pressure = 1012
        main.humidity = 81
        main.temp_min = 279.15
        main.temp_max = 281.15
        main.validate()

        then: 'The main values are correct and been been saved'
        Main.count() == 1
        Main.first().temp == 280.32
        Main.first().pressure == 1012


    }
}
