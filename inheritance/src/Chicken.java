public class Chicken extends Animal {
    int wings = 2;
    public Chicken() {
        name = "Chicken";
        legs = 2;
    }

    @Override
    String getInfo() {
        return name + ", " + legs + ", " + wings;
    }
}
