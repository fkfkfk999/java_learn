package week7.Test;

import java.util.HashMap;
import java.util.Map;

public class TestPackage {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map2.put("test", "88");

        System.out.println("======> " + map2.get("test"));
        map.put("test", map2.get("test"));
    }
}
