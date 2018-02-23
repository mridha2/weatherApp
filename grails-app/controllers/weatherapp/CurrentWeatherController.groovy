package weatherapp

import groovy.util.logging.Log
import org.apache.log4j.Logger

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class CurrentWeatherController {
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CurrentWeather.list(params), model:[currentWeatherCount: CurrentWeather.count()]
    }

    def show(CurrentWeather currentWeather) {
        respond currentWeather
    }

    def create() {
        respond new CurrentWeather(params)
    }

    @Transactional
    def save(CurrentWeather currentWeather) {
        if (currentWeather == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (currentWeather.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond currentWeather.errors, view:'create'
            log.info("This is the Clouds")
            log.debug("this is debugging")
            return
        }

        currentWeather.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'currentWeather.label', default: 'CurrentWeather'), currentWeather.id])
                redirect currentWeather
            }
            '*' { respond currentWeather, [status: CREATED] }
        }
    }

    def edit(CurrentWeather currentWeather) {
        respond currentWeather
    }

    @Transactional
    def update(CurrentWeather currentWeather) {
        if (currentWeather == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (currentWeather.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond currentWeather.errors, view:'edit'
            return
        }

        currentWeather.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'currentWeather.label', default: 'CurrentWeather'), currentWeather.id])
                redirect currentWeather
            }
            '*'{ respond currentWeather, [status: OK] }
        }
    }

    @Transactional
    def delete(CurrentWeather currentWeather) {

        if (currentWeather == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        currentWeather.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'currentWeather.label', default: 'CurrentWeather'), currentWeather.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'currentWeather.label', default: 'CurrentWeather'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }

}
