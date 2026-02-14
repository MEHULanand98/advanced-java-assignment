package collection;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManagement {

    public static void main(String[] args) {

        
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Mehul", "IT", "Developer", 90000.0, 6));
        employees.add(new Employee(2, "Rahil", "HR", "Manager", 75000.0, 8));
        employees.add(new Employee(3, "Ketan", "IT", "Tester", 65000.0, 4));
        employees.add(new Employee(4, "Abhishek", "Finance", "Analyst", 85000.0, 5));
        employees.add(new Employee(5, "Chandan", "IT", "Architect", 120000.0, 10));
        employees.add(new Employee(6, "anand", "HR", "Executive", 55000.0, 3));

        

        
        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("Average Salary: " + avgSalary);

        
        Employee highestSalaryEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        System.out.println("Highest Salary Employee: " + highestSalaryEmployee);

        
        List<Employee> salaryAbove80k = employees.stream()
                .filter(e -> e.getSalary() > 80000)
                .collect(Collectors.toList());

        System.out.println("\nEmployees with Salary > 80000:");
        salaryAbove80k.forEach(System.out::println);

        
        Map<String, Long> empCountByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

        System.out.println("\nNumber of Employees in Each Department:");
        empCountByDept.forEach((dept, count) ->
                System.out.println(dept + " : " + count));

        
        List<Employee> itExperiencedEmployees = employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
                .filter(e -> e.getYearOfExperience() > 5)
                .collect(Collectors.toList());

        System.out.println("\nIT Employees with > 5 Years Experience:");
        itExperiencedEmployees.forEach(System.out::println);
    }
}
