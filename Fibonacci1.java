package DP1;

public class Fibonacci1 {

    public static int fiboM(int n){
        int storage[] = new int[n+1];
        return fiboM(n,storage);
    }

    public static int fiboM(int n,int storage[]){
        if(n==0 || n==1){
            return n;
        }

        if(storage[n] != 0){
            return storage[n];

        }
        
        storage[n] = fiboM(n-1,storage) + fiboM(n-2,storage);
        return storage[n];
    }


    public static void main(String[] args) {
        int n=6;
        System.out.println(fiboM(n));
        
    }
    
}
