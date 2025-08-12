import java.util.HashMap;

public class hashMap {
    public static void main(String[] args){
        //hashmaps->A data structure that stores key-value pairs Keys are unique, but values can be
        //duplicated. It doesn't maintain any order, but is memory efficient
        //HashMap<Key,Value>
        HashMap<String,Double> map = new HashMap<>();
        map.put("apple",0.50);
        map.put("orange", 0.75);
        map.put("Banana", 1.25);
        System.out.println(map);
        /*Output->{orange=0.75, apple=0.5, Banana=1.25}*/
        //if we put same key value then value is overriden
        map.put("orange", 2.55);
        System.out.println(map);
        //output->{orange=2.55, apple=0.5, Banana=1.25}

        map.put("Mango",1.56);
        System.out.println(map);
        //output->{orange=2.55, apple=0.5, Mango=1.56, Banana=1.25}
        //to remove
        map.remove("apple");//only key is used
        System.out.println(map);
        //output->{orange=2.55, Mango=1.56, Banana=1.25}

        System.out.println(map.get("orange"));//2.55
        System.out.println(map.containsKey("apple"));//false
        System.out.println(map.containsValue(2.55));//true

        //use case of containsKey
        if(map.containsKey("Mango")){
            System.out.println(map.get("Mango"));
        }
        else{
            System.out.println("Key not found!");
        }
        System.out.println(map.size());//3(total keys and value in pair)

        //to iterate through maps
        for(String key: map.keySet()){
            System.out.println(key + " $ "+map.get(key));
        }

    }
}
