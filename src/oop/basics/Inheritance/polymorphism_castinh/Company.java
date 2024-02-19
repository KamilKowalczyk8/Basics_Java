package oop.basics.Inheritance.polymorphism_castinh;

class Employee{
    private String name;
    private String jobTitle;
    private int salary;

    public void doWork(){
        System.out.println("Doing Work");
    }
    public Employee(){
        name="unknown";
        jobTitle = "unknown";
        salary = 4000;
    }

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println("employee "+name);
    }
}
class Manager extends Employee{
    private String departmentName;

    public Manager() {
        departmentName = "unknown";
    }

    public Manager(String name, String jobTitle, int salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }

    public void hireEmployee(){
        System.out.println("Employee hired");
    }
    public void giveRise(Employee employee){
        System.out.println("employee podwyżka");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void printInfo(){
        System.out.println("manager " + getName());
    }
}

class CEO extends Manager{
    private int sharesNumber;

    public CEO() {
        sharesNumber = 100;
    }

    public CEO(String name, String jobTitle, int salary, String departmentName, int sharesNumber) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }

    public void signContract(){
        System.out.println("Contract");
    }

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }
    public void printInfo(){
        System.out.println("Ceo " + getName());
    }
}
public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam","Programmer",10000);
        Manager manager = new Manager("Krzysztof","Manager",10000,"chuj wie");


        Employee employeeCeo = new CEO("Zdzichu","Boss",40000,"R&D",100);

        employeeCeo = manager;

        if(employeeCeo instanceof CEO){
            CEO ceo = (CEO)employeeCeo;
            ceo.signContract();
        }

    }
}
