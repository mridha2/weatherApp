package weatherapp

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(CurrentWeather)
class CurrentWeatherSpec extends Specification {
    def setup() {
    }

    def cleanup() {
    }

    void "test the CurrentWeather domain class validation"(){
        when: 'invalid data'
        Coordinates coor = new Coordinates(lon: -0.13, lat: 51.51)
        Clouds cloud =  new Clouds(all: 90)
        Sys sys = new Sys(type: 1, id: 5091, message: 0.0103, country: "GB", sunrise: 1485762037, sunset: 1485794875 )
        Weather weather = new Weather(id: 300, main: "Drizzle", description: "light intensity drizzle", icon: "09D")
        Wind wind = new Wind(speed: 4.1, deg: 80)
        Main main = new Main(temp: 280.32, pressure: 1012, humidity: 81, temp_min: 279.14, temp_max: 281.15)
        CurrentWeather cur = new CurrentWeather(clouds: cloud, coordinates: coor, sys: sys, weatherList: weather, wind: wind,main: main, base: "stations", visibility: 10000 ,dt:"hello" ,cityId: 2643743 ,cityName: "London",cod:"world" )
        cur.validate()

        then: 'The Current Weather values are not correct and have not been saved'
        cur.hasErrors()
        cur.errors.getFieldError('dt')
        cur.errors.getFieldError('cod')
        CurrentWeather.count() == 0

        when: 'valid data'
        cur.dt = 1485789600
        cur.cod = 200
        cur.validate()

        then: 'The Current Weather values are correct and have been saved'
        CurrentWeather.count() == 1
        CurrentWeather.first().dt == 1485789600
        CurrentWeather.first().cod == 200


    }
}
