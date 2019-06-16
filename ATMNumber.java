import java.io.*;
import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Main
{
  public static DecimalFormat df = new DecimalFormat("0.00");
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner scan = new Scanner(System.in);
	    int X = scan.nextInt();
	    float Y = scan.nextFloat();
	    int C = scan.nextInt();
	    float D = scan.nextFloat();
	    scan.close();
        int[] c = { 5, 10, 20, 50, 100, 200};
        int len = c.length;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
	    int Z = (int) (Math.abs(X - C));
        int count = 0;
        for ( int i = 0; i < len; i ++ ){
          if(c[i] == C){
          	if ( X % C == 0){
	               Y = Y - X - D;
                   count ++;
                   break;
	        }
          }   
        }  
	    if ( count == 0 ){
	      Y = Y - ( X + Z ) - D;
	      }
	    if (X > 100){
	      Y = Y + D;
	    }

	    System.out.println(numberFormat.format(Y));
	   }
}
