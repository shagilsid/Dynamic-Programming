package memoization.gridTraveller;

import java.util.HashMap;
import java.util.Map;

public class Problem {

   static int gridTraveller(int m, int n){
        if(m==1&&n==1)
            return 1;
        if (m==0||n==0)
            return 0;

        return gridTraveller(m-1,n)+gridTraveller(m,n-1);
    }

    public static void main(String[] args) {
        System.out.println(gridTraveller(3,3));
        System.out.println(gridTraveller(15,15));

        Map<String, Integer> memo=new HashMap<>();
        System.out.println(gridTravellerDP(3,3,memo));
        System.out.println(gridTravellerDP(15,15,memo));
    }
// use larger DS than int
    static int gridTravellerDP(int m, int n, Map<String,Integer> memo){
       String key=m+","+n;
       if (memo.containsKey(key))
           return memo.get(key);
        if(m==1&&n==1)
            return 1;
        if (m==0||n==0)
            return 0;

        int way=gridTravellerDP(m-1,n,memo)+gridTravellerDP(m,n-1,memo);
        memo.put(key,way);
        return way;
    }
}
