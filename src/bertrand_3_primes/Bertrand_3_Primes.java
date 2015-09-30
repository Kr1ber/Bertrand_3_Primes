/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bertrand_3_primes;

/**
 *
 * @author Kriber
 */
public class Bertrand_3_Primes {

    /**
     * @param args
     */
    //public static void main(String[] args) {
//        for (int i = 0 ;i < 100;i++) {
//            if(i % 2 != 0){
//                if(i % 3 != 0){
//                    if(i % 5 != 0){
//                        
//                }
//            }
//                System.out.println(i+" is not even");
//            }
//        }
    public static void main(String[] args) {
        int evens = 0;
        for (int i = 0;i < 100;i++){
            if(i % 2 == 1){
                evens = evens+1;
                
                System.out.println(isEven(i));
                System.out.println(isOdd(i));
                System.out.println(isPrime(i));
                //Or evens = evens + 1;
            }
        }
        System.out.println("There are "+evens+" evens integers ");
    
    }
    /*
What is a method?
    A method is a function
    It is like a little program, e.g.
    like finding a square root, somthing you might want to do again and again.
*/
    
    
        //A return  value is the type of value you are giving back to the program
      
    /*
    A little program that communicates with other parts of the program by returning values (Most of the time)
      */      
    static boolean isEven(int somenumber){
        return (somenumber % 2 == 0);
        
       
        }
    static boolean isOdd(int someNumber){
            return (someNumber % 2 != 0);    
    }    
        static boolean isPrime(int somenumber){
            int divisor = 0;
            for(int i = 2; i < somenumber; i++) {
                if(somenumber % i == 0) {
                    divisor += 1;
                }
            }
            if(divisor > 0){
                return false;
            } else{
                return true;
            }
            //return (divisors == 0);
    }
}


