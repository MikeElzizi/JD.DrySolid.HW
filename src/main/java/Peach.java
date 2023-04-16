public class Peach extends Products implements Food {
    //Open Closed Principle - имплементируя интерфейс Food мы добавляем
    // классу функциональности, не изменяя его код
    private final String name = "Персики";
    private final int price = 200;

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
        System.out.println("Персики съедены");
    }
}