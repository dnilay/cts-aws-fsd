package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Employee employee=Employee.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john@email.com")
                .build();
        System.out.println(employee);
    }
}
