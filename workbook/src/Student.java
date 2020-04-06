import java.util.ArrayList;

public class Student {
    //all students must have the abilty of haviing grades
    ArrayList<Integer> grades = new ArrayList<Integer>();
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrade(int grade) {
        grades.add(grade);
    }
    //does the average looping through and set average to 0 to stop double adding
    public void getaverage()
    {
        average = 0;
        for(int grade : grades)
        {
            average = average + grade;
        }
        average = average/grades.size();
    }
    String Name = "";
    int average;

}
