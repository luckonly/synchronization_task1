import java.util.List;

public class CarProvider {

    String name;
    String mark;

    final int MAKE_NEW_CAR_TIME = 5000;

    public CarProvider(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }

    public synchronized void makeNewCar(List<String> carList) {

        System.out.println("Поступил заказ на новый автомобиль от " + Thread.currentThread().getName() + ". Начинаем производство");

        try {
            Thread.sleep(MAKE_NEW_CAR_TIME);
        } catch (InterruptedException exc) {
            System.out.println("Что-то пошло не так... ");
            exc.printStackTrace();
        }

        System.out.println("Автомобиль готов и передан в магазин для продажи");
        carList.add("Автомобиль");
        notify();

    }

}
