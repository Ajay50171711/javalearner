package labprogram;

import java.util.*;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getSalary()
    {
        return salary;
    }

    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();

        // Adding employee details to the list
        employeeList.add(new Employee("Ajay", 20, 500000));
        employeeList.add(new Employee("Adarsh", 21,120000));
        employeeList.add(new Employee("Kamlesh", 21, 1840000));
       
        // Displaying Employee details
         Iterator itr=employeeList.iterator();  
 
        while(itr.hasNext()){  
            Employee em=(Employee)itr.next();  
            System.out.println(em.salary+" "+em.name+" "+em.age);  
        }
    }
}