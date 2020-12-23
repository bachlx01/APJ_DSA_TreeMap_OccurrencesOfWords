import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String paragraph = "This is crazy String, crazy";
        String[] arrPara = paragraph.split("\\s+");
        System.out.println(Arrays.toString(arrPara));
        TreeMap<String, Integer> myTreeMap = new TreeMap<>();

        for (String element :
                arrPara) {
            if (myTreeMap.containsKey(element)) {
                int value = myTreeMap.get(element);
                myTreeMap.put(element, value+1);
            }
            else {
                myTreeMap.put(element, 1);
            }
        }


        for (String key :
                myTreeMap.keySet()) {
            System.out.println(key + ": " + myTreeMap.get(key));
        }
    }
}
