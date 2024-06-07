import java.util.*;

public class ProgramaME {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<Integer, List<Integer>> sensores = new TreeMap<>();
        List<Integer> medicion= new ArrayList<>();

        int umbral;
        int id;
        int medida;

        do {
            System.out.println("Introduce el umbral a superar: ");
            umbral = s.nextInt();

                if (umbral < 1 || umbral > 10000) {
                    System.out.println("Umbral debe ser mayor que 0 y menor que 10000. ");
                }
            }while(umbral < 1 || umbral > 10000);

        do {
            System.out.println("Introduce un id y separado con un espacio una medida: ");

            String mediciones = s.nextLine();
            String [] split = mediciones.split(" ");

            id = Integer.parseInt(split[0]);
            if (id < 1 || id > 10000){
                System.out.println("ID debe ser mayor que 0 y menor que 10000.");
            }
            medida = Integer.parseInt(split[1]);
            if(medida < 1 || medida > 1000000){
                System.out.println("La medida deber ser mayor que 0 y menos que 1000000.");
            }else{
                sensores.put(id,medicion);
            }
        }while(id != 0);

        for (int in : medicion) {
            if (medida < umbral) {
                System.out.println(sensores.keySet() + " " + medida);
            }

            if (medida > umbral) {
                System.out.println(sensores.keySet() + " " + medida);
            }
        }
    }
}
