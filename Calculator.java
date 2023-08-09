package JavaCalculators;

/*Create a Java Calculator Class that does the following five commands:
An add method that takes in two integer numbers and adds them together the call to that method would look like this: add(int num1, int num2)
A subtraction method that takes in two integers and subtracts them from one another would look like this: subtract( int num1, int num2)
A multiplication method that takes in two integer numbers and multiplies them together the call to that method would look like this: multiply(int num1, int num2)
A division method that takes in two integer numbers and divides them the call to that method would look like this: divide(int num1, int num2)
A square method that takes in one integer and squares it: square(int num1, int num2)
*/

package JavaCalculators;
public class Calculator {

    public static int sum (int x, int y)
    {return x + y;}
    public static int subtraction (int x , int y)
    {
        return x - y;
    }

    public static int multiply (int x , int y)
    {
        return x * y;
    }

    public static int division (int x , int y)
    {
        return x / y;
    }

    public static int squared (int x)
    {
        return x * x;
    }
}
