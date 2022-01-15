package memoization.bestSum;

import java.util.*;

public class BestSum {

    static List<Integer> bestSum(int targetSum, int[] elements){
        if (targetSum==0)
            return new ArrayList<>();
        if (targetSum<=0)
            return null;
        List<Integer> bestAnswer=null;
        for (int number :
                elements) {
            int remainder = targetSum - number;
            List<Integer> answer=bestSum(remainder,elements);
            if (answer!=null){
                answer.add(number);
               if (bestAnswer==null||bestAnswer.size()> answer.size()){
                   bestAnswer=answer;
               }
            }
        }
        return bestAnswer;
    }

    public static void main(String[] args) {
//        System.out.println(bestSum(7,new int[]{2,4}));
//        System.out.println(bestSum(8,new int[]{2,3,5}));
        System.out.println(bestSum(8,new int[]{1,4,5}));
//        System.out.println(bestSum(100,new int[]{1,2,5,25}));
        Map<Integer,List<Integer>> memo=new HashMap<>();
//        System.out.println(bestSumDP(100,new int[]{1,2,5,25},memo));
//        System.out.println(bestSumDP(7,new int[]{2,4},memo));
//        System.out.println(bestSumDP(8,new int[]{2,3,5},memo));
        System.out.println(bestSumDP(22,new int[]{6,2,8,4,5},memo));

    }
//Not working fine
    static List<Integer> bestSumDP(int targetSum, int[] elements, Map<Integer,List<Integer>> memo){
        if (memo.containsKey(targetSum))
            return memo.get(targetSum);
        if (targetSum==0)
            return new ArrayList<>();
        if (targetSum<=0)
            return null;
        List<Integer> bestAnswer=null;
        for (int number :
                elements) {
            int remainder = targetSum - number;
            List<Integer> answer=bestSumDP(remainder,elements,memo);
            if (answer!=null){
                answer.add(number);
                if (bestAnswer==null||bestAnswer.size()> answer.size()){
                    bestAnswer=answer;
                }
            }else{
                memo.put(targetSum,null);
            }
        }
        memo.put(targetSum,bestAnswer==null?null:new ArrayList<>(bestAnswer));
        return bestAnswer;
    }
}
