package weatherapp

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Clouds)
class CloudsSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test the cloud domain class validation"(){
        when: 'invalid data'
        Clouds cloud =  new Clouds(all: "hello")
        cloud.save()

        then: 'The cloudiness value is not correct and has not been saved'
        cloud.hasErrors()
        cloud.errors.getFieldError('all')
        Clouds.count() == 0

        when: 'valid data'
        cloud.all = 90
        cloud.save()

        then: 'The cloudiness level is correct and has been saved'
        Clouds.count() == 1
        Clouds.first().all == 90


    }
}
