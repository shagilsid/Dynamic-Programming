package memoization.canSum;

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
        System.out.println(canSum(300,new int[]{7,14}));
    }
}
