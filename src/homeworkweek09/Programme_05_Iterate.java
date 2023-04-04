package homeworkweek09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterater.
 */
//Create Main Method.
public class Programme_05_Iterate {
    public static void main(String[] args) {
        value();
    }
    public static void value() {
        ArrayList<String> days = new ArrayList(); //obj created for arraylist
        //Add obj into days collection
        days.add("one");
        days.add("two");
        days.add("three");
        days.add("four");
        days.add("five");
        days.add("six");
        days.add("seven");
        Iterator list = days.iterator();
        while (list.hasNext()) //check whether value is in arraylist or not
        {
            System.out.println(list.next()); //passing the next element value and check again
        }
    }
}
