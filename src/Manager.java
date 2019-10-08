import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    static Scanner scan=new Scanner(System.in);
    static ArrayList<Lecturer> lecturers=new ArrayList<>();
    static int lecSize=0;

    public static void main(String[] args) {
        while (true){
            MainMenu();
        }
    }

    public static void MainMenu(){
        String menu="(((((***The Main Menu***)))))\n" +
                                "1. Lecturer menu\n" +
                                "2. Appointment menu\n" +
                                "3. Report menu\n" +
                                "4. Exit the system";

        System.out.println(menu+"\nEnter the option number you want: ");
        int ch=scan.nextInt();

        switch (ch){
            case 1: LecturerMenu();
                    break;
            case 2: AppointmentMenu();
                    break;
            case 3: ReportMenu();
                    break;
            case 4: System.exit(0);
            default: System.out.println("Invalid number: please choose from the menu options:");
        }
    }

    public static void LecturerMenu(){
        boolean isReturn=false;
        while (!isReturn){
            String menu="*** Lecturer Menu***\n" +
                    "1. Add new Lecturer.\n" +
                    "2. Delete Lecturer.\n" +
                    "3. Show Lecturer.\n" +
                    "4. return to main menu.";

            System.out.println(menu+"\nEnter the option number: ");
            Scanner scan=new Scanner(System.in);
            int ch=scan.nextInt();

            switch (ch){
                case 1: AddLecturer();
                        break;
                case 2: DeleteLecturer();
                        break;
                case 3: ShowLecturer();
                        break;
                case 4: isReturn=true;
                default: System.out.println("Invalid number: please choose from the menu options");
            }
        }

    }

    public static void AppointmentMenu( ){
        boolean isReturn=false;
        while (!isReturn){
            String menu="***Appointment Menu***\n" +
                        "What you want to modify ?\n" +
                        "1. Add new Appointment.\n" +
                        "2. Delete Appointment.\n" +
                        "3. Postpone Appointment.\n" +
                        "4. Change appointment status.\n" +
                        "5. Return to main menu.\n";

            System.out.println(menu+"\nEnter the option number: ");
            Scanner scan=new Scanner(System.in);
            int ch=scan.nextInt();

            switch (ch){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: isReturn=true;
                default: System.out.println("Invalid number: please choose from the menu options");
            }
        }
    }

    public static void ReportMenu(  ){
        boolean isReturn=false;
        while (!isReturn){
            String menu="***Report menu***\n" +
                        "1. display all appointments for a specified day.\n" +
                        "2. display appointment for a specified lecturer.\n" +
                        "3. return to main menu.";

            System.out.println(menu+"\nEnter the option number: ");
            Scanner scan=new Scanner(System.in);
            int ch=scan.nextInt();

            switch (ch){
                case 1: break;
                case 2: break;
                case 3: isReturn=true;
                default: System.out.println("Invalid number: please choose from the menu options");
            }
        }
    }

    // Methods for lecturer class
    public static void AddLecturer(){
        char ch='n';
        do{
            System.out.println("Enter the lecturer ID: ");
            int id=scan.nextInt();

            if(SearchLecID(id)==-1){
                System.out.println("Enter the lecturer name");
                String name=scan.next();

                Lecturer lec1=new Lecturer(id,name);
                lecturers.add(lec1);
            }else {
                System.out.println("This ID is already exist");
            }
            System.out.println("Do you want to add another lecturer?(y,n)");
            ch=scan.next().charAt(0);
        }while (ch=='y'||ch=='Y');
    }

    public static void DeleteLecturer(){
        char ch='n';
        do{
            System.out.println("Enter the lecturer ID: ");
            int id=scan.nextInt();

            int i=SearchLecID(id);
            if(i!=-1){
                lecturers.remove(lecturers.get(i));
                System.out.println("The lecturer has been deleted");
            }else {
                System.out.println("This ID is not exist");
            }
            System.out.println("Do you want to delete another lecturer?(y,n)");
            ch=scan.next().charAt(0);
        }while (ch=='y'||ch=='Y');
    }

    public static void ShowLecturer(){
        int ch='n';
        do{
            System.out.println("Enter the Lecturer ID: ");
            int id=scan.nextInt();
            int i=SearchLecID(id);
            if(i!=-1){
                System.out.println(lecturers.get(i).toString());
            }else {
                System.out.println("This lecturer is not exist");
            }
            System.out.println("Would you like to show another lecturer?(y,n)");
            ch=scan.next().charAt(0);
        }while (ch=='y'||ch=='Y');
    }

    public static int SearchLecID(int id){
        for(int i=0;i<lecturers.size();i++){
            if(lecturers.get(i).getId()==id){
                return i;
            }
        }
            return -1;
    }



}
