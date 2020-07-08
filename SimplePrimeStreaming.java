public class SimplePrimeStreaming {
    public static Boolean checkIfPrime(int num){
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            return true;
        else
            return false;
    }
    public static String solve(int a, int b) {

        StringBuilder sb = new StringBuilder("");
        int i=0;
        do{
            i++;
            if(checkIfPrime(i))
                sb.append(i);
        }while(sb.length()<=a+b+1);


        return sb.substring(a+1, a+1+b);
    }
}
