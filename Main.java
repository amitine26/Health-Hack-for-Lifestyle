import java.util.*;
import java.lang.Math;
import java.util.regex.*;
public class Main {
  public static void main(String[] args){
      double num1;
      double num2;
      int num3;
      int num4;
      long num5;
      double num6;
      double degree;
      Scanner input = new Scanner(System.in);
    
      String ip;
      System.out.println("Please enter a workout option: Aerobicfitness,Strengthtraining, Coreexercises,Balancetraining,FlexibilityandStretching, FlexibilityandStretching");
      
      
      String op;
      while (true) {
          op = input.next();
          String plus = "Aerobicfitness";
          String minus = "Strengthtraining";  
          String divide = "Coreexercises";
          String multiply = "Balancetraining";
          String power = "FlexibilityandStretching";
          String squareRoot = "WeightLifting";
         
          if (op.equals(plus)) {
              System.out.println("Do 15 of each activity: Toe and Heel Walks for 30 meters, Skip for 30 meters, Hip Circles, Lunge in place,and Inchworn ");
              
          }
          else if (op.equals(minus)) {
              System.out.println("Do 15 of each activity: dumbbells of 20 pounds for both arms, kettlebell swing, Squats for 60 seconds, Planks for 60 seconds, and Bench press - only add more weights if you feel confident.  ");
              
          }
          else if (op.equals(multiply)) {
              System.out.println("Start in a Plank Position, and lift one arm out ahead of you. Then fan it out to the side and bring it back. Do this on the opposite side, then repeat this 20 times. ");
              
          }
          else if (op.equals(divide)) {
              System.out.println("Hold a 90 second plank.");
              
          }
          else if (op.equals(power)) {
              System.out.println("Stand upright. Roll your shoulders up, back, and down. Your thumbs should be pointing forward as you start the move. Palms point forward, elbows slightly bent, as you finish each shoulder roll. Do this until your shoulders feel loose.");
              
          }
          else if (op.equals(squareRoot)) {
              System.out.println("5 Sets of 10-15 squats. Make sure to rest for 3 minutes between sets if you are feeling tired. ");
              
          }
          else {
              System.out.println("Invalid input! Enter a Sport Option:");
          }    
      }
  }
  private static int findGCD(int num3, int num4) {
      if(num4 == 0){
          return num3;
      }
      return findGCD(num3, num3%num4);
  }
  private static int findLCM(int num3, int num4) {
      int x, max=0, min=0, lcm=0;
      if(num3>num4)
      {
          max=num3;
          min=num4;
      }
      else
      {
          max=num4;
          min=num3;
      }   
      for(int i=1;i<=min;i++){
          x=max*i;
          if(x%min==0) {
                lcm=x;
                
          }
      }
      return lcm;
  }
  private static long factorial(long num5) {
      if (num5 == 0)
          return 1;
      return num5*factorial(num5-1);
  }
}
 
 
 
