import java.util.*;

public class Department extends Employee {
    private List<Department> subordinates;

    public Department(String name, String position, int salary) {
        super(name, position, salary);
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Department subordinate) {
        this.subordinates.add(subordinate);
    }

    public void printAllEmployee() {
        System.out.println(this);
        for (Department subordinate : subordinates) {
            subordinate.printAllEmployee();
        }
    }
}

