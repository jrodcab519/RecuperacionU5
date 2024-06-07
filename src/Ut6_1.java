import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ut6_1 {
    public static void main(String[] args) {

        List<Integer>numeros = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        int contador = 0;
        int numero;
        int random;

        for (int i = 0; i < 10; i++) {

            numero = s.nextInt();

            if(numero < 1 || numero > 100){
                System.out.println("NO VÁLIDO, INTRODUCE OTRO");
                i--;
            } else if (numeros.contains(numero)) {
                System.out.println("REPETIDO, INTRODUCE OTRO.");
                i--;
            }else {
                numeros.add(numero);
                System.out.println("Quedan " + (10 - i) + ": " + numero);
            }
        }

        for (int i = 0; i < 20; i++) {
            random = (int) (Math.random()*99 +1);
            System.out.print(" " + random);

            if(numeros.contains(random)){
                contador++;
            }
        }






        System.out.println("\n Han coincidido " + contador + " números");
    }
}
