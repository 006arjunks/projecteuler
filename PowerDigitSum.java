import java.math.BigInteger;

public class PowerDigitSum {
        static long calculate(){
            BigInteger power = BigInteger.valueOf(2).pow(1000);
            String digits = power.toString();
            long sum = 0;
            for(char c: digits.toCharArray())
                sum+=c-'0';
            return sum;
        }

    public static void main(String[] args) {
        //problem 16
        System.out.println(calculate());
        //1366
    }
}
