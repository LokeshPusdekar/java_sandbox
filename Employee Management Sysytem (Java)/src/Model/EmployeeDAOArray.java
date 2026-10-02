package Model;

public class EmployeeDAOArray {

    private static Employee[] employees = new Employee[100];

    private static int count = 0;


    // ADD
    public boolean addEmployee(Employee employee) {

        if (count >= employees.length) {
            return false;
        }

        employees[count] = employee;
        count++;

        return true;
    }


    // UPDATE
    public boolean updateEmployee(Employee employee) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getId() == employee.getId()) {

                employees[i] = employee;

                return true;
            }
        }

        return false;
    }


    // DELETE
    public boolean deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getId() == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;

                count--;

                return true;
            }
        }

        return false;
    }


    // SEARCH
    public Employee searchEmployeeById(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getId() == id) {
                return employees[i];
            }
        }

        return null;
    }


    // GET ALL
    public Employee[] getAllEmployees() {

        return employees;
    }


    // SORT BY ID
    public Employee[] sortById() {

        for (int i = 0; i < count - 1; i++) {

            for (int j = i + 1; j < count; j++) {

                if (employees[i].getId() > employees[j].getId()) {

                    Employee temp = employees[i];

                    employees[i] = employees[j];

                    employees[j] = temp;
                }
            }
        }

        return employees;
    }
    
    public Employee[] sortBySalary() {

        for (int i = 0; i < count - 1; i++) {

            for (int j = i + 1; j < count; j++) {

                if (employees[i].calsal() > employees[j].calsal()) {

                    Employee temp = employees[i];

                    employees[i] = employees[j];

                    employees[j] = temp;
                }
            }
        }

        return employees;
    }
    
    public Employee[] sortByName() {

        for (int i = 0; i < count - 1; i++) {

            for (int j = i + 1; j < count; j++) {

                if (employees[i].getName()
                        .compareToIgnoreCase(employees[j].getName()) > 0) {

                    Employee temp = employees[i];

                    employees[i] = employees[j];

                    employees[j] = temp;
                }
            }
        }

        return employees;
    }
    
    public Employee[] sortByPost() {

        for (int i = 0; i < count - 1; i++) {

            for (int j = i + 1; j < count; j++) {

                if (employees[i].getPost()
                        .compareToIgnoreCase(employees[j].getPost()) > 0) {

                    Employee temp = employees[i];

                    employees[i] = employees[j];

                    employees[j] = temp;
                }
            }
        }

        return employees;
    }

}
