package calculate;

public class Calculator {
    int add, sub, mul, div; //instance variable

    public void addition(int a, int b) // instance method with passing two argument
    {
        System.out.println("Addition of " + a + "and " + b + " is : " + add); //Print addition of two number
    }

    public void subtraction(int a, int b)// instance method with passing two argument
    {
        System.out.println("Subtraction of " + a + "and " + b + " is : " + sub); //Print subtraction of two number
    }

    public void division(int a, int b) // instance method with passing two argument
    {
        System.out.println("Multiplication of " + a + "and " + b + " is : " + div); //Print multiplication of two number
    }

    public void multiplication(int a, int b) // instance method with passing two argument
    {
        System.out.println("Division of " + a + "and " + b + " is : " + mul); //Print division of two number
    }

    public void calculateResult(int a, int b, char symbol) // instance method with passing three argument
    {
        if (symbol == '+') //condition for + symbol and add two variables
        {
            add = a + b;
            addition(a, b);
        } else if (symbol == '-') //condition for - symbol and subtraction two variables
        {
            sub = a - b;
            subtraction(a, b);
        } else if (symbol == '*') //condition for * symbol and multiplication two variables
        {
            mul = a * b;
            multiplication(a, b);
        } else if (symbol == '/') //condition for / symbol and division two variables
        {
            div = a / b;
            division(a, b);
        }
    }
}
