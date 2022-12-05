package com.school.schedule.app;

import java.util.Scanner; 

public class App 
{ 
    private static boolean studentMenu(School school, Scanner sc){
        System.out.println( "\nSTUDENT MENU" );
        System.out.println( "\nPlease select an option by entering the number." );
        System.out.println( "1. Select an existing student" );
        System.out.println( "2. Add a new student" );
        System.out.print( "Selection: " );
        String optionSelected = sc.nextLine();

        Student student;

        if (optionSelected.equals("1")){
            // Display list of students
            System.out.println( "\nPlease enter the student's ID." );
            System.out.print( "ID: " );
            int id = sc.nextInt();
            sc.nextLine();
            student = school.getStudentById(id);
            if (student == null){
                System.out.println( "\nERROR: A student with id " + id + " does not exist.\n");
                return false;
            }
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

            Student existingStudent = school.getStudentById(id);
            if (existingStudent != null){
                System.out.println( "\nERROR: A student with id " + id + " already exists.\n");
                return false;
            }

            student = new Student(id, firstName, lastname, gpa, null);
            school.addStudent(student);
        } else if(optionSelected.equals("q")){
            return true;
        } else{
            System.out.println( "Invalid option selected." );
            return false;
        }

        System.out.println( "\n-----------------------------\nStudent Information:\n" + student + "\n-----------------------------");

        System.out.println( "\nSELECTED STUDENT OPTIONS" );
        System.out.println( "\nPlease select an option by entering the number." );
        System.out.println( "1. Add a course to the student's schedule." );
        System.out.println( "2. Add a Parent to the student." );
        System.out.print( "Selection: " );
        optionSelected = sc.nextLine();

        if (optionSelected.equals("1")){
            // Add a course
            Course course;
            System.out.println( "\nPlease enter the course ID." );
            System.out.print( "ID: " );
            int id = sc.nextInt();
            sc.nextLine();
            course = school.getCourseById(id);
            if (course == null){
                System.out.println( "\nERROR: A course with id " + id + " does not exist.\n");
                return false;
            }
            student.getSchedule().addCourse(course);

        } else if(optionSelected.equals("2")){
            // Add a parent
        } else if(optionSelected.equals("q")){
            return true;
        } else{
            System.out.println( "Invalid option selected." );
            return false;
        }

        return false;
    }

    private static boolean courseMenu(School school, Scanner sc){
        System.out.println( "\nCOURSE MENU" );
        System.out.println( "\nPlease select an option by entering the number." );
        System.out.println( "1. Select an existing course" );
        System.out.println( "2. Add a new course" );
        System.out.print( "Selection: " );
        String optionSelected = sc.nextLine();

        Course course;

        if (optionSelected.equals("1")){
            // Select a course
            System.out.println( "\nPlease enter the course ID." );
            System.out.print( "ID: " );
            int id = sc.nextInt();
            sc.nextLine();
            course = school.getCourseById(id);
            if (course == null){
                System.out.println( "\nERROR: A course with id " + id + " does not exist.\n");
                return false;
            }
        } else if(optionSelected.equals("2")){
            System.out.println( "\nPlease follow the prompts to enter information about the course." );
            System.out.print( "name: " );
            String name = sc.nextLine();
            System.out.print( "ID: " );
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print( "classroom: " );
            String classroom = sc.nextLine(); 
            System.out.print( "teacher id: " );
            int teacherId = sc.nextInt();
            sc.nextLine();

            //TODO: get teacher

            Course existingCourse = school.getCourseById(id);
            if (existingCourse != null){
                System.out.println( "\nERROR: A course with id " + id + " already exists.\n");
                return false;
            }
            course = new Course(name, teacherId, classroom, null);
            school.addCourse(course);
        } else if(optionSelected.equals("q")){
            return true;
        } else{
            System.out.println( "Invalid option selected." );
            return false;
        }

        System.out.println( "\n-----------------------------\nCourse Information:\n" + course + "\n-----------------------------");
        return false;
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

        boolean quit = false;
        while (!quit){
            System.out.println( "\n-----------------------------\nSchool Information:\n" + school + "\n-----------------------------");
            System.out.println( "\nPlease select a menu option by entering the number." );
            System.out.println( "1. Student Menu" );
            System.out.println( "2. Teacher Menu" );
            System.out.println( "3. Courses Menu" );
            System.out.print( "Selection: " );
            String optionSelected = sc.nextLine(); 

            if (optionSelected.equals("1")){
                // Display student menu options
                quit = studentMenu(school, sc);

            } else if(optionSelected.equals("2")){
                // Display teacher menu options

            } else if(optionSelected.equals("3")){
                // Display courses menu options
                quit = courseMenu(school, sc);

            }else if(optionSelected.equals("q")){
                quit = true;
            } else{
                System.out.println( "Invalid option selected." );
                continue;
            }
        }
        System.out.println( "Goodbye!" );
        sc.close();
    }
}
