import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);

        System.out.println("sheiyvane a, a≠0 ");
        float a = Input.nextFloat();

        System.out.println("sheiyvane b, b≠0 ");
        float b = Input.nextFloat();

        System.out.println("sheiyvane c, c>=0");
        float c = Input.nextFloat();

        Double Result= (Math.pow(a,3) + Math.pow(b,2)- Math.sqrt(c)) / (a * b + c);
        System.out.println("shedegi: " + Result);
    }
}
