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
      System.out.println("Please enter a Diet or Cleanse Option: KetoDiet, PaleoDiet, JuiceCleanse ");
      
      
      String op;
      while (true) {
          op = input.next();
          String decimaltohexadecimal = "KetoDiet";
          String hexadecimaltodecimal = "PaleoDiet";
          String decimaltooctal = "JuiceCleanse";
          if (op.equals(decimaltohexadecimal)) {
              System.out.println("The Keto Diet: This diet consists of replacing carbohydrates with fats by consuming primarily meat. This puts the body in a state of ketotis, where metabolism is increased. ");
          }
          else if (op.equals(hexadecimaltodecimal)) {
              System.out.println("The Paleo Diet: This diet is primarily focused on consuming the same types of food that our hunter-gatherer ancestors consumed thousands of years ago. Foods to consume are Meat, fish, eggs, vegetables, fruits, nuts, seeds, herbs, spices, healthy fats and oils. Foods to avoid are Processed foods, sugar, soft drinks, grains, dairy products, legumes, artificial sweeteners, vegetable oils, margarine and trans fats.");
          }
          else if (op.equals(decimaltooctal)) {
              System.out.println("Juice Cleanse: This diet is about drinking only vegetable juices. You can blend them yourself or buy them online. If you plan on blending your own juice some recommended options for vegetables are Kale, Spinach, Cucumbers, Carrots, Ginger, and even some fruits like Oranges and Apples.");
          }
          else {
              System.out.println("Invalid input! Enter a Diet or Cleanse Option:");
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
 
 
 
