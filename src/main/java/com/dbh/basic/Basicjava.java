package com.dbh.basic;

import com.dbh.entity.Employee;

public class Basicjava {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "A", "a@gmqil.com", "kjdsnkjs");

        Employee e2 = Employee.builder()
                .employeeId(1)
                .name("A")
                .email("a@gmqil.com")
                .password("dslkfdsl")
                .build();

        /*Employee e3 = new Employee();
        e3.employeeId(2);
        e3.setName("B");
        e3.setEmail("b@gmail.com");
        e3.setPassword("dsfakjfaj");*/

       /* List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);*/

        /*for(int i =0; i< employees.size(); i++){
            System.out.println(employees.get(i));
        }*/

        /*for(Employee employee : employees) {
            System.out.println(employee);
        }*/

        /*employees.forEach(System.out::println);*/

        /*for (Employee employee : employees) {
            if (employee.getId() == 1) {
                System.out.println(employee);
            }
        }*/

        /*List<Employee> lists = employees.stream()
                .filter(employee -> employee.getId() == 1)
                .collect(Collectors.toList());

        lists.forEach(System.out::println);*/


/*        List<Employee> lists1 = employees.parallelStream()
                .filter(employee -> employee.getId() == 1)
                .collect(Collectors.toList());*/


        /*Set<Employee> employees = new HashSet<>(); //HashSet, TreeSet and LinkedHashSet
        employees.add(e1);
        employees.add(e1);
        employees.add(e3);
        employees.forEach(System.out::println);*/

        /*Map<Integer, Employee> map = new HashMap<>(); // HashMap, TreeMap
        map.put(1, e1);
        map.put(2, e2);
        for(Map.Entry<Integer, Employee> entry : map.entrySet()) {
            System.out.println("ID: --->  "+entry.getKey() + " VALUE --->" + entry.getValue());
        }*/
    }
}
