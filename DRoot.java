import java.util.*;

public class DRoot {
  
  public static int digital_root(int n) {
          int sum=n;
        do{
            sum = numberSplitter(sum).stream()
                    .mapToInt(a -> a)
                    .sum();
            System.out.println(sum);
        }while(String.valueOf(sum).length()!=1);
        return sum;
      }
  
      public static LinkedList<Integer> numberSplitter(int n){
          int number = n;
          LinkedList<Integer> stack = new LinkedList<Integer>();
          while (number > 0) {
              stack.push( number % 10 );
              number = number / 10;
          }
          return stack;
      }
  
}
