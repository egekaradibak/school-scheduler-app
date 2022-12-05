package com.school.schedule.app;

import java.util.Scanner; 

public class App 
{ 
    private static void studentMenu(School school){
        Scanner sc = new Scanner(System.in);
        System.out.println( "\nPlease select an option by entering the number." );
        System.out.println( "1. Select an exisiting student" );
        System.out.println( "2. Add a new student" );
        System.out.print( "Selection: " );
        String optionSelected = sc.nextLine();

        Student student;

        if (optionSelected.equals("1")){
            // Display list of students
            System.out.println( "\nPlease enter the student's ID." );
            System.out.print( "ID: " );
            String studentId = sc.nextLine();
            
        } else if(optionSelected.equals("2")){
            System.out.println( "\nPlease follow the prompts to enter information about the student." );
            System.out.print( "ID: " );
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print( "First name: " );
            String firstName = sc.nextLine();
            System.out.print( "Last name: " );
            String lastname = sc.nextLine(); 
            System.out.print( "GPA: " );
            float gpa = sc.nextFloat();

            //validate ID
            //get student by ID and expect nothing
            student = new Student(id, firstName, lastname, gpa, null);

            //add student to school
            school.addStudent(student);
        } else{
            System.out.println( "Invalid option selected." );
        }
        sc.close();
    }
    public static void main( String[] args )
    {   
        System.out.println( "Welcome to the School Scheduler App! " );
        Scanner sc = new Scanner(System.in);

        System.out.println( "\nPlease follow the prompts to enter information about your school." );
        System.out.print( "Name: " );
        String schoolName = sc.nextLine(); 
        System.out.print( "Address: " );
        String schoolAddress = sc.nextLine(); 
        System.out.print( "City: " );
        String schoolCity = sc.nextLine(); 
        System.out.print( "telephone number: " );
        String schoolTelephone = sc.nextLine();
        School school = new School(schoolName, schoolAddress, schoolCity, schoolTelephone);

        while (true){
            System.out.println( "\n-----------------------------\nSchool Information:\n" + school + "\n-----------------------------");
            System.out.println( "\nPlease select a menu option by entering the number." );
            System.out.println( "1. Student Menu" );
            System.out.println( "2. Teacher Menu" );
            System.out.println( "3. Courses Menu" );
            System.out.print( "Selection: " );
            String optionSelected = sc.nextLine(); 

            if (optionSelected.equals("1")){
                // Display student menu options
                studentMenu(school);

            } else if(optionSelected.equals("2")){
                // Display teacher menu options

            } else if(optionSelected.equals("3")){
                // Display courses menu options

            } else{
                System.out.println( "Invalid option selected." );
                continue;
            }
        }
    }
}
