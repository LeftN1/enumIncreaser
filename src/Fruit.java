public enum Fruit implements Item{
    APPLE("apple"),
    PEAR("pear"),
    ORANGE("orange"),
    KIWI("kiwi");

    private String name;

    Fruit(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public Fruit next(){
        Fruit[] values = Fruit.values();
        int index = this.ordinal();
        int nextIndex = index + 1;
        nextIndex %= values.length;
        return values[nextIndex];
    }
}
