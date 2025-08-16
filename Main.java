import model.Student;
import model.Project;
import service.Matcher;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample Students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", Arrays.asList("Java", "SQL", "Git"), "AI"));
        students.add(new Student("Bob", Arrays.asList("Python", "Machine Learning", "Git"), "AI"));
        students.add(new Student("Charlie", Arrays.asList("JavaScript", "React", "CSS"), "Web Development"));
        students.add(new Student("Diana", Arrays.asList("Java", "Spring", "SQL"), "Backend Development"));

        // Sample Projects
        List<Project> projects = new ArrayList<>();
        projects.add(new Project("AI Chatbot", Arrays.asList("Python", "Machine Learning")));
        projects.add(new Project("E-Commerce Website", Arrays.asList("JavaScript", "React", "CSS")));
        projects.add(new Project("Library Management System", Arrays.asList("Java", "SQL")));

        // Run Matchers
        Matcher.matchStudentsToProjects(students, projects);
        Matcher.matchStudentsByInterests(students);
    }
}
