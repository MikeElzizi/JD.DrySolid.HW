public class Donut extends Products implements Food {
    private final String name = "Пончик";
    private final int price = 100;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Пончик съеден");
    }
}
