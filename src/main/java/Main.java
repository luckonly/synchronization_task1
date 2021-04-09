public class Main {

    public static void main(String[] args) throws InterruptedException {

        Shop shop = new Shop();
        CarProvider carProvider = new CarProvider(shop);

        new Thread(null, shop, "Иван").start();
        new Thread(null, shop, "Анатолий").start();
        new Thread(null, shop, "Сергей").start();
        new Thread(null, shop, "Александр").start();
        new Thread(null, shop, "Максим").start();
        new Thread(null, shop, "Елена").start();
        new Thread(null, shop, "Татьяна").start();

        new Thread(null, carProvider, "Производство автомобилей").start();
    }
}
