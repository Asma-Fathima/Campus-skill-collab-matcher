package model;
import java.util.List;

public class Project {
    private String projectName;
    private List<String> requiredSkills;

    public Project(String projectName, List<String> requiredSkills) {
        this.projectName = projectName;
        this.requiredSkills = requiredSkills;
    }

    public String getProjectName() {
        return projectName;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    @Override
    public String toString() {
        return projectName + " (Required Skills: " + requiredSkills + ")";
    }
}
