package TareasJava;

public class Tarea01 {
    public static void main(String[] args) {
        int años = 25;
        int mochila = 0;


        if (años >= 18 && años < 60 && mochila == 0) {
            System.out.println("Puedes ingresar.");
        } else {
            System.out.println("No puedes ingresar.");
        }
    }
}