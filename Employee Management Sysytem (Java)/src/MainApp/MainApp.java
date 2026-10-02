package MainApp;

import java.util.Scanner;

import Model.Admin;
import Model.Employee;
import Model.HR;
import Model.Salesmanager;
import Controller.EmployeeController;

public class MainApp {

    static Scanner scan = new Scanner(System.in);

    static EmployeeController controller = new EmployeeController();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n======================================");
            System.out.println("     EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Sort All Employees");
            System.out.println("7. Exit");
            System.out.println("======================================");

            try {

                System.out.print("Enter your choice: ");
                int choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {

                case 1:
                    Create();
                    break;

                case 2:
                    Update();
                    break;

                case 3:
                    Delete();
                    break;

                case 4:
                    Search();
                    break;

                case 5:
                    Display();
                    break;

                case 6:
                    Sort();
                    break;

                case 7:
                    System.out.println("Thank you for using Employee Management System.");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1 to 7.");
                }

            } catch (Exception e) {

                System.out.println("Invalid input! Please enter the correct value.");

                scan.nextLine();
            }
        }
    }


    // =========================================================
    // CREATE / ADD EMPLOYEE
    // =========================================================

    static void Create() {

        try {

            System.out.println("\n========== ADD EMPLOYEE ==========");

            System.out.print("Enter Employee ID: ");
            int id = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = scan.nextLine();

            System.out.print("Enter Basic Salary: ");
            double salary = scan.nextDouble();
            scan.nextLine();

            System.out.println("\nSelect Employee Type:");
            System.out.println("1. HR");
            System.out.println("2. Admin");
            System.out.println("3. Sales Manager");

            System.out.print("Enter choice: ");
            int type = scan.nextInt();

            Employee employee = null;

            switch (type) {

            case 1:

                System.out.print("Enter Commission: ");
                double commission = scan.nextDouble();

                employee = new HR(
                        id,
                        name,
                        "HR",
                        salary,
                        commission
                );

                break;


            case 2:

                System.out.print("Enter Allowance: ");
                double allowance = scan.nextDouble();

                employee = new Admin(
                        id,
                        name,
                        "Admin",
                        salary,
                        allowance
                );

                break;


            case 3:

                System.out.print("Enter Incentive: ");
                double incentive = scan.nextDouble();

                System.out.print("Enter Target: ");
                int target = scan.nextInt();

                employee = new Salesmanager(
                        id,
                        name,
                        "Salesmanager",
                        salary,
                        target,
                        incentive
                );

                break;


            default:

                System.out.println("Invalid employee type.");
                return;
            }


            // Send Employee object to Controller
            boolean result = controller.addEmployee(employee);


            if (result) {

                System.out.println("\nEmployee added successfully.");

            } else {

                System.out.println("\nEmployee could not be added.");
            }

        } catch (Exception e) {

            System.out.println("Invalid input while adding employee.");

            scan.nextLine();
        }
    }


    // =========================================================
    // UPDATE EMPLOYEE
    // =========================================================

    static void Update() {

        try {

            System.out.println("\n========== UPDATE EMPLOYEE ==========");

            System.out.print("Enter Employee ID: ");
            int id = scan.nextInt();
            scan.nextLine();


            // Search employee through Controller
            Employee employee = controller.searchEmployee(id);


            if (employee == null) {

                System.out.println("Employee not found.");
                return;
            }


            System.out.println("\nEmployee Found:");
            System.out.println(employee);


            System.out.println("\nWhat do you want to update?");

            System.out.println("1. Name");
            System.out.println("2. Salary");

            if (employee instanceof HR) {

                System.out.println("3. Commission");

            } else if (employee instanceof Admin) {

                System.out.println("3. Allowance");

            } else if (employee instanceof Salesmanager) {

                System.out.println("3. Incentive");
                System.out.println("4. Target");
            }


            System.out.print("Enter choice: ");
            int choice = scan.nextInt();
            scan.nextLine();


            switch (choice) {

            case 1:

                System.out.print("Enter new Name: ");
                String name = scan.nextLine();

                employee.setName(name);

                break;


            case 2:

                System.out.print("Enter new Salary: ");
                double salary = scan.nextDouble();

                employee.setSalary(salary);

                break;


            case 3:

                if (employee instanceof HR) {

                    HR hr = (HR) employee;

                    System.out.print("Enter new Commission: ");
                    double commission = scan.nextDouble();

                    hr.setCommision(commission);

                } else if (employee instanceof Admin) {

                    Admin admin = (Admin) employee;

                    System.out.print("Enter new Allowance: ");
                    double allowance = scan.nextDouble();

                    admin.setAllowance(allowance);

                } else if (employee instanceof Salesmanager) {

                    Salesmanager sm = (Salesmanager) employee;

                    System.out.print("Enter new Incentive: ");
                    double incentive = scan.nextDouble();

                    sm.setIncentive(incentive);

                } else {

                    System.out.println("Invalid option.");
                    return;
                }

                break;


            case 4:

                if (employee instanceof Salesmanager) {

                    Salesmanager sm = (Salesmanager) employee;

                    System.out.print("Enter new Target: ");
                    int target = scan.nextInt();

                    sm.setTarget(target);

                } else {

                    System.out.println("Invalid option.");
                    return;
                }

                break;


            default:

                System.out.println("Invalid update choice.");
                return;
            }


            // Send updated employee to Controller
            boolean result = controller.updateEmployee(employee);


            if (result) {

                System.out.println("\nEmployee updated successfully.");

            } else {

                System.out.println("\nEmployee update failed.");
            }

        } catch (Exception e) {

            System.out.println("Invalid input while updating employee.");

            scan.nextLine();
        }
    }


    // =========================================================
    // DELETE EMPLOYEE
    // =========================================================

    static void Delete() {

        try {

            System.out.println("\n========== DELETE EMPLOYEE ==========");

            System.out.print("Enter Employee ID: ");
            int id = scan.nextInt();


            boolean result = controller.deleteEmployee(id);


            if (result) {

                System.out.println("Employee deleted successfully.");

            } else {

                System.out.println("Employee not found.");
            }

        } catch (Exception e) {

            System.out.println("Invalid Employee ID.");

            scan.nextLine();
        }
    }


    // =========================================================
    // SEARCH EMPLOYEE
    // =========================================================

    static void Search() {

        try {

            System.out.println("\n========== SEARCH EMPLOYEE ==========");

            System.out.print("Enter Employee ID: ");
            int id = scan.nextInt();


            Employee employee = controller.searchEmployee(id);


            if (employee != null) {

                System.out.println("\nEmployee Found:");
                System.out.println("----------------------------");

                System.out.println(employee);

                System.out.println("Calculated Salary: "+ employee.calsal() );


            } else {

                System.out.println("Employee not found.");
            }

        } catch (Exception e) {

            System.out.println("Invalid Employee ID.");

            scan.nextLine();
        }
    }


    // =========================================================
    // DISPLAY ALL EMPLOYEES
    // =========================================================

    static void Display() {

        try {

            System.out.println("\n========== ALL EMPLOYEES ==========");


            Employee[] employees =
                    controller.getAllEmployees();


            boolean found = false;


            for (int i = 0; i < employees.length; i++) {

                if (employees[i] != null) {

                    found = true;

                    System.out.println("----------------------------");

                    System.out.println(employees[i]);

                    System.out.println("Calculated Salary: "+ employees[i].calsal());
                }
            }


            if (!found) {

                System.out.println("No employees found.");
            }


            System.out.println("----------------------------");

        } 
        catch (Exception e) 
        {
        	System.out.println("Error while displaying employees.");
        }
    }


    // =========================================================
    // SORT EMPLOYEES
    // =========================================================

    static void Sort() {

        try {

            System.out.println("\n========== SORT EMPLOYEES ==========");

            System.out.println("1. Sort by ID");
            System.out.println("2. Sort by Salary");
            System.out.println("3. Sort by Name");
            System.out.println("4. Sort by Post");

            System.out.print("Enter choice: ");

            int choice = scan.nextInt();

            Employee[] employees;


            switch (choice) {

            case 1:

                employees = controller.sortById();

                System.out.println("Employees sorted by ID.");

                break;


            case 2:

                employees = controller.sortBySalary();

                System.out.println("Employees sorted by Salary.");

                break;


            case 3:

                employees = controller.sortByName();

                System.out.println("Employees sorted by Name.");

                break;


            case 4:

                employees = controller.sortByPost();

                System.out.println("Employees sorted by Post.");

                break;


            default:

                System.out.println("Invalid sorting choice.");

                return;
            }


            System.out.println("\n========== SORTED EMPLOYEES ==========");


            for (int i = 0; i < employees.length; i++) {

                if (employees[i] != null) {

                    System.out.println(employees[i]);

                    System.out.println(
                        "Calculated Salary: "
                        + employees[i].calsal()
                    );

                    System.out.println("----------------------------");
                }
            }


        } catch (Exception e) {

            System.out.println(
                "Invalid input. Please enter a valid number."
            );

            scan.nextLine();
        }
    }

}
