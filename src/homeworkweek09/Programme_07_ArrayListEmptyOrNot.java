package homeworkweek09;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_07_ArrayListEmptyOrNot {
    public static void main(String[] args) {
        Programme_07_ArrayListEmptyOrNot obj = new Programme_07_ArrayListEmptyOrNot(); //instance obj created for instance method
        obj.empty(); //instance method calling
    }

    public void empty() {
        ArrayList days = new ArrayList(); //obj created for arraylist
        //Add obj into days collection
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        ArrayList emptyArray = new ArrayList();

        System.out.println(days.isEmpty());//check whether Arraylist is empty or not
        System.out.println(emptyArray.isEmpty());
    }
}
