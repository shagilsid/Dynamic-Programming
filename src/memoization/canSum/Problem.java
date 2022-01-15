package memoization.canSum;

import java.util.HashMap;
import java.util.Map;

public class Problem {
    static boolean canSum(int target,int[] numbers){
        if(target==0)
            return true;
        if(target<0)
            return false;
        for (int number : numbers) {
            boolean returnValue = canSum(target - number, numbers);
            if (returnValue) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(canSum(300,new int[]{7,14}));
        Map<Integer,Boolean> memo=new HashMap<>();
        System.out.println(canSumDP(600,new int[]{7,14},memo));
    }

    static boolean canSumDP(int target, int[] numbers, Map<Integer,Boolean> memo){
        if (memo.containsKey(target)){
            return memo.get(target);
        }
        if(target==0)
            return true;
        if(target<0)
            return false;
        for (int i = 0; i < numbers.length; i++) {
            boolean returnValue=canSum(target-numbers[i],numbers);
            if (returnValue) {
                memo.put(target,true);
                return true;
            }
        }
        memo.put(target,false);
        return false;
    }
}
