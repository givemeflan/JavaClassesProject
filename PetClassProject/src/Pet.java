public class Pet {

    // This section is the fields for my pet. This field contains my
    // attributes/properties.
    private String name;
    private int age;
    private String location;
    private String type;

    // Here is where I will have my 2 constructors for my pet,
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    public Pet() {
        name = "Moo Moo";
        age = 27;
        location = "fishtank";
        type = "cowfish";
    }

    // My methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Main Method....
    public static void main(String[] args) {
        Pet dog = new Pet("Ein", 3, "California", "Corgi");
        // Creating an object by the name of dog because I wanted to....lol.

    }

}
