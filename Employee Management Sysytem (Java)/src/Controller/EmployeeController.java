package Controller;

import Model.Employee;
import Model.EmployeeDAOArray;

public class EmployeeController {

    EmployeeDAOArray dao = new EmployeeDAOArray();


    // ADD
    public boolean addEmployee(Employee employee) {

        return dao.addEmployee(employee);
    }


    // UPDATE
    public boolean updateEmployee(Employee employee) {

        return dao.updateEmployee(employee);
    }


    // DELETE
    public boolean deleteEmployee(int id) {

        return dao.deleteEmployee(id);
    }


    // SEARCH
    public Employee searchEmployee(int id) {

        return dao.searchEmployeeById(id);
    }


    // DISPLAY ALL
    public Employee[] getAllEmployees() {

        return dao.getAllEmployees();
    }


    // SORT BY ID
    public Employee[] sortById() {

        return dao.sortById();
    }


    // SORT BY SALARY
    public Employee[] sortBySalary() {

        return dao.sortBySalary();
    }


    // SORT BY NAME
    public Employee[] sortByName() {

        return dao.sortByName();
    }


    // SORT BY POST
    public Employee[] sortByPost() {

        return dao.sortByPost();
    }
}
