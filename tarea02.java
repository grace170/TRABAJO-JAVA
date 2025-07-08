package TareasJava;

public class Tarea02 {
    public static void main(String[] args) {
        int cliente = 1;
        int monto = 900;
        int descuento = 0;

        if (cliente == 1 && monto >= 800) {
            descuento = monto * 10 / 100;
        } else if (cliente == 0 && monto >= 350) {
            descuento = monto * 5 / 100;
        }

        int total = monto - descuento;

        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}