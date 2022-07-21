package week1_Basics_CoreJava.day2;

public class Types_Of_Variables_Main_App {

        //instance variable;
        int pan_number;
        String name;

        //static variable
        static int age=5;


    public void add(){
        //local variables =>1)you have to initialise local variables at the time of declarations.
        int number1 = 10,number2 = 20;
        int sum = number1 + number2 ;

        System.out.println("Name is ::"+name+" and Pan id is::"+pan_number+" age is::"+ age++);
        System.out.println("Sum is::"+sum);

    }

    //Driver main method
    public static void main(String... args){
        //class_name reference_name = new class_name();
        //new => will help in creating DYNMAMIC memory.
        //R To L
        Types_Of_Variables_Main_App typesOfVariablesMainApp = new Types_Of_Variables_Main_App();
        typesOfVariablesMainApp.add();//5
        System.out.println("********************************");
        typesOfVariablesMainApp.pan_number=123456;
        typesOfVariablesMainApp.name="aarti";
        typesOfVariablesMainApp.add();
        System.out.println("********************************");
        age=7;
        typesOfVariablesMainApp.add();
    }
}
