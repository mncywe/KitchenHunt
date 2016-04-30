package HibFiles;
// Generated May 1, 2016 12:33:46 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Recipe generated by hbm2java
 */
public class Recipe  implements java.io.Serializable {


     private Integer idrecipe;
     private CuisineCategory cuisineCategory;
     private FoodCategory foodCategory;
     private HealthCategory healthCategory;
     private User user;
     private String name;
     private String directions;
     private Integer servingQuantity;
     private String notes;
     private String skillLevel;
     private String preparingTime;
     private Integer overallRating;
     private Set<RecipeHasIngredient> recipeHasIngredients = new HashSet<RecipeHasIngredient>(0);
     private Set<Image> images = new HashSet<Image>(0);
     private Set<Rating> ratings = new HashSet<Rating>(0);
     private Set<Comment> comments = new HashSet<Comment>(0);

    public Recipe() {
    }

	
    public Recipe(CuisineCategory cuisineCategory, FoodCategory foodCategory, HealthCategory healthCategory, User user) {
        this.cuisineCategory = cuisineCategory;
        this.foodCategory = foodCategory;
        this.healthCategory = healthCategory;
        this.user = user;
    }
    public Recipe(CuisineCategory cuisineCategory, FoodCategory foodCategory, HealthCategory healthCategory, User user, String name, String directions, Integer servingQuantity, String notes, String skillLevel, String preparingTime, Integer overallRating, Set<RecipeHasIngredient> recipeHasIngredients, Set<Image> images, Set<Rating> ratings, Set<Comment> comments) {
       this.cuisineCategory = cuisineCategory;
       this.foodCategory = foodCategory;
       this.healthCategory = healthCategory;
       this.user = user;
       this.name = name;
       this.directions = directions;
       this.servingQuantity = servingQuantity;
       this.notes = notes;
       this.skillLevel = skillLevel;
       this.preparingTime = preparingTime;
       this.overallRating = overallRating;
       this.recipeHasIngredients = recipeHasIngredients;
       this.images = images;
       this.ratings = ratings;
       this.comments = comments;
    }
   
    public Integer getIdrecipe() {
        return this.idrecipe;
    }
    
    public void setIdrecipe(Integer idrecipe) {
        this.idrecipe = idrecipe;
    }
    public CuisineCategory getCuisineCategory() {
        return this.cuisineCategory;
    }
    
    public void setCuisineCategory(CuisineCategory cuisineCategory) {
        this.cuisineCategory = cuisineCategory;
    }
    public FoodCategory getFoodCategory() {
        return this.foodCategory;
    }
    
    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }
    public HealthCategory getHealthCategory() {
        return this.healthCategory;
    }
    
    public void setHealthCategory(HealthCategory healthCategory) {
        this.healthCategory = healthCategory;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDirections() {
        return this.directions;
    }
    
    public void setDirections(String directions) {
        this.directions = directions;
    }
    public Integer getServingQuantity() {
        return this.servingQuantity;
    }
    
    public void setServingQuantity(Integer servingQuantity) {
        this.servingQuantity = servingQuantity;
    }
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public String getSkillLevel() {
        return this.skillLevel;
    }
    
    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }
    public String getPreparingTime() {
        return this.preparingTime;
    }
    
    public void setPreparingTime(String preparingTime) {
        this.preparingTime = preparingTime;
    }
    public Integer getOverallRating() {
        return this.overallRating;
    }
    
    public void setOverallRating(Integer overallRating) {
        this.overallRating = overallRating;
    }
    public Set<RecipeHasIngredient> getRecipeHasIngredients() {
        return this.recipeHasIngredients;
    }
    
    public void setRecipeHasIngredients(Set<RecipeHasIngredient> recipeHasIngredients) {
        this.recipeHasIngredients = recipeHasIngredients;
    }
    public Set<Image> getImages() {
        return this.images;
    }
    
    public void setImages(Set<Image> images) {
        this.images = images;
    }
    public Set<Rating> getRatings() {
        return this.ratings;
    }
    
    public void setRatings(Set<Rating> ratings) {
        this.ratings = ratings;
    }
    public Set<Comment> getComments() {
        return this.comments;
    }
    
    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }




}


