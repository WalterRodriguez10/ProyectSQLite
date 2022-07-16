package apps.Capturar_IMG.proyectsqlite;

/* Modelo de la clase para RecyclerView*/
public class ModelRecord {
    //Variables
    String id, name, image, bio, addedTime, updatedTime;

    //Constructor

    public ModelRecord(String id, String name, String image, String bio, String addedTime, String updatedTime) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.bio = bio;
        this.addedTime = addedTime;
        this.updatedTime = updatedTime;
    }

    //Getter y Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
}
