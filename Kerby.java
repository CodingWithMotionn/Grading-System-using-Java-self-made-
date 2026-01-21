/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerby;
import java.util.Scanner;

/**
 *
 * @author students
 */
public class Kerby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        /**
     System Panel
     **/
       System.out.println("[------------GRADING SYSTEM------------]");
       
       /**
     Name
     **/
       
       System.out.println("Enter your name: ");
       String name = input.nextLine();
        System.out.println("Name: " + name);
        
        /**
      Quiz Grade 
     **/
        System.out.print("Enter your Quiz Grade: ");
        Float QuizGrade = input.nextFloat(); 
        System.out.println("Quiz Grade:  " + QuizGrade);
        
        /**
         Exam Grade
        **/
         System.out.print("Enter your Exam Grade: ");
        Float ExamGrade = input.nextFloat(); 
        System.out.println("Exam Grade:  " + ExamGrade);
        
        /**
         Project Grade
         **/
        System.out.print("Enter your Project Grade: ");
        Float ProjectGrade = input.nextFloat(); 
        System.out.println("Project Grade:  " + ProjectGrade);
        
        /**
         Next Output
         **/
           System.out.println(" ");
         System.out.println("[--------------------------------]");
            System.out.println(" ");
         /**
         Outcome
         **/
         
         System.out.println("Name:  " + name);
         System.out.println("Quiz Grade:  " + QuizGrade);
         System.out.println("Exam Grade:  " + ExamGrade);
         System.out.println("Project Grade:" + ProjectGrade);
         
           System.out.println(" ");
         System.out.println("[--------------------------------]");
           System.out.println(" ");
         /**
          Average Grade
          **/
         
         System.out.println("Average Grade:  " +( QuizGrade + ExamGrade + ProjectGrade)/ 3);
        
         /**
          Average Grade
          **/
         
                 if (QuizGrade + ExamGrade + ProjectGrade/ 3 > 90) 
                 { System.out.println("Your Grade is: A");}
                 else if (QuizGrade + ExamGrade + ProjectGrade/ 3 > 80)
                 {System.out.println("Your Grade is: B");}
                 else 
                {System.out.println("Your Grade is: C");}
               
                 
                 
                 
         
         
         
        
    }
    
}
