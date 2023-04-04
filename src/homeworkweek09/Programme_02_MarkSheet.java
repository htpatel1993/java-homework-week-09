package homeworkweek09;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 and 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 and 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme_02_MarkSheet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.print("Enter Student ID : ");
        int id = scan.nextInt(); //store value from user input
        System.out.print("Enter Student Name : ");
        String name = scan.next();//store value from user input
        result(id, name); //
        scan.close();
    }

    public static void result(int id, String name) //instance method created
    {
        Scanner scanner = new Scanner(System.in); //scanner created
        System.out.print("Enter Maths Marks : ");
        int math = scanner.nextInt(); //store maths mark value
        int math1 = math; //store math value in math1
        while (math1 < 0 || math1 > 100) //condition for maths marks checking
        {
            System.out.println("Invalid Input Marks should be between 0 to 100"); //print if condition is false
            System.out.println("Enter Valid Maths Marks : "); //Again valid value taken from user
            math1 = scanner.nextInt(); //new value store in math1

        }
        System.out.print("Enter Science Marks : ");
        int sci = scanner.nextInt(); //store maths mark value
        int sci1 = sci; //store sci value in sci1
        while (sci1 < 0 || sci1 > 100) //condition for science marks checking
        {
            System.out.println("Invalid Input Marks should be between 0 to 100"); //print if condition is false
            System.out.println("Enter Valid Science Marks : "); //Again valid value taken from user
            sci1 = scanner.nextInt(); //new value store in sci1
        }
        System.out.print("Enter English Marks : ");
        int eng = scanner.nextInt();//store eng mark value
        int eng1 = eng; //store eng value in eng1
        while (eng1 < 0 || eng1 > 100) //condition for english marks checking
        {
            System.out.println("Invalid Input Marks should be between 0 to 100"); //print if condition is false
            System.out.println("Enter Valid English Marks : "); //Again valid value taken from user
            eng1 = scanner.nextInt(); //new value store in eng1
        }
        int total = (math1 + sci1 + eng1); //calculate total marks

        int percentage = (total * 100) / 300; //calculate percentage
        String result;         //variable declare for result
        if (eng1 < 35 || math1 < 35 || sci1 < 35) {
            result = "Fail";
        } else {
            result = "Pass";
        }
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
        } else {
            grade = " ";
        }
        System.out.println("|------------------------------ |");
        System.out.println("|           Mark Sheet          |");
        System.out.println("|_______________________________|");
        System.out.println("| Name          : " + name + "         |");
        System.out.println("| Roll No       :   " + id + "           |");
        System.out.println("|_______________________________|");
        System.out.println("| Subjects      :    Marks      |");
        System.out.println("|_______________________________|");
        System.out.println("| Math          :   " + math1 + "          |");
        System.out.println("| Science       :   " + sci1 + "          |");
        System.out.println("| English       :   " + eng1 + "          |");
        System.out.println("|_______________________________|");
        System.out.println("| Total         :    " + total + "        |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage    :   " + percentage + "          |");
        System.out.println("| Result        :  " + result + "         |");
        System.out.println("| Grade         :   " + grade + "           |");
        System.out.println("|_______________________________|");
    }
}