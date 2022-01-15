package memoization.howSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {
    public static void main(String[] args) {
        System.out.println(howSum(7,new int[]{2,3}));
        System.out.println(howSum(7,new int[]{5,3,4,7}));
        System.out.println(howSum(8,new int[]{2,3,5}));
        System.out.println(howSum(300,new int[]{7,14}));
        Map<Integer,List<Integer>> memo=new HashMap<>();
        System.out.println(howSumDP(300,new int[]{7,14},memo));

    }

    static List<Integer> howSum(int targetSum, int[] elements){
        if(targetSum<0)
            return null;
        if (targetSum==0)
            return new ArrayList<>();
        for (int number :
                elements) {
            int remainder = targetSum - number;
            List<Integer> answer=howSum(remainder,elements);
            if (answer!=null){
                answer.add(number);
                return answer;
            }

        }
        return null;
    }

    static List<Integer> howSumDP(int targetSum, int[] elements, Map<Integer,List<Integer>> memo){
        if(memo.containsKey(targetSum))
            return memo.get(targetSum);
        if(targetSum<0)
            return null;
        if (targetSum==0)
            return new ArrayList<>();
        for (int number :
                elements) {
            int remainder = targetSum - number;
            List<Integer> answer=howSumDP(remainder,elements,memo);
            if (answer!=null){
                answer.add(number);
                memo.put(targetSum,answer);
                return answer;
            }

        }
        memo.put(targetSum,null);
        return null;
    }
}
