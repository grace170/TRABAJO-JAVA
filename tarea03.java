package TareasJava;

public class Tarea03 {
    public static void main(String[] args) {
        int temperatura = 39;

        if (temperatura < 36) {
            System.out.println("Hipotermia");
        } else if (temperatura >= 36 && temperatura <= 37) {
            System.out.println("Temperatura normal");
        } else if (temperatura == 38) {
            System.out.println("Fiebre leve");
        } else {
            System.out.println("Fiebre alta");
        }
    }
}