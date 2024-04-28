import java.util.HashMap;
import java.util.Map;

public class LongestCollatzSequence{
        static long calculate(){
            Map<Long, Long> memo = new HashMap<>();
            long max = 1L, res = 1000_000L;
            for(long i=1000_000; i>=1000_00; i--){
                long t = findMax(memo,  i);
                if(t>max){
                    max = t;
                    res = i;
                }
            }
            return res;
        }
        static Long findMax(Map<Long, Long> memo, long curr){
            if(curr<=1) return 0L;
            if(memo.containsKey(curr)){
                return memo.get(curr);
            }
            long res = 0;
            if(curr%2==0) res = findMax(memo, curr/2);
            else res = findMax(memo, 3*curr+1);
            memo.put(curr, res+1);
            return res+1;
        }
        public static void main(String[] args) {
            //problem 14
            System.out.println(calculate());
            //837799
        }
}
