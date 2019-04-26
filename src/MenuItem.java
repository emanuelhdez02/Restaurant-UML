public class MenuItem {
    private Ingredient[] ingredients = new Ingredient[10];
    private String name;
    private int ingredientCount;
    private int prepTime;

    public MenuItem(String name, int prepTime){
        this.name = name;
        this.prepTime = prepTime;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient i){
        ingredients[ingredientCount] = i;
        ingredientCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getItemPrice(){
        double loss = 0;
        for (int i = 0; i < ingredientCount; i++){
            loss = loss + ingredientCount;
        }
        return loss;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int time) {
        this.prepTime = time;
    }
}
