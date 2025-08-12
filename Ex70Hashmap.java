import java.util.*;
public class Ex70Hashmap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> map=new HashMap<>();
        map.put("sat",12);
        map.put("peru",66);
        System.out.println("hash map "+map);
        System.out.println("roll no of sat"+map.get("sat"));
        System.out.println("whether sanjay is there "+map.containsKey("sanjay"));
        System.out.println("remove "+map.remove("sat"));
        System.out.println("hash map "+map);
        System.out.println("Hash values ");
        for(Integer key:map.values()){
            System.out.println(key);
            //key value pairs
            System.out.println("key value pairs");
            for(Map.Entry<String,Integer>Entry:map.entrySet()){
                System.out.println(Entry.getKey()+" "+Entry.getValue());
            }
        }
    } 
}
