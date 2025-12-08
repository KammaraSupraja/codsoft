import java.util.Scanner;
class student_grade_calculator{
     public static void main(String args[])
     {
          int total_marks=0;
          double avg_percentage;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter no of subjects");
          int n=sc.nextInt();
          for(int i=1;i<=n;i++)
          {
             System.out.println("enter marks(out of 100) for subject "+i);
             int marks=sc.nextInt();
             total_marks+=marks;
          }
          avg_percentage=(total_marks/n);
          System.out.println("total marks obtained ="+total_marks);
          System.out.println("average percentage ="+avg_percentage+"%");
          if(avg_percentage>90)
              System.out.println("Grade achieved: A+");
          else if(avg_percentage>80&&avg_percentage<=90)
               System.out.println("Grade achieved: A");
          else if(avg_percentage>70&&avg_percentage<=80)
               System.out.println("Grade achieved: B");
          else if(avg_percentage>60&&avg_percentage<=70)
               System.out.println("Grade achieved: C");
          else if(avg_percentage>50&&avg_percentage<=60)
               System.out.println("Grade achieved: D");
          else if(avg_percentage>40&&avg_percentage<=50)
               System.out.println("Grade achieved: E");
          else if(avg_percentage<=40)
               System.out.println("Grade achieved: FAIL");
     }
}
