import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    /*1. When would youuse aLinkedList over an ArrayList?
            2. How can you remove elements while iterating througha Collection? Write some example code.
            3. Write some code that converts a list of numbers toint[](integer array)?
            4. Write some code to do the reverse of the previous question: int[] into List?
            5. What is the best way to filter a Collection?Provide an example.
            6. Show how toconvert a List to a Set?
            7. Show how to remove duplicateelements from ArrayList?
            8. What is meant by natural ordering of a sorted collection?
            Differentiate sorting betweena Collection and a Queue.
            9. Differentiate between Collections.emptyList()vs new instance. Does this also apply to Map and Set?
            10. Collections.copy() How does this work? What are the steps?*/


            //1. LinkedList are fast at addition and deletion Arrays can be used in read only situations

            //2
            public static void main(String[] args) {
                ArrayList<String> foods = new ArrayList<String>();
                foods.add("cheese");
                foods.add("fish");
                foods.add("meat");
                Iterator i = foods.iterator();
                String sfood = "";
                for (String food: foods) {
                    System.out.println(food);
                }
                while (i.hasNext()) {
                    sfood = (String) i.next();
                    if (sfood.equals("cheese")) {
                        i.remove();
                    }
                }
                for (String food: foods) {
                    System.out.println(food);
                }

                //3
                ArrayList<Integer> ArrayList = new ArrayList<Integer>();
                int[] intArray = new int[]{ 1,3,5,7,9 };
                for(int num : intArray)
                {
                    ArrayList.add(num);
                }
                System.out.println("Arrayl list " + ArrayList);
                System.out.println("Array[] " + Arrays.toString(intArray));
                //4
                int[] reverseArray = new int[ArrayList.size()];
                Iterator b = ArrayList.iterator();
                while (b.hasNext()) {
                    int ia = 0;
                    int num2 = (int)b.next();
                    reverseArray[ia] = num2;
                    ia = ia +1;
                }
                System.out.println("Arrayl list " + ArrayList);
                System.out.println("reverseArray[] " + Arrays.toString(intArray));
            }
            //5
            //use .filter
            //6 new set = new set of (the list)
            //7 put it in a set then put it in back

}
