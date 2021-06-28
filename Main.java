package Countries;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        CityDAO readCities = new CityDAO();
        ArrayList<City> cities = readCities.readCitiesCSV("C:\\Users\\20100\\Desktop\\cities.csv");

        CountryDAO readCountries = new CountryDAO();
        ArrayList<Country> countries = readCountries.readCountriesCSV("C:\\Users\\20100\\Desktop\\countries.csv");

//        cities.forEach(x-> System.out.println(x.getPopulation()));
 //       System.out.println(countries);


        // create a map of countries and cities

        Map<String, ArrayList<City>> countriesMap = new HashMap<>();

        for (var city : cities){
            String countryName = city.getCountry();

            if(countriesMap.containsKey(countryName)){
                countriesMap.get(countryName).add(city);
            }else{
                ArrayList<City> c1 = new ArrayList<>();
                c1.add(city);
                countriesMap.put(countryName,c1);
            }
        }

//        countriesMap.forEach((k,v)-> System.out.println("Country " +k + " Cities" + v));
        System.out.println(countriesMap.get("Egypt"));




        //streams
        //Highest population city of each country
        var Highest_in_country = cities.stream()
                .collect(Collectors.groupingBy(City::getCountry,
                        Collectors.maxBy(Comparator.comparing(City::getPopulation))));
        System.out.println("Highest population city of each country" + Highest_in_country.get("Egypt").map(City::getName_ascii));




////        Optional<List> max_city = cities.stream().collect(Collectors.groupingBy(City::getCountry) )
//
//        Map<String, Optional<City>> MaxInCountry = cities.stream().collect(Collectors.groupingBy(City::getCountry,
//                Collectors.maxBy(Comparator.comparingDouble(City::getPopulation))));
//
//MaxInCountry.forEach((k, v)-> System.out.println("Highest population city in "+ v.get().getCountry()+ " is " +k+"   "+ v.get().getPopulation()));
//
////        Map<String, Optional<City>> MaxINContinent = MaxInCountry.keySet().stream().collect(Collectors.groupingBy())




    }
}
