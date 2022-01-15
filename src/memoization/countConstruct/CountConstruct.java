package memoization.countConstruct;

import java.util.HashMap;
import java.util.Map;

public class CountConstruct {

    static int countConstruct(String targetString, String[] wordBank){
        if (targetString.isEmpty())
            return 1;
        int totalCount=0;
        for (String word :
                wordBank) {
            if (targetString.startsWith(word)){
                String slicedTargetString=targetString.substring(word.length());
                int numOfWays=countConstruct(slicedTargetString,wordBank);
                totalCount+=numOfWays;
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
//        System.out.println(countConstruct("purple",new String[]{"purp","p","ur","le","purpl"}));
//        System.out.println(countConstruct("abcdef",new String[]{"ab","abc","cd","def","abcd"}));
        Map<String,Integer> memo=new HashMap<>();
        System.out.println(countConstructDP("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",new String[]{"e","ee","eeee","eeeeee","eeeeeee","eeeeeeeeee"},memo));
    }

    static int countConstructDP(String targetString, String[] wordBank, Map<String,Integer> memo){
        if (memo.containsKey(targetString))
            return memo.get(targetString);
        if (targetString.isEmpty())
            return 1;
        int totalCount=0;
        for (String word :
                wordBank) {
            if (targetString.startsWith(word)){
                String slicedTargetString=targetString.substring(word.length());
                int numOfWays=countConstructDP(slicedTargetString,wordBank,memo);
                totalCount+=numOfWays;
            }
        }
        memo.put(targetString,totalCount);
        return totalCount;
    }
}
