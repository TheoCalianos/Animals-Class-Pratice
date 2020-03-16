import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuUI {
    //constructors for UI
    private JComboBox<String> appitizerscomboBox;
    private JComboBox<String> entayscomboBox;
    private JComboBox<String> StarterscomboBox;
    private JComboBox<String> desertcomboBox;
    private JLabel Starters;
    private JLabel appitizers;
    private JLabel entrays;
    private JLabel desert;
    private JButton submitButton;
    private JLabel Price;
    private JPanel JPannelCombo;
    private JPanel JpanelButton;
    private JPanel JPannelMain;

    public MenuUI() {
        //creates the UI
        JFrame frame = new JFrame("MenuUI");
        frame.setContentPane(JPannelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //generates the lists of foods
        ArrayList<Object> orderedFood = new ArrayList<>();
        Generator generator = new Generator();
        generator.Generate();
        //loops trough each list and adds them to the aproprate comboBox.
        for(Food stater : generator.starters) {
            StarterscomboBox.addItem(stater.name);
        }
        for(Food appitizer : generator.appitizers)
        {
            appitizerscomboBox.addItem(appitizer.name);
        }

        for(Food entray : generator.entrays)
        {
            entayscomboBox.addItem(entray.name);
        }

        for(Food desert : generator.desert)
        {
            desertcomboBox.addItem(desert.name);
        }
        //Handles the submit event
        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //resets the price also this way the price as a number only shows when the user submits so they can know where the price will be shown
                float price = 0f;
                //gets the selected items from each comboBox
                Object start = StarterscomboBox.getSelectedItem();
                Object app = appitizerscomboBox.getSelectedItem();
                Object entray = entayscomboBox.getSelectedItem();
                Object desert = desertcomboBox.getSelectedItem();
                orderedFood.add(start);
                orderedFood.add(app);
                orderedFood.add(entray);
                orderedFood.add(desert);
                //checks if the selected item is none if not add the item for each part to order and then adds the item price to the totals.
               if(!start.equals( "none")){
                   for(Food starter :generator.starters)
                   {
                       if(starter.name == start)
                       {
                           price += starter.price;
                       }
                   }
               }
                if(!app.equals( "none")){
                    for(Food appit :generator.appitizers)
                    {
                        if(appit.name == app)
                        {
                            price += appit.price;
                        }
                    }
                }
                if(!entray.equals( "none")){
                    for(Food entrays :generator.entrays)
                    {
                        if(entrays.name == entray)
                        {
                            price += entrays.price;
                        }
                    }
                }
                if(!desert.equals( "none")){
                    for(Food deserts :generator.desert)
                    {
                        if(deserts.name == desert)
                        {
                            price += deserts.price;
                        }
                    }
                }
                //updates the price on user side plus informs kitchen on the order plus price for records.
                System.out.println(price);
                String stringPrice = Float.toString(price);
                Price.setText(stringPrice);
                System.out.print("These are the ordered foods please make them");
                for(Object ordered : orderedFood)
                {
                    System.out.print("\n" + ordered);
                }


            }
        });


    }
}
