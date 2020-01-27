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
      System.out.println("Please enter a Lunch Option: HasselbackSweetPotatoes, Gazpacho, ChickenandBroccoliStir-Fry ");
      
      
      String op;
      while (true) {
          op = input.next();
          String gcd = "HasselbackSweetPotatoes";
          String lcm = "Gazpacho";
          String summation = "ChickenandBroccoliStir-Fry";
          if (op.equals(gcd)) {
             System.out.println("Ingredients: 4 medium sweet potatoes 1 tablespoon unsalted butter, melted 1teaspoon olive oil 1 teaspoon finely chopped fresh thyme leave 1 garlic clove, finely grated on a microplane Kosher salt and freshly ground black pepper 1/3 cup nonfat Greek-style yogurt 1 scallion, white and green parts chopped");
             
System.out.println("Directions: 1. Preheat the oven to 425 degrees F. Line a baking sheet with aluminum foil. 2. Make a series of 1/8-inch slices along each potato, slicing 2/3 of the way through. 3. Stir together the butter, oil, thyme, garlic, 1/4 teaspoon salt and 1/4 teaspoon pepper in a small bowl. Rub the potatoes all over with the mixture, getting in between the slices. 4. on the baking sheet and roast until the center of the potatoes are tender and the outside is crisp, 50 minutes to 1 hour. Halfway through the roasting time, remove the potatoes from the oven and run a fork gently across the tops of the potatoes, using light pressure, to fan the slices and separate them from one another. 5. Meanwhile, stir the yogurt and scallions with a pinch salt and a pinch pepper. Serve the sauce with the potatoes.  ");
System.out.println("Yields: 4 servings ");
              
          }
          else if (op.equals(lcm)) {
           System.out.println("Ingredients: 1 1/2 pounds vine-ripened tomatoes, peeled, seeded and chopped Tomato juice 1 cup cucumber, peeled, seeded and chopped 1/2 cup chopped red bell pepper 1/2 cup chopped red onion 1 small jalapeno, seeded and minced 1 medium garlic clove, minced 1/4 cup extra-virgin olive oil 1 lime, juiced 2 teaspoons balsamic vinegar 2 teaspoons Worcestershire sauce 1/2 teaspoon toasted, ground cumin 1 teaspoon kosher salt 1/4 teaspoon freshly ground black pepper 2 tablespoons fresh basil leaves, chiffonade");
 System.out.println("Directions: 1. Fill a 6-quart pot halfway full of water, set over high heat and bring to a boil. 2. Make an X with a paring knife on the bottom of the tomatoes. Drop the tomatoes into the boiling water for 15 seconds, remove and transfer to an ice bath and allow to cool until able to handle, approximately 1 minute. Remove and pat dry. Peel, core and seed the tomatoes. When seeding the tomatoes, place the seeds and pulp into a fine mesh strainer set over a bowl in order to catch the juice. Press as much of the juice through as possible and then add enough bottled tomato juice to bring the total to 1 cup. 3. Place the tomatoes and juice into a large mixing bowl. Add the cucumber, bell pepper, red onion, jalapeno, garlic clove, olive oil, lime juice, balsamic vinegar, Worcestershire, cumin, salt and pepper and stir to combine. Transfer 1 1/2 cups of the mixture to a blender and puree for 15 to 20 seconds on high speed. Return the pureed mixture to the bowl and stir to combine. Cover and chill for 2 hours and up to overnight. Serve with chiffonade of basil.");
     System.out.println("Yields: 4 servings");
              
          }
                   else if (op.equals(summation)) {
             System.out.println("Ingredients: 1 pound chicken breast (about 2 breasts), cubed 3 scallions, whites only, thinly sliced on a bias 2 tablespoons sugar 1 tablespoon dark sesame oil 1 tablespoon dry sherry 1 tablespoon soy sauce 2 cloves garlic, minced 1-inch piece peeled fresh ginger, minced 1 tablespoon, plus 1 teaspoon cornstarch Kosher salt and freshly ground black pepper About 1/3 cup water 3 tablespoons vegetable oil 5 to 6 cups broccoli florets and sliced stalks (keep the 2 cuts separate) 3/4 to 1 teaspoon red chili flakes, optional 1 tablespoon hoisin sauce Toasted sesame seeds, for serving, optional Jasmine rice, for serving, optional ");
System.out.println("Directions: 1. In a medium bowl, toss the chicken with the scallion whites, sugar, sesame oil, sherry, soy sauce, about half the garlic, half the ginger, 1 teaspoon of the cornstarch and 1 teaspoon salt. Marinate at room temperature for 15 minutes. Mix the remaining 1 tablespoon cornstarch with 1/3 cup water in a small bowl and reserve. 2. Heat a large nonstick skillet over high heat. Add 1 tablespoon of the vegetable oil and heat. Add the broccoli stems and stir-fry for 30 seconds. Add the florets and the remaining garlic and ginger, 2 tablespoons water, 1/4 teaspoon salt and some black pepper. Stir-fry until the broccoli is bright green but still crisp, about 2 minutes. Transfer to a plate. 3. Get the skillet good and hot again, and then heat the remaining 2 tablespoons vegetable oil. Add the chicken and red pepper flakes if using. Stir-fry until the chicken loses its raw color and gets a little brown, about 3 minutes. Add the hoisin sauce, return the broccoli to the pan and toss to heat through. Stir in the reserved cornstarch mixture and bring to a boil to thicken. Add more water if need to thin the sauce, if necessary. Taste and season with salt and pepper, if you like. 4. Mound the stir-fry on a serving platter or divide among 4 plates and garnish with sesame seeds; serve with rice.");
System.out.println("Yields: 4 servings");
          }
else {
              System.out.println("Invalid input! Enter a Lunch Option:");
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
 
 
 
