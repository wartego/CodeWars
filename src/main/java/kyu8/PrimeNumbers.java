package kyu8;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if(num<=0){
            isPrime = false;
            return isPrime;
        }
        if(num==1){
            return false;
        }
        if(num==2){
            return true;
        }

        for(int i = 2;i<num;i++){

            if(num%i==0){
                isPrime = false;
                break;
            }

        }return isPrime;
    }
}
