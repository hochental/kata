import java.util.*;

public class FindOdd {
  public static int findIt(int[] a) {
        HashMap<Integer, Boolean> checkIfOk = new HashMap<>();

        for(int i=0; i<a.length; i++){
            if(!checkIfOk.containsKey(a[i]))
                checkIfOk.put(a[i], true);
            else{
                Boolean replace = checkIfOk.get(a[i]);
                checkIfOk.replace(a[i], !replace);
            }
        }

        for(Map.Entry<Integer, Boolean> i: checkIfOk.entrySet()){
            if(i.getValue()){
                return i.getKey();
            }
        }

        return 0;
  }
}
