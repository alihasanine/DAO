package Countries;

public class Country {
    private String iso_name;
    private String name;
    private String continent;


    public Country(String iso_name, String name, String continent) {
        setName(name);
        setIso_name(iso_name);
        setContinent(continent);
    }

    public void setIso_name(String iso_name) {
        try {
            this.iso_name = iso_name;
        }catch (Exception e){
            this.iso_name =null;
        }
    }

    public void setName(String name) {
        try {
            this.name = name;
        }catch (Exception e){
            this.name=null;
        }
    }

    public void setContinent(String continent) {
        try {
            this.continent = continent;
        }catch (Exception e){
            this.continent=null;
        }
    }

    public String getIso_name() {
        return iso_name;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "iso_name='" + iso_name + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}
