package HibFiles;
// Generated May 12, 2016 7:49:18 PM by Hibernate Tools 4.3.1



/**
 * RecipeHasIngredient generated by hbm2java
 */
public class RecipeHasIngredient  implements java.io.Serializable {


     private Integer idrecipeHasIngredient;
     private Ingredient ingredient;
     private Recipe recipe;
     private Unit unit;
     private Double quantity;
     private Boolean mainIngredient;

    public RecipeHasIngredient() {
    }

	
    public RecipeHasIngredient(Ingredient ingredient, Recipe recipe, Unit unit) {
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.unit = unit;
    }
    public RecipeHasIngredient(Ingredient ingredient, Recipe recipe, Unit unit, Double quantity, Boolean mainIngredient) {
       this.ingredient = ingredient;
       this.recipe = recipe;
       this.unit = unit;
       this.quantity = quantity;
       this.mainIngredient = mainIngredient;
    }
   
    public Integer getIdrecipeHasIngredient() {
        return this.idrecipeHasIngredient;
    }
    
    public void setIdrecipeHasIngredient(Integer idrecipeHasIngredient) {
        this.idrecipeHasIngredient = idrecipeHasIngredient;
    }
    public Ingredient getIngredient() {
        return this.ingredient;
    }
    
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
    public Recipe getRecipe() {
        return this.recipe;
    }
    
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
    public Unit getUnit() {
        return this.unit;
    }
    
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    public Double getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public Boolean getMainIngredient() {
        return this.mainIngredient;
    }
    
    public void setMainIngredient(Boolean mainIngredient) {
        this.mainIngredient = mainIngredient;
    }




}


