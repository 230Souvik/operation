
package ex17;
import java.util.*;

public class Ex17 {
public static int operationChoices (int c, int a, int b)
  {
    int res = 0;
    switch (c)
      {
      case 1:
	res = a + b;
	break;
	case 2:res = a - b;
	break;
	case 3:res = a * b;
	break;
	case 4:res = a / b;
	break;
      }
    return res;
  }
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc = new Scanner (System.in);
        System.out.println("( a+ b ) , if c=1\n" +
"( a – b ) , if c=2\n" +
"( a * b ) ,  if c=3\n" +
"(a / b) ,  if c =4");
        System.out.println("enter operation");
    int c = sc.nextInt ();
        System.out.println("enter two value");
    int a = sc.nextInt ();
    int b = sc.nextInt ();

    System.out.println (operationChoices (c, a, b));
    }
    
}
