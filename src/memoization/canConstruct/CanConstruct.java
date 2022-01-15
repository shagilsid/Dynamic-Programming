package memoization.canConstruct;

import java.util.HashMap;
import java.util.Map;

public class CanConstruct {
    static boolean canConstruct(String targetString, String[] wordBank){
        if (targetString.isBlank())
            return true;
        for (String word :
                wordBank) {
            if (targetString.startsWith(word)){
                String newTargetString=targetString.substring(word.length());
                if (canConstruct(newTargetString,wordBank)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(canConstruct("abcdef",new String[]{"ab","abc","cd","def","abcd"}));
//        System.out.println(canConstruct("skateboard",new String[]{"bo","rd","ate","t","ska","sk","boar"}));
//        System.out.println(canConstruct("enterapotentpot",new String[]{"a","p","ent","enter","ot","o","t"}));
        Map<String, Boolean> memo=new HashMap<>();
//        System.out.println(canConstructDP("abcdef",new String[]{"ab","abc","cd","def","abcd"},memo));
//        System.out.println(canConstructDP("skateboard",new String[]{"bo","rd","ate","t","ska","sk","boar"},memo));
//        System.out.println(canConstructDP("enterapotentpot",new String[]{"a","p","ent","enter","ot","o","t"},memo));
        System.out.println(canConstructDP("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",new String[]{"e","ee","eeee","eeeeee","eeeeeee","eeeeeeeeee"},memo));
    }

    static boolean canConstructDP(String targetString, String[] wordBank, Map<String, Boolean> memo){
        if (memo.containsKey(targetString))
            return memo.get(targetString);
        if (targetString.isBlank())
            return true;
        for (String word :
                wordBank) {
            if (targetString.startsWith(word)){
                String newTargetString=targetString.substring(word.length());
                if (canConstructDP(newTargetString,wordBank,memo)){
                    memo.put(targetString,true);
                    return true;
                }
            }
        }
        memo.put(targetString,false);
        return false;
    }
}

