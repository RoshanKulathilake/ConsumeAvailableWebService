/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumeavailablewebservice;

/**
 *
 * @author DK_Roshan
 */
public class ConsumeAvailableWebService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String country = "India";
        String city = "Madurai";
        //System.out.println(getCitiesByCountry(country));
        System.out.println(getWeather(city,country));*/
    }

    public static String getCitiesByCountry(java.lang.String countryName) {
        net.webservicex.GlobalWeather service = new net.webservicex.GlobalWeather();
        net.webservicex.GlobalWeatherSoap port = service.getGlobalWeatherSoap();
        return port.getCitiesByCountry(countryName);
    }

    public static String getWeather(java.lang.String cityName, java.lang.String countryName) {
        net.webservicex.GlobalWeather service = new net.webservicex.GlobalWeather();
        net.webservicex.GlobalWeatherSoap port = service.getGlobalWeatherSoap();
        return port.getWeather(cityName, countryName);
    }
    
}
