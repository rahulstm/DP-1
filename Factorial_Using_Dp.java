package DP1;

public class Factorial_Using_Dp {

    public static int factDP(int n){
        int storage[] = new int[n+1];
       // storage[0]=1;
        storage[1]=1;

        for(int i=2;i<=n;i++){
            storage[i] = i*storage[i-1];

        }
        return storage[n];
    }



    public static void main(String[] args) {
        int n=6;
        System.out.println(factDP(n));

    }
    
}
