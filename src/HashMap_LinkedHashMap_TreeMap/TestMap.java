package HashMap_LinkedHashMap_TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Manh", 26);
        hashMap.put("Duong", 25);
        hashMap.put("Kien", 28);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap +"\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f, true);
        linkedHashMap.put("Ha", 28);
        linkedHashMap.put("Dat", 27);
        linkedHashMap.put("Nam", 23);
        linkedHashMap.put("Hung", 34);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
