package homeworkweek09;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_09_HashMap {

    public static void main(String[] args) //main method declared
    {
        Programme_09_HashMap obj = new Programme_09_HashMap(); //instance obj created for instance method
        obj.map(); //instance method calling
    }

    public void map() {
        Map<String, Integer> people = new HashMap<>(); //Hashmap obj created
        //obj elements
        people.put("Arpit", 1);
        people.put("Ronak", 2);
        people.put("Jay", 3);
        people.put("Vishal", 4);
        for (Map.Entry<String, Integer> map : people.entrySet()) //iterate value from map
        {
            System.out.println(map.getKey() + " " + map.getValue()); //print elements from collection
        }
    }

}
