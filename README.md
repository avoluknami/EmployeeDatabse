Project Description
Employee Management System

The Employee Management System is a Java-based application designed to interact with a PostgreSQL relational database to manage employee data. It implements CRUD (Create, Read, Update, Delete) operations, allowing users to add, retrieve, update, and delete employee records efficiently. The system uses JDBC for database connectivity and follows Object-Oriented Programming (OOP) principles to ensure modularity and reusability.

The application consists of two main Java classes:

Employee: Represents the employee entity.
EmployeeData: Handles database operations such as inserting, retrieving, updating, and deleting records.
A demonstration is provided through a Main class, showcasing each CRUD operation in action.


Here are the instructions on how to run the Java program that interacts with the database:

1. Set up Your Database
Before running the Java program, ensure that you have:

PostgreSQL or MySQL database installed and running (depending on which database you're using).
Created the employee_db database and the employee table (or any other relevant tables) in the database as per your requirements.
2. Install Java Development Kit (JDK)
Make sure you have the Java Development Kit (JDK) installed on your machine:

Download JDK: Download JDK from Oracle
Check installation: Run the following command in your terminal or command prompt to verify the installation:
3. Install Maven (Optional, if using Maven)
If you’re using Maven to manage dependencies:

Download Maven: Download Maven
Set up Maven by following the installation instructions.
Verify Maven Installation: Run the following command to check if Maven is installed:
4. Clone the Project Repository
If the project is hosted on GitHub, clone the repository to your local machine. Use Git or download the ZIP:
5. Update Database Credentials
In your EmployeeData class, update the database connection details (like the username, password, and database name) to match your local database setup:
6. Build the Project (If using Maven)
If you're using Maven, navigate to the root of the project directory and run:
7. Run the Program
After building the project, you can run the main Java program that performs the CRUD operations:
8. Test the CRUD Operations
When you run the program, the main() method in the Main class will invoke the methods in EmployeeData for CRUD operations:

Create a new employee: A new employee record will be inserted into the database.
Get an employee by ID: The program will query the employee by ID and display their information.
Get all employees: The program will list all employees from the database.
Update an employee: The program will update an existing employee's details.
Delete an employee: The program will remove an employee from the database.
9. Troubleshooting
Connection issues: Ensure the database is running and that you’ve correctly updated the database connection details.
ClassNotFoundException: Ensure that all required dependencies (like PostgreSQL or MySQL drivers) are included in your project.
10. Review Results
The program will output to the console the results of the CRUD operations, such as displaying the list of employees or confirming whether an employee was created, updated, or deleted successfully.

<img width="1303" alt="Screenshot 2024-11-28 at 18 56 23" src="https://github.com/user-attachments/assets/e7578ea3-5ba7-4320-b7da-b7c9f5519b05">
