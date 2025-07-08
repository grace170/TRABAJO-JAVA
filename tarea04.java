package TareasJava;

public class Tarea04 {
    public static void main(String[] args) {
        int compra1 = 100;
        int compra2 = 150;
        int compra3 = 250;

        int subtotal = compra1 + compra2 + compra3;
        System.out.println("Subtotal: " + subtotal);
        int igv = subtotal * 18 / 100;
        System.out.println("IGV: " + igv);
        int propina = subtotal * 10 / 100;
        System.out.println("Propina: " + propina);
        int total = subtotal + igv + propina;
        System.out.println("Total a pagar: " + total);

    }
}