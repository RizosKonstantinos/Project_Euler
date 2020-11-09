/*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem_5 {

    public static void main(String[] args) {
       int num = 1;
       boolean more = true;
       boolean divided=true;

       while(more){
           while(divided) {
               for (int i = 1; i <= 20; i++) {
                   if (!(num % i == 0)) {
                       divided = false;
                       break ;
                   }
               }
               if(divided)
                   break;
           }
           if(divided) {
               more = false;
           }
           else {
               num++;
               divided = true;
           }
       }
        System.out.println(num);
    }
}