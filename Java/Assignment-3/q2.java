// Consider an employee class, which contains fields such as name and designation. And a
// subclass, which contains a field salary. Write a program for inheriting this relation.

class Employee {
    String name;
    String designation;
    int empNo;

    public Employee(String name, String designation, int empNo) {
        this.name = name;
        this.designation = designation;
        this.empNo = empNo;
    }

    public void display() {
        System.out.println("Employee name = " + name);
        System.out.println("Employee number = " + empNo);
        System.out.println("Employee designation = " + designation);
    }
}

class Salary extends Employee {
    double Salary;
    public Salary(String name, String designation, int empNo, double Salary) {
        super(name, designation, empNo);
        this.Salary = Salary;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Employee salary = " + Salary);
    }
}

public class q2 {
    public static void main(String[] args) {
        Salary sal = new Salary("Aaryan", "Manager", 125, 56000.00);
        sal.display();
    }
}
