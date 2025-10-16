package com.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class EmployeeTest {

	public static void main(String[] args) {

		
		List<Employee> empList = new ArrayList();
		
		empList.add(new Employee(1, "SithaRam", "Dev", "Active", 10000));
		empList.add(new Employee(2, "Govardhan", "QA", "Active", 20000));
		empList.add(new Employee(3, "Govardhan", "QA", "Active", 30000));
		empList.add(new Employee(4, "Raj", "Devops", "Inactive", 40000));
		empList.add(new Employee(5, "Geetha", "QA", "Active", 50000));
		empList.add(new Employee(6, "SRam", "Lead", "Active", 30000));
		empList.add(new Employee(7, "Charan", "Dev", "Inactive", 80000));
		empList.add(new Employee(8, "Anu", "Lead", "Active", 70000));
		empList.add(new Employee(9, "dhoni", "Devops", "Active", 60000));
		empList.add(new Employee(10, "Govardhan", "QA", "Inactive", 30000));
		empList.add(new Employee(11, "Anji", "Dev", "Inactive", 90000));

		
List<Employee> sv = empList.stream().filter(emp->emp.getDeptName().equals("Dev") && emp.getSalary() >30000).collect(Collectors.toList());
System.out.println(sv);
		
//Print Active Employee
List<Employee> actives = empList.stream().filter(emp -> "Inactive".equals(emp.getStatus())).collect(Collectors.toList());
		System.out.println("Print Active Employee------------------ : "+actives);
//Count Active Employees	
long activesCount = empList.stream().filter(emp -> "Active".equals(emp.getStatus())).count();
		System.out.println("Count Active Employee------------------ : "+activesCount);
		
//Count each department how many employees available.		
Map<String,Long> empCountDep= empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
		System.out.println("Deprtment------------------------------ : "+empCountDep);
		
//Top salary Employee
Optional<Employee> emp= empList.stream().max(Comparator.comparing(Employee::getSalary));				
System.out.println("Heighst salary Employee---------------- : "+emp);

//Top Salary Employees Of EachDept
Map<String, Optional<Employee>> TopSalaryOfEachDept= empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
		Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
System.out.println("Top Salary Of EachDept----------------- : " +TopSalaryOfEachDept);

//All the employees
Map<String, List<Employee>> ListempDep= empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.toList()));
System.out.println("ListempDep----------------------------- : " +ListempDep);


//print Active with above 50k salary employees
empList.stream().filter(e->e.getStatus().equals("Active") && e.getSalary() >50000).forEach(System.out::println);

Map<String, Map<String, Long>> result = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors
		                                                                   .groupingBy(Employee::getStatus,Collectors.counting())));
               System.out.println("Count Active and Inactivte Employees Based on Dept : "+result);    
               
             
              
           
               List<Employee> resultr = empList.stream()
            	        .filter(e -> e.getName().startsWith("S"))          // filter names starting with "S"
            	        .map(Employee::getSalary)                          // extract salaries
            	        .distinct()                                       // unique salaries
            	        .sorted(Comparator.reverseOrder())                // descending
            	        .skip(1)                                          // skip highest
            	        .findFirst()                                      // 2nd highest salary
            	        .map(secondHighest -> empList.stream()           // map to employees with that salary
            	                .filter(e -> e.getSalary() == secondHighest && e.getName().startsWith("S"))
            	                .collect(Collectors.toList())
            	        )
            	        .orElseGet(Collections::emptyList);

            	System.out.println("Employees with 2nd highest salary and name starting with S : "+resultr);
            	
            //-----------------------------------------------------------------------------------------------------------------------------
            	

             // Step 1: Group employees by department, then by name, and count occurrences
                Map<String, Map<String, Long>> emp2 = empList.stream()
                        .collect(Collectors.groupingBy(Employee::getDeptName, // Group by department name
                                 Collectors.groupingBy(Employee::getName,   // Within each department, group by employee name
                                        Collectors.counting() // Count how many times each name appears
                                )
                        ));    
             // Step 2: Iterate each department
                emp2.forEach((dept, nameMap) -> { // dept = department name, nameMap = map of name -> count
                    // Step 3: Iterate over each employee name in the department
                    nameMap.forEach((name, c) -> { // name = employee name, c = count of that name
                        // Step 4: Only print if count > 2
                        if (c > 2) {
                        	System.out.println("Department: " + dept + ", Name: " + name + ", Count: " + c);       
                            
                        }
                    });
                });

   }
	
}







































