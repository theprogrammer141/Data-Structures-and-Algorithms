package BasicOperations;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Adding entries
        map.put("Haider", 19);
        map.put("Ali", 20);
        map.put("Umar", 21);
        map.put("Abdullah", 22);

        //Retrieving entries
//        System.out.println(map.get("Haider"));

        //Removing entries
//        System.out.println(map.remove("Ali"));
//        System.out.println(map.remove("Huzaifa"));


        //Put only if the entry does not exist
//        map.putIfAbsent("Ali", 20);
//        map.putIfAbsent("Hussain", 18);

        //keySet
//        System.out.println(map.keySet());
        //values
//        System.out.println(map.values());
        //entrySet
//        System.out.println(map.entrySet());

        //Iterating through keys
        for(String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println();

        //Iterating through values
        for(Integer val : map.values()){
            System.out.println(val);
        }
        System.out.println();

        //Iterating through entries
        //Syntax 1
        for(java.util.Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry);
        }
        System.out.println();
        //Syntax 2
        for(var e : map.entrySet()){
            System.out.println(e);
        }
    }
}
