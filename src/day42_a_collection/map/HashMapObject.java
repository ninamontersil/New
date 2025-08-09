package day42_a_collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapObject {

    public static void main(String[] args) {

        //map - works with KEY and VALUE pair - aka ENTRY

        List<String> list = new ArrayList<>();

        //Map sample
        //KEY        VALUE
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Zero", 0);
        map.put("MinusOne", -1);
        map.put("SecondTwo", 2);
        map.put("Thirsty", null);
        System.out.println(map);

        /*



        Map
                Hashmap
                -Random Order (oder is based on the keys)=====
                */



    }
}
