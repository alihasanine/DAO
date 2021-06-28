package Countries;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO {

    private  List<Country> countryList = new ArrayList<>();

    public ArrayList<Country> readCountriesCSV(String filePath){

        File file = new File(filePath);

        List<String> lines = new ArrayList<>();
        try {
            lines =  Files.readAllLines(file.toPath());
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

        for (int ind=1 ;ind < lines.size(); ind++){
            String[] attributes = lines.get(ind).split(",");
            for (String attr: attributes){
                attr = attr.trim().replace("\"", "");
            }

            countryList.add(new Country(attributes[0],attributes[1],attributes[2]));

        }

        System.out.println("Data is loaded and consist of "+ countryList.size()+ " records");
        return (ArrayList<Country>) countryList;
    }
}
