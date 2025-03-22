package q23.mypack.MyPackage;

public class Student {
    int rollNo;
    String firstName;
    String middleName;
    String lastName;
    String address;
    int age;

    public Student() {}
    // Setter methods
    public void setRoll(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setfirst(String f) {
        firstName = f;
    }

    public void setMiddle(String m) {
        middleName = m;
    }

    public void setLast(String l) {
        lastName = l;
    }

    public void setAdd(String add) {
        address = add;
    }

    public void setAge(int a) {
        age = a;
    }

    // getter methods
    public int getRoll() {
        return rollNo;
    }

    public String getFirst() {
        return firstName;
    }

    public String getMiddle() {
        return middleName;
    }

    public String getLast() {
        return lastName;
    }

    public String getAdd() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
