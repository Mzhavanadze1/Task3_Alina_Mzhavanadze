import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Sheiyvane USD");
        Float USD= Input.nextFloat();

        System.out.println("Sheiyvane Kursi");
        Float Kursi = Input.nextFloat();

        System.out.println("Sheiyvane sakomisio");
        Float Sakomisio = Input.nextFloat();

        Float EUR =(USD * Kursi* (1- (Sakomisio / 100)));
        System.out.println("EUR: "+ EUR);

    }
}
