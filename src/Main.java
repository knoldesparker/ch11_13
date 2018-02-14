import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> trueMap = new HashMap<>();
        Map<String, String> falseMap = new HashMap<>();
        trueMap.put("Marty", "Stepp");
        trueMap.put("Stuart", "Reges");
        trueMap.put("Jessica", "Miller");
        trueMap.put("Amanda", "Camp");
        trueMap.put("Hal", "Perkins");
        falseMap.put("Kendrick", "Perkin");
        falseMap.put("Stuart", "Reges");
        falseMap.put("Jessica", "Miller");
        falseMap.put("Bruce", "Reges");
        falseMap.put("Hal", "Perkins");

        System.out.println(isUnique(trueMap));

    }

    public static boolean isUnique(Map<String, String> map) {
        HashSet<String> set = new HashSet<>();

        //For loop der kigger igennem vores map med entry. map.entry er et map par.
        for (Map.Entry<String, String> m : map.entrySet()) {
            //en if sætning der sprøg om HashSet har den value der høre til mit mapEntry
            //Hvis der eksistere en value inde i set returere den false.
            if (set.contains(m.getValue())) {
                return false;
            }
            // Hvis der ikke findes noget value i settet bliver det tilføjet
            // Så det kan blive compared igen senere.
            else {
                set.add(m.getValue());
            }


        }
        return true;
    }
}
