public class Order {
   public static String order(String words) {
        if(words.equals("")){
            return "";
        }
        HashMap<Integer, String> ez = new HashMap<>();
        for(String s: words.split(" ")){
            for(Character splitted: s.toCharArray()){
                if(Character.isDigit(splitted)) {
                    ez.put(Integer.valueOf(splitted), s);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String s: ez.values()){
            sb.append(s+" ");
        }
        return sb.substring(0, sb.length()-1);
    }
}
