import java.util.Scanner;

public class Exercise {

    private static final Scanner scanner = new Scanner(System.in); //use to scan  what are typing in Keybord

    public static void main(String[] args) {

        String redColor="\u001B[31m";
        String bluecolor="\u001B[34m";
        String greenColor = "\u001B[32m";
        String resetColor = "\u001B[0m";

        double Subject_01_marks = 0.0;  
        double Subject_02_marks = 0.0;
        double Subject_03_marks = 0.0;

        //Name input and validation
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); 
        if(name == ""  || name.strip()==""){
            System.out.println("invalid Name");
            System.exit(0);
        }
        
        //Age input and validation
        System.out.print("Enter your Age: ");
        String age = scanner.nextLine(); 

        if(age == ""  || age.strip()==""){
            System.out.println("invalid Age");
            System.exit(0);
            
        }else if(Integer.valueOf(age) > 18 || Integer.valueOf(age) < 10){
            System.out.println("Age is not in range");
            System.exit(0);
        }
        
        //Subjects input and validation
        System.out.print("Enter your Subject 01: ");
        String Subject_01 = scanner.nextLine();
        if(!Subject_01.startsWith("SE-") && !Subject_01.startsWith("se-")  ){
            System.out.println("Invalid Subject 01");
            System.exit(0);
        }else{
            System.out.printf("Enter your Subject of %s Marks: ",Subject_01);
            Subject_01_marks = scanner.nextDouble();
            scanner.nextLine();
        }
        
        System.out.print("Enter your Subject 02: ");
        String Subject_02 = scanner.nextLine();
        if(!Subject_02.startsWith("SE-") && !Subject_02.startsWith("se-")){
            System.out.println("Invalid Subject 02 ");
            System.exit(0);
        }else if(Subject_02.equalsIgnoreCase(Subject_01)){
            System.out.println(" same to subject 01");
            System.exit(0);
        }else{
            System.out.printf("Enter your Subject of %s Marks: ",Subject_02);
            Subject_02_marks = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.print("Enter your Subject 03: ");
        String Subject_03 = scanner.nextLine();
        if(!Subject_03.startsWith("SE-") && !Subject_03.startsWith("se-")){
            System.out.println("Invalid Subject 02 ");
            System.exit(0);
        }else if(Subject_03.equalsIgnoreCase(Subject_01) || Subject_03.equalsIgnoreCase(Subject_02) ){
            System.out.println(" same to subject 01 or subject 02");
            System.exit(0);
        }else{
            System.out.printf("Enter your Subject of %s Marks: ",Subject_03);
            Subject_03_marks = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("\n\n\n\n\n\n\n");
        double total = Subject_01_marks + Subject_02_marks + Subject_03_marks;  
        double avg = total/3.0;

        System.out.println("+-----------+---------+---------------+");
        System.out.printf("| Name :%-38s |\n",bluecolor+name.toUpperCase()+resetColor);
        System.out.printf("| Age :%-30s |\n",age);

        if(total/3 >= 75){
            System.out.printf("| Status :%-36s |\n",greenColor+" Credit pass "+resetColor);
        }else if(total/3 >= 55 ){
            System.out.printf("| Status :%-36s |\n",bluecolor+" Pass "+resetColor);
        }else{
            System.out.printf("| Status :%-36s |\n",redColor+" Fail "+resetColor);
        }

        System.out.printf("| total is %-6.2f,   Avarage : %-6.2f |\n",total,avg);

        int substring1 = Integer.valueOf(Subject_01.substring(3, Subject_01.length()));
        int substring2 = Integer.valueOf(Subject_02.substring(3, Subject_02.length()));
        int substring3 = Integer.valueOf(Subject_03.substring(3, Subject_03.length()));

    
        System.out.println("+-----------+---------+---------------+");
        System.out.printf("|  SE-%03d   | %-7.2f | %-22s |\n",substring1,Subject_01_marks,(Subject_01_marks>=75)?greenColor+"credit pass"+resetColor:(Subject_01_marks>=55)?bluecolor+"pass"+resetColor:redColor+"fail"+resetColor);
        System.out.println("+-----------+---------+---------------+");
        System.out.printf("|  SE-%03d   | %-7.2f | %-22s |\n",substring2,Subject_02_marks,(Subject_02_marks>=75)?greenColor+"credit pass"+resetColor:(Subject_02_marks>=55)?bluecolor+"pass"+resetColor:redColor+"fail"+resetColor);
        System.out.println("+-----------+---------+---------------+");
        System.out.printf("|  SE-%03d   | %-7.2f | %-22s |\n",substring3,Subject_03_marks,(Subject_03_marks>=75)?greenColor+"credit pass"+resetColor:(Subject_03_marks>=55)?bluecolor+"pass"+resetColor:redColor+"fail"+resetColor);
        System.out.println("+-----------+---------+---------------+");
    }
}