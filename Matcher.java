package service;
import model.Student;
import model.Project;
import java.util.*;

public class Matcher {

    // Match students to projects based on skills
    public static void matchStudentsToProjects(List<Student> students, List<Project> projects) {
        for (Project project : projects) {
            System.out.println("\nProject: " + project.getProjectName());
            System.out.println("Required Skills: " + project.getRequiredSkills());
            System.out.println("Matching Students:");

            for (Student student : students) {
                long matchedSkills = student.getSkills().stream()
                        .filter(skill -> project.getRequiredSkills().contains(skill))
                        .count();

                if (matchedSkills > 0) {
                    System.out.println("✅ " + student.getName() + " --> Skills matched: " + matchedSkills);
                }
            }
        }
    }

    // Match students with similar interests for collaboration
    public static void matchStudentsByInterests(List<Student> students) {
        System.out.println("\nStudent Collaboration Suggestions:");
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getInterest().equalsIgnoreCase(students.get(j).getInterest())) {
                    System.out.println("🤝 " + students.get(i).getName() + " & " + students.get(j).getName() 
                            + " share interest in " + students.get(i).getInterest());
                }
            }
        }
    }
}
