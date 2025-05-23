package Shashank.WebAutomation.Interview_Preparation.ex_2024_12_Dec.ex_12122024;

import java.util.HashMap;
import java.util.Map;

//  Write a program to fetch the values from the map using keys.

public class FetchValuesFromMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Name", "Shashank");
        map.put("City", "Amravati");
        map.put("Country", "India");
        map.put("Occupation", "Engineer");

        String name = map.get("Name");
        String city = map.get("City");

        System.out.println("Name is " + name);
        System.out.println("City is " + city);

        System.out.println("\nAll Key Values Pairs :");
        for (String key : map.keySet()){                        // keySet() : to retrieve all keys
            System.out.println(key + " : " + map.get(key));     // get() : to fetch their values in a loop
        }

    }
}
