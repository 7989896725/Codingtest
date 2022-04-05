import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class Mapexample {

  public static void main(String[] args){
    Map<String, Integer> map = new HashMap<>();
    map.put("k", 1020);
    map.put("a", 300);
    map.put("s", 100);
    map.put("i", 500);
    map.forEach((k,s)->System.out.println(k+"="+s));
    System.out.println("After Sorting by value");
    List<Entry<String,Integer>>list=new ArrayList<>(map.entrySet());
    list.sort(Entry.comparingByValue());
    list.forEach(System.out::println);
}
}