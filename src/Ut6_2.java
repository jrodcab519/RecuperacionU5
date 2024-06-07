import java.util.*;

public class Ut6_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<String> palabras = new ArrayList<>();

        String palabra;
        int contador = 0;

        do {
            System.out.println("Introduce una palabra: ");
            palabra = s.nextLine();
            System.out.println(palabra);
            if(!palabras.contains(palabra) && !palabra.equals("FIN")){
                palabras.add(palabra);
            }else{
                contador++;
            }
        }while(!palabra.equals("FIN"));

        System.out.println(palabras + " -> " + contador);

    }
}
