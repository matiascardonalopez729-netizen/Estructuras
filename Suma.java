import java.util.Scanner;

public class Suma  {
    public static void main(String[]args)
{

    Scanner Scanner = new Scanner(System.in);

    System.out.print ("Ingrese numero 1");
    int num1 = Scanner.nextInt();
    System.out.print ("Ingrese numero 2");
    int num2 = Scanner.nextInt();

    int resultado = num1 + num2;

    System.out.print ("La suma es: "+ resultado);
    Scanner.close();
}

}