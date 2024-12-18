package MostFrequentElement;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 5, 6, 6, 6, 2, 1, 1, 5, 4, 4, 4, 3, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        System.out.println(map.entrySet());

        int maxFrequency = 0, answerKey = -1;

//        for(var e : map.entrySet()){
//            if(e.getValue() > maxFrequency){
//                maxFrequency = e.getValue();
//                answerKey = e.getKey();
//            }
//        }

//        for(var key : map.keySet()){
//            if(map.get(key) > maxFrequency){
//                maxFrequency = map.get(key);
//                answerKey = key;
//            }
//        }

        System.out.printf("%d is the max frequency of %d", maxFrequency, answerKey);
    }
}
