import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);

        System.out.println("sheiyvane Radius");
        float Radius = Input.nextFloat();

        System.out.println("sheiyvane Height ");
        float Height = Input.nextFloat();

        System.out.println("sheiyvane Slant Height");
        float SlantHeight = Input.nextFloat();

        Double Area= (Math.PI * Radius) * (Radius+SlantHeight);
        System.out.println("Surface Area: " + Area);

        Double Volume= (Math.PI * Math.pow(2,Radius) * Height) / 3;
        System.out.println("Volume: " + Volume);
    }
}
