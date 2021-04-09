public class CarProvider implements Runnable{

    String name;
    String mark;

    final Shop shop;

    final int MAX_CAR_VALUE = 6;
    final int START_CAR_VALUE = 1;
    final int MAKE_NEW_CAR_TIME = 1000;

    public CarProvider(Shop shop) {

        this.name = "VOLKSWAGEN GROUP";
        this.mark = "Audi";
        this.shop = shop;

        for (int i = 0; i < START_CAR_VALUE; i++) {
            shop.addNewCars();
        }

    }

    public void makeNewCar() {

        for (int i = 0; i < MAX_CAR_VALUE; i++) {

            try {
                Thread.sleep(MAKE_NEW_CAR_TIME);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }

            shop.addNewCars();
            System.out.println("Автомобиль готов и передан в магазин для продажи");

        }

    }

    @Override
    public void run() {
        this.makeNewCar();
    }

}
