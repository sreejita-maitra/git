package Java8;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
    private int id;
    private String name;
    private String address;
    private double salary;

    public Employee(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int compareBySal(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Address: " + address + ", Salary: " + salary;
    }
}

public class EmployeeDetailsSorted {
	
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        
        employees.add(new Employee(1, "Mary", "Abc St", 45000));
        employees.add(new Employee(2, "Alice", "123 St", 35000));
        employees.add(new Employee(3, "Jane", "Xyz St", 60000));

        Collections.sort(employees, Employee::compareBySal);

        System.out.println("Employee details sorted by salary:");
        employees.forEach(System.out::println);
    }
}

