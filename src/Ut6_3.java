import java.util.Scanner;

public class Ut6_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String palabra;

        do{
            System.out.println("Introduce una palabra: ");
            palabra = s.nextLine();

            if(palabra.charAt(0) == '0' || palabra.charAt(0) == '1' || palabra.charAt(0) == '2' || palabra.charAt(0) == '3' || palabra.charAt(0) == '4' || palabra.charAt(0) == '5' || palabra.charAt(0) == '6' || palabra.charAt(0) == '7' || palabra.charAt(0) == '8' || palabra.charAt(0) == '9' ){
                System.out.println("DÍGITOS");
            }

        }while(!palabra.equals("FIN"));
    }
}
