import java.util.ArrayList;
import java.util.List;

public class FindOutlier{
  static int find(int[] integers){
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i:integers){
            if(i%2==0){
                odd.add(i);
            }else
                even.add(i);
        }
        return even.size()<odd.size()?even.get(even.size()-1):odd.get(odd.size()-1);
    }
}
