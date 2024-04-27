public class HighlyDivisibleTriangularNumber {
    static long calculate() {
        long result = 0;
        for(int i=0; i<Integer.MAX_VALUE; i++){
            result+=i;
            if(countDivisors(result)>=500) return result;

        }
        return result;
    }
    static long countDivisors(long num){
        long count = 2;
        long i =2;
        while(i*i<num){
            if(num%i++==0) count+=2;
        }
        if(num%i==0) count++;
        return count;
    }
    public static void main(String[] args) {
        //problem 12
        System.out.println(calculate());
        //76576500
    }
}
