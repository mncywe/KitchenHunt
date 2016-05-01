package HibFiles;
// Generated May 1, 2016 11:31:45 PM by Hibernate Tools 4.3.1



/**
 * Image generated by hbm2java
 */
public class Image  implements java.io.Serializable {


     private Integer idimage;
     private Recipe recipe;
     private byte[] imageData;
     private String path;

    public Image() {
    }

	
    public Image(Recipe recipe) {
        this.recipe = recipe;
    }
    public Image(Recipe recipe, byte[] imageData, String path) {
       this.recipe = recipe;
       this.imageData = imageData;
       this.path = path;
    }
   
    public Integer getIdimage() {
        return this.idimage;
    }
    
    public void setIdimage(Integer idimage) {
        this.idimage = idimage;
    }
    public Recipe getRecipe() {
        return this.recipe;
    }
    
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
    public byte[] getImageData() {
        return this.imageData;
    }
    
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }




}


