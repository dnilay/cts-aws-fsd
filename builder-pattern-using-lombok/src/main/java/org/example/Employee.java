package org.example;

public class Employee {
    private String firstName;
    private String lastName;
    private String email;

    Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }


    public String toString() {
        return "Employee(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ")";
    }

    public static class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private String email;

        EmployeeBuilder() {
        }

        public EmployeeBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Employee build() {
            return new Employee(firstName, lastName, email);
        }

        public String toString() {
            return "Employee.EmployeeBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ")";
        }
    }
}
