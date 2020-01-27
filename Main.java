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
      System.out.println("Please enter a Breakfast Option:BreakfastBurrito, BaconandEggcups, ChiaSeedPudding ");
      
      
      String op;
      while (true) {
          op = input.next();
          String ePower = "BreakfastBurrito";
          String max = "BaconandEggCups";
          String min = "ChiaSeedPudding";
          if (op.equals(ePower)) {
              System.out.println("Ingredients: 2 teaspoons canola oil    /2 small red onion, diced (1 cup) 1 red bell pepper, seeded and diced1 cup drained, rinsed canned black beans, preferably low-sodium 1/4 teaspoon chili flakes Salt and freshly ground black pepper 4 eggs and 4 egg whites 1/3 cup (about 1 1/2 ounce) shredded pepper Jack cheese Nonstick cooking spray 4 (10 inch) whole wheat tortillas (burrito size) 1/4 cup reduced fat-free sour cream 1/4 cup salsa 1 large tomato, (4 ounces) seeded and diced  1 small avocado (4 ounces), cubed ");
 System.out.println("Directions: 1.Heat the canola oil in a large nonstick skillet over a medium-high heat. Cook the onions and peppers until onions are softened and peppers are slightly charred, about 8 minutes. Add black beans and red pepper flakes and cook until warmed through, another 3 minutes. Season with salt and pepper and transfer to a dish. 2. Whisk together the eggs and egg whites then stir in the cheese. Spray the skillet with cooking spray, and reheat the skillet over a medium heat. Reduce heat to low and add eggs, scrambling until cooked through, about 3 minutes. Spread each tortilla with 1 tablespoon each sour cream and salsa, then layer with 1/4 of the black bean mixture, 1/4 of the scrambled eggs, some diced tomato and 1/4 of the avocado. Season, to taste, with hot sauce. Roll up burrito-style and serve.");
System.out.println("Yields: 4 servings ");
              
          }
          else if (op.equals(max)) {
             System.out.println("Ingredients: 12 strips sugar-free bacon (about 10 ounces  2 red potatoes, sliced 1/8 inch thick, rounded ends discarded 1 small red bell pepper, finely chopped 12 large eggs 2 tablespoons chopped fresh chives");
 System.out.println("Directions: 1. Preheat the oven to 400 degrees F. Wrap 1 piece of bacon around the inside of each cup of a 12-cup muffin tin to create rings. Put 1 slice of potato on the bottom of each cup and divide the bell pepper pieces among the cups. 2. Bake until the fat starts to render from the bacon (it will bubble in the bottom of each cup) and the bacon begins to crisp and turn light brown on the top edges, 10 to 12 minutes. 3. Remove the tin from the oven and crack an egg into each cup, making sure the yolk is inside the bacon ring. Continue baking until the bacon is crisp, the egg whites are cooked through and the yolks are still runny, about 10 minutes longer. Run an offset spatula around the edges and remove to a platter. Sprinkle with the chives and serve with hot sauce if desired.  ");
System.out.println("Yields: 12 servings  ");
              
          }
          else if (op.equals(min)) {
System.out.println("Ingredients: 1 cup vanilla-flavored unsweetened almond milk 1 cup plain low-fat (2 percent) Greek yogurt 2 tablespoons pure maple syrup (preferably grade B), plus 4 teaspoons for serving 1 teaspoon pure vanilla extract Kosher salt 1/4 cup chia seeds 1 pint strawberries, hulled and chopped 1/4 cup sliced almonds, toasted ");
 System.out.println("Directions:1. 1. In a medium bowl, gently whisk the almond milk, yogurt, 2 tablespoons maple syrup, the vanilla and 1/8 teaspoon salt until just blended. Whisk in the chia seeds; let stand 30 minutes. Stir to distribute the seeds if they have settled. Cover and refrigerate overnight.  The next day, in a medium bowl, toss the berries with the remaining 4 teaspoons maple syrup. Mix in the almonds  Spoon the pudding into 4 bowls or glasses; mound the berry mixture on top and serve.");
System.out.println("Yields: 4 servings.");
              
          }
         else {
              System.out.println("Invalid input! Enter a Breakfast Option:");
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
 
 
 
