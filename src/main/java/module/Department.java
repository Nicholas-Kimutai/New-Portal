package module;

import java.util.Objects;

public class Department {
    private String name;
    private  String description;
    private int numberOfEmployees;
    private  int id;

    public Department(String name, String description, int numberOfEmployees) {
        this.name = name;
        this.description = description;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return numberOfEmployees == that.numberOfEmployees &&
                id == that.id &&
                name.equals(that.name) &&
                description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, numberOfEmployees, id);
    }
}
