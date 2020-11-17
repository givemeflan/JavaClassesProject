public class SailorScout {
    public String name;
    public float height;
    public String gender;
    public String profession;
    private String weapon;
    private int age;

    public Character(String name, float height, String profession) {
        this.name = name;
        this.height = height;
        this.profession = profession;
    }

    public Character(){
        name = "Chibi Moon";
        gender = "female";
        height = 4.7f;
        profession = "child";
        weapon = "Luna";
    }

    private String getName() {
        return name;
    }

    private float getHeight() {
        return height;
    }

    public String gender(String gender) {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public static void main(String[] args) {
        Character character = new Character();
        character.setName("Chibi");
        System.out.println(character.name);
    }
}