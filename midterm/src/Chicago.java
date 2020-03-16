public class Chicago extends PizzaStore {
    //overrides methods from PizzaStore so it can have values for Chicago
    String name;
    @Override
    void prepare() {
        System.out.println("Oven baked more");

    }
    @Override
    void bake() {
        System.out.println("35 mins");
    }
    @Override
    void box() {
        System.out.println("Tall box");

    }
    @Override
    void cut() {
        System.out.println("6 slices");

    }
    @Override
    public String getName() {
        return name;
    }
}

