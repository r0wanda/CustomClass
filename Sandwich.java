import java.util.ArrayList;

public class Sandwich {
   private ArrayList<String> toppings;
   private int numberOfToppings;
   private double weight;
   private int calories;
   private double protein;
   private String name;
   public Sandwich() {
      name = "BLT";
      toppings = new ArrayList();
      toppings.add("bacon");
      toppings.add("lettuce");
      toppings.add("tomato");
      weight = 0.75;
      calories = 300;
      protein = 12.5;
      numberOfToppings = 3;
   }
   public Sandwich(String name, ArrayList<String> toppings, int numberOfToppings, double weight, int calories, double protein) {
      this.name = name;
      this.toppings = toppings;
      this.numberOfToppings = numberOfToppings;
      this.weight = weight;
      this.calories = calories;
      this.protein = protein;
   }
   // automatically initializes number of toppings & adds bread/wrap
   public Sandwich(String name, ArrayList<String> toppings, double weight, int calories, double protein, boolean isWrap) {
      this.name = name;
      this.toppings = toppings;
      this.numberOfToppings = toppings.size();
      this.weight = weight;
      this.calories = calories;
      this.protein = protein;
      if (isWrap) lettuceWrap();
      else addBread();
   }

   // adds topping to sandwich
   public void addTopping(String name, double weight, int calories, double protein) {
   }
   // cut the sandwich in half, halfing calories, protein, weight
   public void cutInHalf() {
   }
   // return list of ingredients
   public String ingredients() {
      return "";
   }
   // return overview of sandwich
   public String sandwichInfo() {
      return "";
   }
   // add bread on top and bottom
   public void addBread() {
   }
   // wrap in lettuce for a healthier alternative
   public void lettuceWrap() {
   }
   // grill with butter (adds calories)
   public void grill() {
   }
}