public class Test {

    public static void main(String[] args) {

        Item item = Fruit.APPLE;
        System.out.println(item);

        item = item.next();
        System.out.println(item);

        item = Vegetable.POTATO;
        System.out.println(item);

        item = item.next();
        System.out.println(item);

    }

}
