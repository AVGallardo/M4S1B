import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cocina = 299990;
        int lavadora = 234540;
        int comedor = 159990;
        int televisor = 345100;
        double dolarValue = 912.24;
        int numero1;
        double numero2;
        Scanner sc = new Scanner(System.in);
        int result = cocina+lavadora+comedor+televisor;

        System.out.println("El total de su compra es: " + result);
        System.out.println("El IVA es: " + result*0.19);
        System.out.println("El total mas el IVA es: " + result*1.19);
        System.out.println("Total en dolares: " + result*dolarValue);
        System.out.println("======================================================" );
        System.out.println("======================================================" );
        System.out.print("Ingrese su peso en kilogramos: ");
        numero1=sc.nextInt();
        System.out.println("Ingrese su altura en  metros (m): ");
        numero2=sc.nextDouble();
        System.out.println("Calculando su IMC... ");
        System.out.println("Su IMC es: "+ numero1/(numero2*numero2) );
    }
}