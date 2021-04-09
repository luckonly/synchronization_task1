public class Main {

    final static long CUSTOMER_TIME = 1000L;

    public static void main(String[] args) throws InterruptedException {

        Shop shop = new Shop();
        CarProvider carProvider = new CarProvider(shop);
        Customer customer = new Customer(shop);

        new Thread(null, customer, "Иван").start();
        Thread.sleep(CUSTOMER_TIME);
        new Thread(null, customer, "Анатолий").start();
        Thread.sleep(CUSTOMER_TIME);
        new Thread(null, customer, "Сергей").start();
        Thread.sleep(CUSTOMER_TIME);
        new Thread(null, customer, "Александр").start();
        Thread.sleep(CUSTOMER_TIME);
        new Thread(null, customer, "Максим").start();
        Thread.sleep(CUSTOMER_TIME);
        new Thread(null, customer, "Елена").start();
        Thread.sleep(CUSTOMER_TIME);
        new Thread(null, customer, "Татьяна").start();
        Thread.sleep(CUSTOMER_TIME);

        new Thread(null, carProvider, "Производство автомобилей").start();
    }
}
