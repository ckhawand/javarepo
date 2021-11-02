/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitesample;
- Change online
- online-2
import controller.EmployeeController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;

// Note-1: We download the sqlite tools and place it on our computer
// Note-2: to be able to use the SQLite tool from the command line we need to modify the PATH environment variable
// Note-3: create a data folder in the project
// Note-4: create the database and database file using sqlite. documentation: https://www.sqlite.org/cli.html
// Note-5: create a table inside the database using the query: CREATE TABLE employees (employee_name varchar(50), salary integer);
// Note-6: Insert data into the table: INSERT INTO employees VALUES ('John Smith', 50000);
// Note-7: save the database file with the command: .save
// Note-8: Retrieve the data using a SELECT statement: SELECT * FROM employees;
// Note-9: We need a database connector library: https://github.com/xerial/sqlite-jdbc/releases
// Note-10: We add the path to the jar file in the project's classpath properties
// Note-11: Create the model that would hold the data: Employee class
// Note-12: Create a DBConnectionProvider a class that manages the DB connection
// Note-13: Create the Controller for the model that would handle getting the data into the model and serving it to any client class






public class SQLiteSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        
        EmployeeController employeeController = new EmployeeController();
        
        
        employees = employeeController.getEmployeesList();
        
        for(Employee e : employees){
            
            System.out.println("Employee " + employees.indexOf(e) + ":");
            
            System.out.println("Name: " + e.getEmployeeName());
            
            System.out.println("Salary: " + e.getSalary());

        }
        
    }
    
}
