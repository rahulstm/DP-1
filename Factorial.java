package DP1;
public class Factorial {

    // public static int fact(int n){
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     else{
    //         return n*fact(n-1);
    //     }
    // }

    public static int factM(int n){
        int storage[] = new int[n+1];
    //    for(int i=0;i<=n;i++){
    //     storage[i] = -1;
    //    }
       return factM(n,storage);
    }

    public static int factM(int n, int storage[]){
        if(n==0 || n==1){
            storage[n] = n;
            return storage[n];
        }
        if(storage[n] != -1){
            return storage[n];
        }
        storage[n] = n*factM(n-1,storage);
        return storage[n];
    }

    public static void main(String[] args) {
        int n=5;
     
        System.out.println(factM(n));
      // System.out.println(fact(n));
        
    }
    
}
