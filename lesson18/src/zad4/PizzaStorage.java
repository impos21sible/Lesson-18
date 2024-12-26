package zad4;
public class PizzaStorage {
    private final int maxVolume;
    private int pizzaCount = 0;

    public PizzaStorage(final int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int addPizza(final int count) throws TooMuchPizzaException {
        if (pizzaCount + count > maxVolume) {
            throw new TooMuchPizzaException("Невозможно добавить такое количество пиццы на склад");
        }
        pizzaCount += count;
        return pizzaCount;
    }

    public int takePizza(final int count) throws NotEnoughPizzaException {
        if (pizzaCount - count < 0) {
            throw new NotEnoughPizzaException("Недостаточное количество пиццы на складе для удаления " + count + " единиц.");
        }
        pizzaCount -= count;
        return pizzaCount;
    }



    public int getPizzaCount() {
        return pizzaCount;
    }
}
