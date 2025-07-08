# TRABAJO-JAVA
💻 Trabajo de Algoritmo en Java
🟢 Título:
Algoritmo en Java para calcular el promedio de notas de un estudiante y determinar si aprueba o desaprueba

🎯 Objetivo:
Desarrollar un programa en Java que permita al usuario ingresar varias notas, calcular el promedio y determinar si el estudiante aprueba (si el promedio es mayor o igual a 11) o desaprueba (si el promedio es menor que 11).

🔎 Descripción del algoritmo:
Inicio del programa.

Solicitar el número de notas que se ingresarán.

Crear un arreglo para almacenar las notas.

Leer cada nota ingresada por el usuario.

Suma todas las notas.

Calcular el promedio dividiendo la suma entre el número de notas.

Evaluar si el promedio es mayor o igual a 11:

Si es así, el estudiante aprueba.

De lo contrario, desaprueba.

Mostrar el promedio y el resultado.

Fin del programa.


        // Validar que el número de notas sea positivo
        if (n <= 0) {
            System.out.println("El número de notas debe ser mayor que cero.");
            return;
        }

        double[] notas = new double[n];
        double suma = 0;

        // Paso 2: Leer cada nota
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        // Paso 3: Calcular el promedio
        double promedio = suma / n;

        // Paso 4: Determinar si aprueba o desaprueba
        System.out.printf("El promedio es: %.2f%n", promedio);
        if (promedio >= 11) {
            System.out.println("El estudiante aprueba.");
        } else {
            System.out.println("El estudiante desaprueba.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
✅ Explicación del código:
Scanner scanner = new Scanner(System.in);
Se utiliza para leer los datos ingresados por el usuario desde el teclado.

Arreglo double[] notas = new double[n];
Se usa para almacenar todas las notas ingresadas.

Bucle for
Permite pedir cada nota y sumarla para luego calcular el promedio.

if-else
Evalúa si el promedio es suficiente para aprobar.

System.out.printf()
Permite imprimir el promedio con dos decimales para mejor presentación.

🟠 Conclusiones:
Se desarrolló un programa simple pero funcional que aplica estructuras básicas de control: bucles, condiciones y arreglos.

Este algoritmo puede adaptarse fácilmente para otros tipos de evaluaciones o reportes.

⭐ Recomendaciones:
Validar que las notas ingresadas estén dentro de un rango válido (por ejemplo, 0 a 20).

Agregar un menú para procesar varios estudiantes.

📄 Anexos (opcional):
Capturas de pantalla de la ejecución.

Pruebas con diferentes cantidades y valores de notas.