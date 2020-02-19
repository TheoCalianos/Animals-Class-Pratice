public class PizzaStore {
    //sets the methods so subclass can overrite them this way I can call to order pizza and know iot will return pizza while these
    //methods
    void prepare() {

    }

    void bake() {

    }

    void box() {

    }

    void cut() {

    }
    public String getName() {
        return "";
    }
    //this function handles the creation of the pizza and uses logic with ifs to figure out what type of pizza
    //it as well will return null  if the pizza doesnt exist at the store.
   static PizzaStore orderPizza(String type) {
        if (type.equals("Chicago")) {
            Chicago newPizza = new Chicago();
            newPizza.name = "Chicago";
            return newPizza;
        }
         else if (type.equals("NY")) {
            NYPizza newPizza = new NYPizza();
            newPizza.name = "NYPizza";
            return newPizza;
        }

        return null;

    }

}
