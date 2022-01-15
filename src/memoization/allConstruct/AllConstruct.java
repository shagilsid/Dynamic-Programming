package memoization.allConstruct;

import java.util.ArrayList;
import java.util.List;

public class AllConstruct {
    static List<List<String>> allConstruct(String targetString, String[] wordBank){
        if (targetString.isBlank())
            return new ArrayList<>();
        List<List<String>> lists=new ArrayList<>();
        for (String word :
                wordBank) {
            if (targetString.startsWith(word)) {
                String slicedTargetString = targetString.substring(word.length());
                List<List<String>> localList = allConstruct(slicedTargetString, wordBank);
                lists.addAll(localList);

            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(allConstruct("abcdef",new String[]{"ab","abc","cd","def","abcd"}));
    }
}
