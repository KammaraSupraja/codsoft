import java.util.Scanner;
import java.util.Random;
class random_num_gen{
 public static void main(String args[])
 { 
     int guess,rand_num,round=1,score=0,total_score=0;
     String str;
     Scanner sc=new Scanner(System.in);
     Random rc=new Random();
     System.out.println("######### Random number Generator ##########");
     System.out.println("Every round has 5 chances");
     do{
        System.out.println("-----ROUND "+round++ +"-------");
         rand_num=rc.nextInt(101);
        for(int limit=1;limit<=5;limit++)
        {
               System.out.println("enter your guess in the range(1-100)");
              guess=sc.nextInt();
              if(guess==rand_num)
              {
                 System.out.println("your guess is correct");
                 score=(6-limit)*10;
                 break;
              }
              else if(guess<rand_num)
                 System.out.println("your guess is too low");
              else if(guess>rand_num)
                 System.out.println("your guess is too high");

         }
         total_score+=score;
         System.out.println("you won the round");
         System.out.println("the rand_num is="+rand_num);
         System.out.println("your score ="+score);
         System.out.println("do you want to play another round(yes/no)");
         sc.nextLine();
         str=sc.nextLine();
    }while(str.equals("yes"));
    System.out.println("-------- Game over --------");
    System.out.println("scrore across all rounds="+total_score);
  }
}
