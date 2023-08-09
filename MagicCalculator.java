package JavaCalculators;

import java.lang.Math;
import java.math.BigInteger;


/*BONUS
        Create a MagicCalculator that inherits its basic functionality from your calculator and does the following functions:
        Finds the square root of a number
        Finds the sin (trigonometry) of a number. [Note: Feel free to use the MATH class]
        Finds the cosine (trigonometry) of a number. [Note: Feel free to use the MATH class]
        Finds the tangent (trigonometry) of a number. [Note: Feel free to use the MATH class]
        Finds the factorial (!) of the number*/
public class MagicCalculator extends Calculator {
    public static double squareRoot ( double x) {
        return Math.sqrt( x);
    }

    public static double sine ( double x) {
        return Math.sin(x);
    }

    public static double cosine (double x) {
        return Math.cos(x);
    }

    public  static double tangent (double x) {
        return Math.tan(x);
    }

  public static BigInteger factorial (BigInteger x )
  {
      BigInteger result = BigInteger.valueOf(1);

      for (long factor = 2; factor <= x.longValue(); factor++) {
          result = result.multiply(BigInteger.valueOf(factor));
      }

      return result;

  }
}
