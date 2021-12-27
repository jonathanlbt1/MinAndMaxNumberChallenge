import java.util.Scanner;

public class MinAndMaxNumberChallenge {

       public static void main(String[] args){

           Scanner scnr = new Scanner(System.in);

           int min = Integer.MAX_VALUE;
           int max = Integer.MIN_VALUE;

           while(true) {
               System.out.println("Enter number:");
               boolean isAnInt = scnr.hasNextInt();
               if (isAnInt) {
                   int userNum = scnr.nextInt();

                   if(max < userNum) {
                       max = userNum;
                   }
                   if(min > userNum) {
                       min = userNum;
                   }
               } else {
                   break;
               }
               scnr.nextLine();
           }
           System.out.println("max: " + max + "\n" + "min: " + min);
           scnr.close();
       }
}
