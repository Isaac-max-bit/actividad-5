import java.util.Scanner;

public class main{
    public static void main(String[] args) {
   
        Scanner sn = new Scanner(System.in);
        int n1,n2;
        System.out.println("Introduce un número: ");
        n1=sn.nextInt();

        System.out.println("Introduce otro número: ");
        n2=sn.nextInt();
        if(n1==n2)
        System.out.println("Son iguales");
        else
        {
            if(n1>n2)
               System.out.println(n1 + " es mayor que" + n2);
            else
               System.out.println(n2 + " es mayor que " + n1);   
        }
    }
}