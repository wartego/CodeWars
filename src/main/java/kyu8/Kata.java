package kyu8;

public class Kata {

    public static void main(String[] args) {

    }
    public static int[] Solve(String word) {
        String s = "*'&ABCDabcde12345";

        char[] chars = s.toCharArray();
        int uppercase =0 ;
        int lowercase =0;
        int numbers =0 ;
        int specialCharacters =0;

        for(char element : chars){
           if(element >=65 && element <=90 ){
               uppercase++;
           } else if(element >=97 && element <=122){
               lowercase++;
           } else if(element >=48 && element <=57){
               numbers++;
           } else{
               specialCharacters++;
           }
        }
        int[] tablica = {uppercase,lowercase,numbers,specialCharacters};
        return tablica;
    }
}