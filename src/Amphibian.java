public class  Amphibian extends Animal{
    //creates blue print for all amphibians
    public String bodyType = "skin";
    public String bloodType = "cold blooded";
    public String specialTrait;

    void Eat() {
        System.out.println(huntingMethods+ "\n");
        System.out.println("like to eat " + food + "\n");
    }


    void Breath() {
        System.out.println("This animal breaths with gills when young but with age develops lungs\n");
    }


    void Reproduce() {
        System.out.println("has sexual reproduction." + typeOfReproduction + "\n");
    }


    void Grow() {
        System.out.println(timeToMature);
    }


    void Move() {
        System.out.println("primary form of movement is swimming when young then walks/jumps with legs\n");
    }


    void sound() {
        if(noise != null)
        {
            System.out.println(noise);
        }
        else
        {
            System.out.println("animal is known to make little to no noise");
        }
    }
}
