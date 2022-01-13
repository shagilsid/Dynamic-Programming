package memoization.gridTraveller;

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
        System.out.println(gridTraveller(18,18));
    }
}
