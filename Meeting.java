import java.util.*;
import java.util.stream.Collectors;

class Meeting {
  
  public static String meeting(String s) {
        HashMap<String, List<String>> map = new HashMap<>();
        int i=0;
        for(String splittedString: s.split(";")){
            i++;
            if(map.containsKey(splittedString.split(":")[1].toUpperCase())){
              map.get(splittedString.split(":")[1].toUpperCase()).add(splittedString.split(":")[0].toUpperCase());
            }else {
                List<String> some=new ArrayList<String>();
                some.add(splittedString.split(":")[0].toUpperCase());
                map.put(splittedString.split(":")[1].toUpperCase(), some);
            }
        }

        Map<String,List<String>> topTen =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        StringBuilder sb = new StringBuilder();
        for(String key: topTen.keySet()) {
            Collections.sort(map.get(key));
            for(String value: map.get(key)){
                sb.append("("+key+", "+value+")");
            }
        }
        return sb.toString();
    }
  }
