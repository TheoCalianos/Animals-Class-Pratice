import java.util.ArrayList;

public class Generator {
    //this class generates the animals and adds them into the collection so the main method isn't cluttered

    //creates the instance outside method to avoid duplication.
    public Menagerie menagerie = new Menagerie();
    Fish shark = new Fish();
    Amphibian frog = new Amphibian();
    Mammal human = new Mammal();
    public ArrayList<Animal> newAnimals = new java.util.ArrayList<Animal>();
    public void Generate()
    {
        shark.huntingMethods =  "detect and chomp animal";
        shark.name = "Great White Shark";
        shark.timeToMature = "33 Years";
        shark.food = "seal";
        shark.typeOfReproduction = "pregnant";
        shark.size = 3.6f;
        shark.age = 20;
        shark.appendages = 3;
        shark.weight = 1001.2f;
        shark.specialTrait = "top predator and keen senses ";
        newAnimals.add(shark);

        frog.huntingMethods =  "uses sticky tough to eat";
        frog.name = "Poison Dart Frog";
        frog.timeToMature = "1 year";
        frog.food = "insects";
        frog.typeOfReproduction = "eggs";
        frog.size = .04f;
        frog.age = 2;
        frog.appendages = 4;
        frog.weight = .0085f;
        frog.noise= "ribit";
        frog.specialTrait = "synthesize their poisons, but sequester the chemicals from arthropod prey item";
        newAnimals.add(frog);

        human.huntingMethods =  "growing livestock or plants";
        human.name = "Human";
        human.timeToMature = "23";
        human.food = "almost anything";
        human.typeOfReproduction = "pregnant";
        human.size = 1.8f;
        human.age = 19;
        human.appendages = 4;
        human.weight = 70f;
        human.noise= "speech";
        human.specialTrait = "Intelligence making them the apex predator in almost any habitat";
        newAnimals.add(human);

        //this for loop lets generate add to the menagerie collection because the
        //menagerie instance exists in this class
        for(int i = 0; i < newAnimals.size(); i++)
        {
            menagerie.AddAnimal(newAnimals.get(i));
        }

        System.out.println("Animals generated");
    }
}
