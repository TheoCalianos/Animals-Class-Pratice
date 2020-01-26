import java.util.*;
import java.lang.*;
public class Menagerie {
    //creates an Array List for animals to be stored in.
    public ArrayList<Animal> collection = new ArrayList<Animal>();

    public void AddAnimal(Animal animal)
    {
        //if statement is created to avoid duplication
        if(!collection.contains(animal))
        {
            collection.add(animal);
        }
    }
    public Animal GetAnimal(String name)
    {
        //loops through and trying to find the name of the desired animal is in the collection.
        for(int k=0; k < collection.size(); k++)
        {
            //the if statement compares the names and ignores caps so if the person doesn't
            //have to match the string exactly method acquired from https://howtodoinjava.com/java/string/string-equalsignorecase-method/
            // possible improvement is removing the spaces when comparing
            //in case one either forgets to space or adds and extra space.
            if(name.equalsIgnoreCase(collection.get(k).name))
            {
                return collection.get(k);
            }
        }
        //if the animal doesn't exist in the collection it is printed out and returns null
        //it returns null because if this was expanded more could be then done if the
        //desired animal was not in the collection as well as method expect to return something
        System.out.println(name + " can not be found");
        return null;
    }
}
