public class ProdFib { 
  public static long[] productFib(long prod) {
    long i=2;
    
        if(prod==1){
          return new long[]{1,1,1};
        }
    
        LinkedList<Long> list = new LinkedList();
        list.add((long) 1);
        list.add((long) 1);
        do{
            list.add(list.get((int) (i-1))+list.get((int) (i-2)));
            i++;
        }while(list.get((int) (i-1))*list.get((int) (i-2))<prod);

        return new long[]{list.get(list.size()-2), list.get(list.size()-1), list.get((int) (i-1))*list.get((int) (i-2))!=prod?0:1};
  }
}
