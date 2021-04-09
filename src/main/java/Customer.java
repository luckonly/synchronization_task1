public class Customer implements Runnable {

    final Shop shop;

    public Customer(Shop shop) {
        this.shop = shop;
    }

    public void buyCar() {
        shop.sellCar();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " пришел в магазин");
        buyCar();
    }

}
