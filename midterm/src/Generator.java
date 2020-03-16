import java.lang.reflect.Array;
import java.util.ArrayList;

public class Generator {
    //generates the foods and lists for each
    Food none = new Food();
    Food bread = new Food();
    Food cheese = new Food();
    public ArrayList<Food> starters = new ArrayList<>();
    Food wings = new Food();
    Food soup = new Food();
    public ArrayList<Food> appitizers = new ArrayList<>();
    Food stakedinner = new Food();
    Food salmon = new Food();
    public ArrayList<Food> entrays = new ArrayList<>();
    Food IcedCream = new Food();
    Food PiedApple = new Food();
    public ArrayList<Food> desert = new ArrayList<>();
    public void Generate() {
        bread.name = "bread";
        bread.price = 2f;
        starters.add(bread);

        cheese.name = "cheese";
        cheese.price = 10f;
        starters.add(cheese);
        starters.add(none);

        wings.name = "wings";
        wings.price = 20.1f;
        appitizers.add(wings);

        soup.name = "soup";
        soup.price = 14.7f;
        appitizers.add(soup);
        appitizers.add(none);

        stakedinner.name = "stake dinner";
        stakedinner.price = 10000f;
        entrays.add(stakedinner);

        salmon.name = "salmon";
        salmon.price = 10000f;
        entrays.add(salmon);
        entrays.add(none);

        IcedCream.name = "Ice Cream";
        IcedCream.price = 10.23f;
        desert.add(IcedCream);

        PiedApple.name = "PiedApple";
        PiedApple.price = 1230.23f;
        desert.add(PiedApple);
        desert.add(none);
    }
}