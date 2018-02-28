import java.util.HashMap;
import java.util.Scanner;
public class Recipe 
{
        String name;
        String ingred;
         
        public Recipe(String recipeName, String ingredients) {
            name = recipeName;
            ingred = ingredients;
        }
          
        Recipe(){
        }
         
        public static HashMap<String,String> addRecipe(){
             
            Scanner oScan =  new Scanner(System.in);
            System.out.println("How many recipes do you want to add?");
            int number= oScan.nextInt();
            HashMap<String,String> recipes = new HashMap<String,String>(number);
             
              for( int i = 1; i<=number; i++){
                 
                System.out.println("Enter a name for recipe number "+i);
                String recipeName = oScan.next();
                System.out.println("Enter the ingreditents for recipe number "+i);
                String ingredients = oScan.next();
                 
                recipes.put(recipeName,ingredients);
                }
            Recipe.main(null);
            return recipes;
          }
           
         public static void print(HashMap<String,String> recipes){
            System.out.print(recipes);
            Recipe.main(null);
         }
          
         public static void displayRecipe(HashMap<String,String> recipes)
         {
             Scanner oScan =  new Scanner(System.in);
             System.out.println ("Enter the recipe name:");
             String displayName = oScan.next();
             System.out.println (recipes.get(displayName));
             Recipe.main(null);
         }
           
        public static void main(String [] args) {
              Scanner oScan = new Scanner(System.in);
              System.out.println ("Please type the number of the operation you would "
                            + "like to perform:");
              System.out.println ("1. Add a New Recipe");
              System.out.println ("2. List All Stored Recipes");
              System.out.println ("3. Display Recipe");
              System.out.println ("4. Search for Recipes by Ingredient");
              System.out.println ("5. Close the Recipe Application");
              int answer = oScan.nextInt();
               
              if (answer == 1) {
                Recipe.addRecipe();
              } 
               
              else if (answer == 2) { 
                Recipe.print(null);
              }
               
              else if (answer == 3) {
                 Recipe.displayRecipe(null);
                  
              } 
              else if (answer == 4) {
                  
              } 
               
              else if (answer == 5) {System.exit(0);
              } 
               
              else {
                System.out.println("Error. Please Enter Number between 1 and 5.");
              }
        }
}
