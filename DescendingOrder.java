import java.util.Collections;
import java.util.LinkedList;

public class DescendingOrder {
  public static int sortDesc(final int num) {
      if(num==0){
            return 0;
        }

    int number = num;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (number > 0) {
            stack.add( number % 10 );
            number = number / 10;
        }
        Collections.sort(stack, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(Integer i: stack){
            sb.append(i);
        }

        return Integer.valueOf(sb.toString());
  }
}
