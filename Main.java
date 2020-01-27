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
      System.out.println("Please enter a Dinner Option: Oven-bakedSalmon, Roman-StyleChicken, OilandVinegarSlaw ");
      
      
      String op;
      while (true) {
          op = input.next();
          String factorial = "Oven-bakedSalmon";
          String binarytodecimal = "Roman-StyleChicken";
          String decimaltobinary = "OilandVinegarSlaw";
          if (op.equals(factorial)) {
              System.out.println("Ingredients: 12 ounce salmon fillet, cut into 4 pieces Coarse-grained salt Freshly ground black pepper Toasted Almond Parsley Salsa, for serving Baked squash, for serving, optional Toasted Almond Parsley Salad: 1 shallot 1 tablespoons red wine vinegar Coarse grain salt 2 tablespoons capers, rinsed 1 cup fresh flat-leaf parsley 1/2 cup toasted almonds Extra-virgin olive oil ");
 System.out.println("Directions: 1. Preheat the oven to 450 degrees F. 2. Season salmon with salt and pepper. Place salmon, skin side down, on a non-stick baking sheet or in a non-stick pan with an oven-proof handle. Bake until salmon is cooked through, about 12 to 15 minutes. Serve with the Toasted Almond Parsley Salad and squash, if desired. Toasted Almond Parsley Salad: 3. Mince the shallot and add to a small bowl. Pour the vinegar over the shallots and add a pinch of salt. Let sit for 30 minutes. 4. Roughly chop the capers, parsley and almonds and add to the shallots. Add the olive oil, tasting as you go. Mix again and adjust the seasonings.");
System.out.println("Yields: 4 servings ");
          }
          else if (op.equals(binarytodecimal)) {
              System.out.println("Ingredients: 4 skinless chicken breast halves, with ribs 2 skinless chicken thighs, with bones 1/2 teaspoon salt, plus 1 teaspoon 1/2 teaspoon freshly ground black pepper, plus 1 teaspoon 1/4 cup olive oil 1 red bell pepper, sliced1 yellow bell pepper, sliced 3 ounces prosciutto, chopped 2 cloves garlic, chopped 1 (15-ounce) can diced tomatoes 1/2 cup white wine 1 tablespoon fresh thyme leaves 1 teaspoon fresh oregano leaves 1/2 cup chicken stock 2 tablespoons capers 1/4 cup chopped fresh flat-leaf parsley leaves ");
 System.out.println("Directions: 1. Season the chicken with 1/2 teaspoon salt and 1/2 teaspoon pepper. In a heavy, large skillet, heat the olive oil over medium heat. When the oil is hot, cook the chicken until browned on both sides. Remove from the pan and set aside. 2. Keeping the same pan over medium heat, add the peppers and prosciutto and cook until the peppers have browned and the prosciutto is crisp, about 5 minutes. Add the garlic and cook for 1 minute. Add the tomatoes, wine, and herbs. Using a wooden spoon, scrape the browned bits off the bottom of the pan. Return the chicken to the pan, add the stock, and bring the mixture to a boil. Reduce the heat and simmer, covered, until the chicken is cooked through, about 20 to 30 minutes. 3. If serving immediately, add the capers and the parsley. Stir to combine and serve. If making ahead of time, transfer the chicken and sauce to a storage container, cool, and refrigerate. The next day, reheat the chicken to a simmer over medium heat. Stir in the capers and the parsley and serve.");
System.out.println("Yields: 6 servings ");
          }
          else if (op.equals(decimaltobinary)) {
         System.out.println("Ingredients: 1/4 cup red wine vinegar 2 tablespoons sugar 2 tablespoons peanut or vegetable oil, eyeball it 1 sack, 16 ounces, shredded cabbage mix for slaw salads 1 teaspoon salt Salt and pepper");
 System.out.println("Direction: 1. Mix vinegar and sugar. Add oil. Add cabbage to dressing and season with salt and pepper. Toss with fingers to combine. Adjust seasoning. Let stand 20 minutes. Re-toss and serve. ");
System.out.println("Yields: 6-8 servings ");
          }
          else {
              System.out.println("Invalid input! Enter a Dinner Option:");
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
 
 
 
