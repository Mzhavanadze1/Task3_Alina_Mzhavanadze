import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);

        System.out.println("Sheikvane ricxvi :");
        double number1 = Input.nextDouble();
        Input.nextLine();

        System.out.println("Sheiyvane mokmedeba(-,+,*,/) :");
        String Operacia = Input.nextLine();

        System.out.println("Sheikvane meore ricxvi:");
        double number2 = Input.nextDouble();

        if (Operacia.equals( "+")) {
            System.out.println("Jami: " + (number1 + number2));
        }
        else if (Operacia.equals("-")){
            System.out.println("Sxvaoba :"+ (number1-number2));
        } else if (Operacia.equals("*")) {
            System.out.println("Namravli:"+(number1*number2));
        } else if (Operacia.equals("/")) {
            if (number1==0 || number2==0) {
                System.out.println("0-ze gayofa ar sheidzleba!");
            }
            else {
                System.out.println("Gayofa: "+(number1/number2));
            }

        }
        else {
            System.out.println("Aravaliduri Mokmedeba!");
        }
    }
}
