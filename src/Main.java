import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> trueMap = new HashMap<>();
        Map<String, String> falseMap = new HashMap<>();
        trueMap.put("Marty", "Stepp");
        trueMap.put("Stuart", "Reges");
        trueMap.put("Jessica","Miller");
        trueMap.put("Amanda", "Camp");
        trueMap.put("Hal", "Perkins");
        falseMap.put("Kendrick","Perkin");
        falseMap.put("Stuart","Reges");
        falseMap.put("Jessica","Miller");
        falseMap.put("Bruce","Reges");
        falseMap.put("Hal","Perkins");
        isUnique(falseMap);

    }
    public static boolean isUnique(Map<String, String> map){
        int count = 0;
        boolean rez = true;
        for (String key : map.values()){
            String value = map.get(key);
                if (map.containsValue(value)){
                }
                    count++;
                }
                if (count <= 2){
                    System.out.println("is not unique");
                    System.out.println(count);
                    rez = false;

                }
                if (count > 2){
                    System.out.println("is unique");
                    System.out.println(count);
                    rez = true;
                }
                return rez;
            }
}
