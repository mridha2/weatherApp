package weatherapp

class BootStrap {

    def init = { servletContext ->
        Clouds.log.info("this is from the clouds method")
        Coordinates.log.info("this is from the Coordinates method")
        CurrentWeather.log.info("this is from the CurrentWeather method")
        Sys.log.info("this is from the sys method")
        Weather.log.info("this is from the Weather method")
        Wind.log.info("this is from the Wind method")
        Main.log.info("this is from the Main method")
    }
    def destroy = {
    }
}
