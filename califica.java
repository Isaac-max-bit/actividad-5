import java.util.Scanner;

public class califica {

    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

        System.out.println("Bienvenido estudiante ingrese tu nota");
        float nota;
        System.out.println("Introduce tu nota: ");
        nota=a.nextFloat();

        if (nota >= 5.0) {
            System.out.println("Aprobado");
        } else if (nota >= 4.5) {
            System.out.println("Excelente");
        } else if (nota >= 4.0) {
            System.out.println("muy bien");
        }else if(nota >= 3.5){
            System.out.println("bien");
        }else if(nota >= 3.0){
            System.out.println("regular");
        }else if(nota >= 2.5){
            System.out.println("mal");
        }else if(nota >= 2.0){
            System.out.println("muy mal");
        }else if(nota >= 1.5){
            System.out.println("pésimo");
        } else{
            System.out.println("Reprobado");
        }

    }
}

