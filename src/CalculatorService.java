import java.util.Scanner;

public class CalculatorService{

    public static void main(String[] args) {

        //Scanner
        Scanner scn = new Scanner(System.in);

        byte pick;
        do {
            System.out.println("Calculator Service");

            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.println("Please choose what you want to do");
            pick = scn.nextByte();

            switch (pick) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    System.out.println("Thank you for using our calculator");
            }

        }
        while (pick != 5);

    }
        static void addition(){
        //Scanner
        Scanner scn = new Scanner(System.in);

        //Variables
        double num1, num2, ans;

        //First number
        System.out.println("Please enter your first number");
        num1 = scn.nextDouble();

        //Second number
        System.out.println("Please enter your second number");
        num2 = scn.nextDouble();

        //Answer
        ans = num1 + num2;
        System.out.println("Ans= " + ans);
    }
    static void subtraction(){
        //Scanner
        Scanner scn = new Scanner(System.in);

        //Variables
        double num1, num2, ans;

        //First number
        System.out.println("Please enter your first number");
        num1 = scn.nextDouble();

        //Second number
        System.out.println("Please enter your second number");
        num2 = scn.nextDouble();

        //Answer
        ans = num1 - num2;
        System.out.println("Ans= " + ans);
    }
    static void multiplication(){
        //Scanner
        Scanner scn = new Scanner(System.in);

        //Variables
        double num1, num2, ans;

        //First number
        System.out.println("Please enter your first number");
        num1 = scn.nextDouble();

        //Second number
        System.out.println("Please enter your second number");
        num2 = scn.nextDouble();

        //Answer
        ans = num1 * num2;
        System.out.println("Ans= " + ans);
    }
    static void division(){
        //Scanner
        Scanner scn = new Scanner(System.in);

        //Variables
        double num1, num2, ans;

        //First number
        System.out.println("Please enter your first number");
        num1 = scn.nextDouble();

        //Second number
        System.out.println("Please enter your second number");
        num2 = scn.nextDouble();

        //Answer
        ans = num1/num2;
        System.out.println("Ans= " + ans);
    }


    }