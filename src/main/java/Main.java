public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();

        new Thread(null, shop, "Дмитрий").start();
        new Thread(null, shop, "Иван").start();
        new Thread(null, shop, "Анатолий").start();
        new Thread(null, shop, "Сергей").start();
        new Thread(null, shop, "Александр").start();
        new Thread(null, shop, "Максим").start();
        new Thread(null, shop, "Елена").start();
        new Thread(null, shop, "Татьяна").start();

    }
}
