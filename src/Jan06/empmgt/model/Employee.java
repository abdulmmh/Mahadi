
package Jan06.empmgt.model;


public class Employee {
    private int id;
    private String fName;
    private String lName;
    private String desig;
    private String dept;
    private Double salary;
    private int age;
    private String addr;

    public Employee(int id, String fName, String lName, String desig, String dept, Double salary, int age, String addr) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.desig = desig;
        this.dept = dept;
        this.salary = salary;
        this.age = age;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    
}
