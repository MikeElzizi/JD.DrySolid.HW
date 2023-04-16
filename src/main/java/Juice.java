public class Juice extends Products implements Food {
    //Single Responsibility Principle - класс Juice описывает только сок, а не все продукты
    private final String name = "Сок";
    private final int price = 300;

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
        System.out.println("Сок выпит");
    }
}
