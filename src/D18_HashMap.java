import java.util.HashMap;

public class D18_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Himanshu",21);
        map.put("Shahroz",21);
        map.put("Ankit",21);
        map.put("Mudit",20);
        map.put("Aayush",19);

        System.out.println(map);

        System.out.println(map.get("Shahroz"));

        System.out.println(map.size());

        System.out.println(map.isEmpty());




    }
}