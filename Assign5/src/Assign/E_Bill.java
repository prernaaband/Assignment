package Assign;            //Calculating the electricity bill
import java.util.*;

public class E_Bill {
	
    public static int calculateBill(int units)
    {
       if (units <= 100) {
            return (int) (units * 1.20);
        }
        else if (units <= 200) {
            return (int) ((100 * 2)
                + (units - 100)
                      * 2);
        }
        else if (units <= 300) {
            return (100 * 3)
                + (units - 200)
                      * 3;
        }
       
        return 0;
    }
 
    public static void main(String args[])
    {
        int units =300;
 System.out.println(" Electricity Bill = ");
        System.out.println(calculateBill(units));
    }
   }

