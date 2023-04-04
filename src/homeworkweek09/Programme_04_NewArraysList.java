package homeworkweek09;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
//Create Main Class
public class Programme_04_NewArraysList {
    public static void main(String[] args) {
        Programme_04_NewArraysList obj = new Programme_04_NewArraysList(); //obj created for instance method
        obj.color(); //instance method calling
    }

    public void color() //instance method created
    {
        ArrayList<String> color = new ArrayList(); //obj created for arraylist
        //Add obj into color collection
        color.add("Black");
        color.add("White");
        color.add("Pink");
        color.add("Red");
        color.add("Brown");
        for (String a : color) //forEach loop
        {
            System.out.println(a);
        }
    }
}
