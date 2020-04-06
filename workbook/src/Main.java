import java.util.*;

public class Main {
    //1.linked list are faster at comparing and can do constant insertion or removals with iterators. Arrays can be fast and random read.
    public static void main(String args[]){
        Map<Integer,Student> map=new HashMap<Integer,Student>();
            Student Theo = new Student();
            Theo.setName("Theo");
            Theo.setGrade(90);
            Theo.setGrade(80);
            Theo.setGrade(75);
            map.put(1,Theo);
            Student Andrew = new Student();
            Andrew.setName("Andrew");
            Andrew.setGrade(99);
            Andrew.setGrade(90);
            Andrew.setGrade(85);
            map.put(2,Andrew);

            //Elements can traverse in any order
            for(Map.Entry m:map.entrySet()) {
                Student student = (Student) m.getValue();
                System.out.println(m.getKey() + " " + student.getName() + " " + student.getGrades());
            }
            //scanner to get users input
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Which student would you like to look up");

            String userName = myObj.nextLine();  // Read user input
            //searches all map entries to see if that student is included
            for(Map.Entry m:map.entrySet()) {
                Student student = (Student) m.getValue();
                //if the student is in the collection
                if(student.getName().equalsIgnoreCase(userName))
                {
                    //gets the current info about the student
                    System.out.println(m.getKey() + " " + student.getName() + " " + student.getGrades());
                    student.getaverage();
                    System.out.println(student.getName() + "'s average is " + student.average);
                    System.out.println("Would you like to add a grade please press 1");
                    //allows user to add info about current student grades
                    int num = myObj.nextInt();
                    if(num == 1)
                    {
                        //this way user doesnt have to research for user if they want to add more then 1 grade
                        boolean add = true;
                        while(add == true)
                        {
                            System.out.println("please enter a grade");
                            int grade = myObj.nextInt();
                            student.setGrade(grade);
                            System.out.println("would you like to enter a new grade if so press 1 else 2");
                            int num1 = myObj.nextInt();
                            //if the user messes up and presses not 1 it will end the loop instead of traping them.
                            if(num1 != 1)
                            {
                                add = false;
                            }
                        }
                        student.getaverage();
                        System.out.println("new Average " + student.average);
                    }
                }
            }
        }
}
