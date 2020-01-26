import java.lang.*;
public class Test {
    public static void main(String[] arg)
    {
        //creates instance of a generator
        Generator generator = new Generator();
        //sets the menagerie to the generators menagerie to avoid having to type out menagerie.generator or creating
        //a second menagerie
        Menagerie menagerie = generator.menagerie;
        //the Generate deals with the hard coded objects that were created keeping the main clean
        generator.Generate();

        //confirms that the objects were added to the collection as well as have access to methods
        Animal test = menagerie.GetAnimal("Great White Shark");
        System.out.println(test.name);
        test.Move();
        Animal test2 = menagerie.GetAnimal("poison Dart Frog");
        System.out.println(test2.name);
        test2.Move();
        Animal test3 = menagerie.GetAnimal("Human");
        System.out.println(test3.name);
        test3.Move();
        menagerie.GetAnimal("dog");
    }
}
