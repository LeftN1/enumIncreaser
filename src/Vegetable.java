public enum  Vegetable implements Item {

    POTATO("potato"),
    CARROT("carrot"),
    PUMPKIN("pumpkin");


    private String name;

    Vegetable(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Vegetable next() {
        Vegetable[] values = Vegetable.values();
        int index = this.ordinal();
        int nextIndex = index + 1;
        nextIndex %= values.length;
        return values[nextIndex];
    }
}
