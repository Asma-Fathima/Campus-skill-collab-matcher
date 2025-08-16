package model;
import java.util.List;

public class Student {
    private String name;
    private List<String> skills;
    private String interest;

    public Student(String name, List<String> skills, String interest) {
        this.name = name;
        this.skills = skills;
        this.interest = interest;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public String getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        return name + " (Skills: " + skills + ", Interest: " + interest + ")";
    }
}
