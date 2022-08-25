package xml.example.task1;

import java.util.List;

public class Root {
    private String name;
    private List<People> people;


    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public List<People> getPeople() {
        return people;
    }


    @Override
    public String toString() {
        return "Root: " +
                "\nname: " + name  +
                "\npeople: " + people;

    }
}
