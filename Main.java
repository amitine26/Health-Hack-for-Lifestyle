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
      System.out.println("Please enter a workout option: Tennis,Baseball, Basketball,Softball,Volleyball, Running,Swimming");
      
      
      String op;
      while (true) {
          op = input.next();
          String Tennis = "Tennis";
          String sin = "Baseball";
          String cos = "Basketball"; 
          String tenTo = "Softball";
          String asin = "Volleyball";
          String acos = "Running";
          String atan = "Swimming";
          String log = "Cycling";
          if (op.equals(Tennis)) {
               System.out.println("do 40 Jump ropes on alternating feet, do 8 laps around the court, do 35 lunges. You are now ready to start your tennis session!");
              
          }
          
          else if (op.equals(sin)) {
              System.out.println(" Arm Swings 20 times forward and backward, both arms 20 times side-to-side, both arms Arm, Elbow, and Wrist Circles 20 times each direction, both arms, Neck, Trunk, and Hip Rotations 20 times each direction Leg Swings 20 times forward and backward, each leg 20 times side-to-side, each leg Prisoner Squats then Skip 15 times 10 yards out and back Knee to Chest to Lunge to High Knee Skip 15 times each side 10 yards Backward Lunge with Twist to High Knee Skip 5 times each side 15 yards Side Shuffles and Carioca 20 yards out and back Side Shuffle to Sprint 25 yards out and back. " );
              
          }
          else if (op.equals(cos)) {
              System.out.println(" Arm Swings 20 times forward and backward, both arms 20 times side-to-side, both arms Arm, Elbow, and Wrist Circles 20 times each direction, both arms, Neck, Trunk, and Hip Rotations 20 times each direction Leg Swings 20 times forward and backward, each leg 20 times side-to-side, each leg Prisoner Squats then Skip 15 times 10 yards out and back Knee to Chest to Lunge to High Knee Skip 15 times each side 10 yards Backward Lunge with Twist to High Knee Skip 5 times each side 15 yards Side Shuffles and Carioca 20 yards out and back Side Shuffle to Sprint 25 yards out and back. " );
                           
                  }
          else if (op.equals(tenTo)) {
              System.out.println( "Arm Swings 20 times forward and backward, both arms 20 times side-to-side, both arms Arm, Elbow, and Wrist Circles 20 times each direction, both arms, Neck, Trunk, and Hip Rotations 20 times each direction Leg Swings 20 times forward and backward, each leg 20 times side-to-side, each leg Prisoner Squats then Skip 15 times 10 yards out and back Knee to Chest to Lunge to High Knee Skip 15 times each side 10 yards Backward Lunge with Twist to High Knee Skip 5 times each side 15 yards Side Shuffles and Carioca 20 yards out and back Side Shuffle to Sprint 25 yards out and back. ");
                            
          }
          else if (op.equals(asin)) {
              System.out.println("Volleyball Warm-Up No.1: Ball Throw A ball is needed for this drill. Find a partner and stand across the court from each other. Using your hitting arm throw the ball back and forth to each to other warming up your hitting shoulder and arm. This only needs to be done for a couple of minutes to loosen up the shoulder joint.  Volleyball Warm-Up No.2: Spike Drill A ball is needed for this drill. Find a partner and stand across the court from each other. Throw the ball up into the air and spike it down into the ground so that after once bounce it should reach your partner. Do this only as long as it takes to warm-up your shoulder.  Volleyball Warm-Up No.3: Setting Drill  A ball is needed for this drill. Standing about ten feet apart set the ball back and forth. As your forearms loosen up try and move the distance back so that you are setting from further away.  Volleyball Warm-Up No.4: Passing Drill A ball is needed for this drill. Standing about ten feet apart start passing the ball back and forth, concentrating on making good passes to your partner. Volleyball Warm-Up No.5: Pepper A ball is needed for this drill. Using a partner stand about ten feet apart from each other. The partner starting with the ball tosses it to his partner who passes the ball back to him. The partner then sets the ball back to the other partner, who in turn spikes the ball back to the other partner.");
              
          }
          else if (op.equals(acos)) {
              System.out.println("Skip: Start by skipping for 25 to 60 meters, gradually increasing the height and range of each skip as you go. Side Step/Shuffle: Step to the side, 10 to 20 meters to the right, then 10 to 20 meters to the left. You can do it walking and gradually progress to a jog. As your muscles start to warm up, you can build the intensity so that you cover as much ground as possible with as few steps as possible. Weave Step (Grapevine): Step your right foot to the right, then step your left food behind your right foot. Step right foot to the right again, but then step left foot in front of right foot. Keep repeating this for 15 to 35 meters to the right, then reverse the pattern to the left. Keep alternating between right and left. Like the Side Step/Shuffle, you can start by walking, then ramp up the intensity to a jog, trying to move as quickly as possible. Backward Jog: Start with 50-meter segments, stay light on your toes and use your arms for momentum. Butt Kick: While standing tall, walk forward as you draw heel to your glute. When this is easy, try it while jogging. Do 10 reps on each side. Too easy? Alternate butt kicks with high knees. Do five butt kicks, then do five high-knee steps. The butt kicks stretch the quads, and the “high knees” stretch the glutes. Hacky Sack: Lift up your left leg, bending your knee so it points out. Tap the inside of your left foot with your right hand without bending forward. Repeat 15 times on each side. This stimulates the balance you’re going to need when you start running. Toy Soldier: Keeping your back and knees straight, walk forward, lifting your legs straight out in front and flexing your toes. Advance this by adding a skipping motion. Do 10 reps on each side. ");
                           
          }
          else if (op.equals(atan)) {
              System.out.println("Swimming: If you are in a relatively shallow pool (about three to four feet), try a series of ten explosive squat jumps off the bottom of the pool with your hands over your head. You can increase strength in your legs, glutes, and abdominals without straining your joints.");
              
          }
          else if (op.equals(log)) {
                System.out.println("Lunges - Aim for 15-30 reps per set to keep the intensity aerobic, Planks - First work your way up to a 1 minute continuous plank with proper technique and then start adding variations, Squats - Squats are a great off-season exercise they work the glutes, hips, quads, and hamstrings. They will help you improve max strength as well as endurance, and Single-Leg Deadlift - he single leg variant of this exercise is great for cycling because it targets the hips and hamstrings and helps correct muscle imbalances since each leg has to support the load independently. ");
              
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
 
 
 
