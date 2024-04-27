public class SummationOfPrimes {
    static long calculate(){
        int limit = 2000_000;
        long res = 17;
        for(int i=10; i<limit; i++){
            if(isPrime(i)) res+=i;
        }
        return res;
    }
    static boolean isPrime(int num) {
        if(num%2==0 || num%3==0) return false;
        for(int i=5; i *i<=num; i++){
            if(num%i==0 || num%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //problem 10
        System.out.println(calculate());
        //142913828922
    }
}
