/*
 Solve a given equation and return the value of x in the form of string "x=#value". 
 The equation contains only '+', '-' operation, the variable x and its coefficient.

If there is no solution for the equation, return "No solution".

If there are infinite solutions for the equation, return "Infinite solutions".

If there is exactly one solution for the equation, we ensure that the value of x is an integer.

case =1
input =x+5-3+x=6+x-2
output ="x=2"
case =2
input =x=x
output ="Infinite solutions"

case =3
input =2x+3x-6x=x+2
output	="x=-1"
case =4
input =x=x+2
output ="No solution"

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SolveEquation {

	  public static String coeff(String x) {
	        if (x.length() > 1 && x.charAt(x.length() - 2) >= '0' && x.charAt(x.length() - 2) <= '9')
	            return x.replace("x", "");
	        return x.replace("x", "1");
	    }
	    public static String solveEquation(String equation) {
	        String[] lr = equation.split("=");
	        int lhs = 0, rhs = 0;
	        for (String x: lr[0].split("(?=\\+)|(?=-)")) {
	            if (x.indexOf("x") >= 0) {

	                lhs += Integer.parseInt(coeff(x));
	            } else
	                rhs -= Integer.parseInt(x);
	        }
	        for (String x: lr[1].split("(?=\\+)|(?=-)")) {
	            if (x.indexOf("x") >= 0)
	                lhs -= Integer.parseInt(coeff(x));
	            else
	                rhs += Integer.parseInt(x);
	        }
	        if (lhs == 0) {
	            if (rhs == 0)
	                return "Infinite solutions";
	            else
	                return "No solution";
	        } else
	            return "x=" + rhs / lhs;
	    }
	    
	    public static void main(String args[] ) throws IOException {

		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String equation = br.readLine();

			System.out.println(solveEquation(equation));   
			
			}
}


