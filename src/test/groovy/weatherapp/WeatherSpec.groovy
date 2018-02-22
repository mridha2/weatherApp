package weatherapp

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Weather)
class WeatherSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test the Weather domain class validation"(){
        when: 'invalid data'
        Weather weather = new Weather(id: "hot", main: 100, description: 10, icon: "happy")
        weather.save()

        then: 'The Weather values are not correct and have not been saved'
        weather.hasErrors()
        weather.errors.getFieldError('id')
        weather.errors.getFieldError('main')
        weather.errors.getFieldError('description')
        weather.errors.getFieldError('icon')
        Weather.count() == 0

        when: 'valid data'
        weather.id = 300
        weather.main = "Drizzle"
        weather.description = "light intensity drizzle"
        weather.icon = "09D"

        then: 'The Weather values are correct and been been saved'
        Weather.count() == 1
        Weather.first().id == 300
        Weather.first().icon == "09D"


    }
}
