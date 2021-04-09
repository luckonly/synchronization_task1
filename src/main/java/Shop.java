import java.util.ArrayList;
import java.util.List;

public class Shop implements Runnable {

    static List<String> carList = new ArrayList<>(10);

    final int SELL_TIME = 1000;

    public synchronized void addNewCars() {
        carList.add("Новый автомобиль");
        notify();
    }

    public synchronized void sellCar() {

        try {

            if (carList.size() == 0 ) {
                System.out.println(Thread.currentThread().getName() + " вcтал в очередь и ожидает нового автомобиля");
            }

            while (carList.size() == 0) { //Встал в очередь и ожидает нового автомобиля
                wait();
            }

            Thread.sleep(SELL_TIME);
            System.out.println(Thread.currentThread().getName() + " приобрел новенький автомобиль и уехал на нем");
            carList.remove(0);

        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }

    }

    @Override
    public void run() { //Продажа автомобиля - если нету, то заказываем новый на заводе
        System.out.println(Thread.currentThread().getName() + " пришел в магазин");
        this.sellCar();
    }

}


