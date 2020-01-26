import java.lang.*;
public class Mammal extends Animal{
    //creates blue print for all mammals
    public String bodyType = "skin";
    public String bloodType = "warm blooded";
    public String specialTrait;

    void Eat() {
        System.out.println(huntingMethods+ "\n");
        System.out.println("when young drinks milk but once matured like to eat " + food + "\n");
    }

    void Breath() {
        System.out.println("This animal breaths with lungs\n");
    }

    void Reproduce() {
        System.out.println("has sexual reproduction." + typeOfReproduction + "\n");
    }


    void Grow() {
        System.out.println(timeToMature);
    }


    void Move() {
        System.out.println("primary form of movement is walking with legs\n");
    }


    void sound(){
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
