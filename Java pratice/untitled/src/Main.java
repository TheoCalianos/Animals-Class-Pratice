import javax.swing.*;

public class Main {
    //creates GUI input box then calls  to the pizza store and expects it to return a pizza or null.
    public static void main(String[] args) {
        String entry = JOptionPane.showInputDialog("Pizza Order: ");
        PizzaStore pizza = PizzaStore.orderPizza(entry);
        if(pizza != null) {
            System.out.println(pizza.getName());
            pizza.prepare();
            pizza.bake();
            pizza.box();
            pizza.cut();
        }
        else{
            System.out.println("we do not have that type of pizza");
        }


    }
}
