package com.school.schedule.app;

import java.util.Scanner; 

public class App 
{
    private static boolean studentMenu(School school, Scanner sc){
        System.out.println( "\nSTUDENT MENU" );
        System.out.println( "1. Select an existing student" );
        System.out.println( "2. Add a new student" );
        System.out.print( "Selection: " );
        String optionSelected = sc.nextLine();

        Student student;

        if (optionSelected.equals("1")){
            // Display selected student info
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
            sc.nextLine();

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
        System.out.println( "1. Add a course to the student's schedule." );
        System.out.println( "2. Add a Parent to the student." );
        System.out.println( "3. Do nothing." );
        System.out.print( "Selection: " );
        optionSelected = sc.nextLine();

        if (optionSelected.equals("1")){
            // Add a course
            Course course = getCourse(school,sc);
            if (course != null){
                student.getSchedule().addCourse(course);
            }

        } else if(optionSelected.equals("2")){
            // Add a parent
            addParentToStudent(student, sc);
        } else if (optionSelected.equals("3")){
            return false;
        } else if(optionSelected.equals("q")){
            return true;
        } else{
            System.out.println( "Invalid option selected." );
            return false;
        }

        System.out.println( "\n-----------------------------\nUpdated Student Information:\n" + student + "\n-----------------------------");
        return false;
    }

    private static boolean teacherMenu(School school, Scanner sc){
        System.out.println( "\nTEACHER MENU" );
        System.out.println( "1. Select an existing teacher" );
        System.out.println( "2. Add a new teacher" );
        System.out.print( "Selection: " );
        String optionSelected = sc.nextLine();

        Teacher teacher;

        if (optionSelected.equals("1")){
            // Select a teacher
            teacher = getTeacher(school, sc);
            if (teacher == null){
                return false;
            }
        } else if(optionSelected.equals("2")){
            //Create new teacher
            System.out.println( "\nPlease follow the prompts to enter information about the teacher." );
            System.out.print( "ID: " );
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print( "First name: " );
            String firstName = sc.nextLine();
            System.out.print( "Last name: " );
            String lastname = sc.nextLine();

            Teacher existingTeacher = school.getTeacherById(id);
            if (existingTeacher != null){
                System.out.println( "\nERROR: A teacher with id " + id + " already exists.\n");
                return false;
            }

            teacher = new Teacher(id, firstName, lastname);
            school.addTeacher(teacher);
        } else if(optionSelected.equals("q")){
            return true;
        } else{
            System.out.println( "Invalid option selected." );
            return false;
        }

        System.out.println( "\n-----------------------------\nTeacher Information:\n" + teacher + "\n-----------------------------");

        System.out.println( "\nSELECTED TEACHER OPTIONS\n" );
        System.out.println( "1. Add a course to the teacher's schedule." );
        System.out.println( "2. Do nothing." );
        System.out.print( "Selection: " );
        optionSelected = sc.nextLine();

        if (optionSelected.equals("1")){
            // Add a course
            Course course = getCourse(school,sc);
            if (course != null){
                teacher.getSchedule().addCourse(course);
            }
        } else if (optionSelected.equals("2")){
            return false;
        } else{
            System.out.println( "Invalid option selected." );
            return false;
        }

        System.out.println( "\n-----------------------------\nUpdated Teacher Information:\n" + teacher + "\n-----------------------------");
        return false;
    }

    private static boolean courseMenu(School school, Scanner sc){
        System.out.println( "\nCOURSE MENU" );
        System.out.println( "1. Select an existing course" );
        System.out.println( "2. Add a new course" );
        System.out.print( "Selection: " );
        String optionSelected = sc.nextLine();

        Course course;

        if (optionSelected.equals("1")){
            // Select a course
            course = getCourse(school,sc);
            if (course == null){
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
            Teacher teacher = getTeacher(school, sc);

            Course existingCourse = school.getCourseById(id);
            if (existingCourse != null){
                System.out.println( "\nERROR: A course with id " + id + " already exists.\n");
                return false;
            }
            course = new Course(name, id, classroom, teacher);
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

    private static void addParentToStudent(Student student, Scanner sc){
        System.out.println( "\nPlease follow the prompts to enter information about the parent." );
        System.out.print( "ID: " );
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print( "First name: " );
        String firstName = sc.nextLine();
        System.out.print( "Last name: " );
        String lastname = sc.nextLine(); 
        System.out.print( "Phone number: " );
        String phoneNumber = sc.nextLine(); 
        System.out.print( "Volunteer status (True/False): " );
        Boolean isVolunteer = sc.nextBoolean();
        sc.nextLine();

        Parent parent = new Parent(id, firstName, lastname, phoneNumber, isVolunteer);
        student.setParent(parent);
    }

    private static Course getCourse(School school, Scanner sc){
        System.out.println( "\nPlease enter the course ID." );
        System.out.print( "ID: " );
        int id = sc.nextInt();
        sc.nextLine();
        Course course = school.getCourseById(id);
        if (course == null){
            System.out.println( "\nERROR: A course with id " + id + " does not exist.\n");
        }
        return course;
    }

    private static Teacher getTeacher(School school, Scanner sc){
        System.out.print( "Teacher ID: " );
        int id = sc.nextInt();
        sc.nextLine();
        Teacher teacher = school.getTeacherById(id);
        if (teacher == null){
            System.out.println( "\nERROR: A teacher with id " + id + " does not exist.\n");
        }
        return teacher;
    }
    public static void main( String[] args )
    {   
        System.out.println( "Welcome to the School Scheduler App! " );
        System.out.println( "- Select menu options by entering their corresponding number." );
        System.out.println( "- Quit the application by entering 'q'");
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
            System.out.println( "\n-----------------------------\nSchool Information:\n" + school + "\n-----------------------------\n");
            System.out.println( "MAIN MENU" );
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
                quit = teacherMenu(school, sc);

            } else if(optionSelected.equals("3")){
                // Display courses menu options
                quit = courseMenu(school, sc);

            }else if(optionSelected.equals("q")){
                quit = true;
            } else{
                System.out.println( "Invalid option selected." );
            }

            if (!quit){
                System.out.print( "Press enter key to continue " );
                sc.nextLine(); 
            }
        }
        System.out.println( "Goodbye!" );
        sc.close();
    }
}
