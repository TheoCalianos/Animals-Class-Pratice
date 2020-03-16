class NYPizza extends PizzaStore{
    //overrides methods from PizzaStore so it can have values for NYPizza
    String name;
    @Override
    void prepare() {
        System.out.println("Oven baked");
    }
    @Override
    void bake() {
        System.out.println("Bake for 30 mins");
    }
    @Override
    void box() {
        System.out.println("Normal box size");
    }
    @Override
    void cut() {
        System.out.println("8 Slices");
    }
    @Override
    public String getName() {
        return name;
    }
}