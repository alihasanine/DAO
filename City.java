package Countries;

public class City {
    private String name;
    private String name_ascii;
    private double lat;
    private double lng;
    private String country;
    private String iso2;
    private String iso3;
    private String admin_name;
    private String capital;
    private double population;
    private int id;


    public City(String name, String name_ascii, String lat, String lng, String country,
                String iso2, String iso3, String admin_name, String capital, String population, String id) {

        setName(name);
        setName_ascii(name_ascii);
        setLat(lat);
        setLng(lng);
        setCountry(country);
        setIso2(iso2);
        setIso3(iso3);
        setAdmin_name(admin_name);
        setCapital(capital);
        setPopulation(population);
        setId(id);



    }

    public void setName(String name) {
        try{
            this.name = name;
        }catch (Exception e){
            this.name = null;
        }
    }

    public void setName_ascii(String name_ascii) {
        try {
            this.name_ascii = name_ascii;
        }catch (Exception e){
            this.name_ascii= null;
        }
    }

    public void setLat(String lat) {
        try {
            this.lat = Double.valueOf(lat);
        }catch (Exception e){
            this.lat = -1;
        }
    }

    public void setLng(String lng) {
        try {
            this.lng = Double.valueOf(lng);
        }catch (Exception e){
            this.lng = -1;
        }
    }

    public void setCountry(String country) {
        try {
            this.country = country;
        }catch (Exception e){
            this.country = null;
        }
    }

    public void setIso2(String iso2) {
        try {
            this.iso2 = iso2;
        }catch (Exception e) {
            this.iso2 =null;
        }
    }

    public void setIso3(String iso3) {
        try {
            this.iso3 = iso3;
        }catch (Exception e){
            this.iso3 =null;
        }
    }

    public void setAdmin_name(String admin_name) {
        try {
            this.admin_name = admin_name;
        }catch (Exception e){
            this.admin_name =null;
        }
    }

    public void setCapital(String capital) {
        try {
            this.capital = capital;
        }catch (Exception e){
            this.capital =null;
        }
    }

    public void setPopulation(String population) {
        try {
            this.population = Double.valueOf(population);
        }catch (Exception e){
            this.population =-1;
        }
    }

    public void setId(String id) {
        try {
            this.id = Integer.valueOf(id);
        }catch (Exception e){
            this.id = -1;
        }
    }

    public String getName() {
        return name;
    }

    public String getName_ascii() {
        return name_ascii;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getCountry() {
        return country;
    }

    public String getIso2() {
        return iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", name_ascii='" + name_ascii + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", country='" + country + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", id=" + id +
                '}';
    }
}
