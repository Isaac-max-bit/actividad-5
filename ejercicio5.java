import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a,b,c;
        System.out.println("Ingresa 3 numeros: ");
        a = sn.nextInt();
        b = sn.nextInt();
        c = sn.nextInt();
        if(a != b && a != c && b != c){
            if (a < b) {
                if (a < c) {
                    System.out.println("El numero menor es: "+a);
                }
                else{
                    System.out.println("El numero menor es: "+c);
                }
            }
            else{
                if (b < c) {
                    System.out.println("El numero menor es: "+b);
                }
                else{
                    System.out.println("El numero menor es: "+c);
                }
            }            
        }
        else{
            System.out.println("Los numeros son iguales");
        }
    }
}
