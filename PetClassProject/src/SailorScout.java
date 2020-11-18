public class SailorScout {

    // This section is the fields for my Sailor Scout. This field contains my
    // attributes/properties.
    public String name;
    public float height;
    public String profession;

    // Constructor for Sailor Scout Character
    public Character(String name, float height, String profession) {
        this.name = name;
        this.height = height;
        this.profession = profession;
    }

    public Character(){
        name = "Chibi Moon";
        height = 4.7f;
        profession = "child";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getProfession() {
        this.profession = profession;
    }

    public void setProfession(String profession) {
        return profession;
    }

    // Main Section

    public static void main(String[] args) {
        Character character = new Character();
        System.out.println(character.name);
    }
}