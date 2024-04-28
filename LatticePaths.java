import java.util.HashMap;
import java.util.Map;

public class LatticePaths {
        static long[][] memo ;
        static int limit = 20;
        static long calculate(){
            memo = new long[limit+1][limit+1];
            return findPaths(0,0);
        }
        static long findPaths(int i, int j){
            if(i==limit && j==limit) return 1;
            if(i>limit || j>limit) return 0;
            if(memo[i][j]!=0) return memo[i][j];
            return memo[i][j] = findPaths(i+1, j) + findPaths(i, j+1);
        }
        public static void main(String[] args) {
            //problem 15
            System.out.println(calculate());
            //137846528820
        }
}
