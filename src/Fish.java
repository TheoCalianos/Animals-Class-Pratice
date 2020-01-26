import java.util.*;
import java.lang.*;
public class Fish extends Animal{
    //creates a base blue print for all animals under fish
    public String bodyType = "scales";
    public String bloodType = "cold blooded";
    public String specialTrait;

    //some methods are the same across all class I feel like it would have been better
    //just to make a public method eat for example as it is the same across all 3
    //subclasses but this was practice so I did not implement
    void Eat() {
        System.out.println(huntingMethods+ "\n");
        System.out.println("like to eat " + food + "\n");
    }

    void Breath() {
        System.out.println("This animal breaths with gills\n");
    }

    void Reproduce() {
        System.out.println("has sexual reproduction." + typeOfReproduction + "\n");
    }


    void Grow() {
        System.out.println(timeToMature);
    }


    void Move() {
        System.out.println("primary form of movement is swimming\n");
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
