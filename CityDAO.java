package Countries;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CityDAO {
    private List<City> cityList = new ArrayList<>();

    public ArrayList<City> readCitiesCSV(String filePath){

        File file = new File(filePath);

        List<String>  lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(file.toPath());
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

        for(int ind=1 ;ind < lines.size(); ind++){
            String[] attributes = lines.get(ind).split(",");

//            for (String attr : attributes){
//                attr.trim().replace("\"", "");
//            }

            cityList.add(new City(attributes[0].trim().replace("\"", ""),
                    attributes[1].trim().replace("\"", ""),
                    attributes[2].trim().replace("\"", ""),
                    attributes[3].trim().replace("\"", ""),
                    attributes[4].trim().replace("\"", ""),
                    attributes[5].trim().replace("\"", ""),
                    attributes[6].trim().replace("\"", ""),
                    attributes[7].trim().replace("\"", ""),
                    attributes[8].trim().replace("\"", ""),
                    attributes[9].trim().replace("\"", ""),
                    attributes[10].trim().replace("\"", "")));

        }


        System.out.println("Data is loaded and consist of "+ cityList.size()+ " records");
        return (ArrayList<City>) cityList;

    }

}
