import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AplicacionCurso {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Estudiante> listaEstudiantes = new ArrayList<>();

        //Agregar 5 estudiantes:

        for (int i = 0; i < 5; i++) {
            Estudiante estudiante = new Estudiante();
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombreEstudiante = scanner.nextLine();
            estudiante.setNombre(nombreEstudiante);

            // Agregar edad del estudiante
            System.out.println("Ingrese la edad de " + nombreEstudiante + ": ");
            int edadEstudiante = scanner.nextInt();
            estudiante.setEdad(edadEstudiante);

            // Bucle while para inscribir al estudiante a cursos

            do {
                System.out.println("Por favor ingrese el nombre de un curso al que desea inscribirse (o escriba salir): ");
                String curso = scanner.nextLine();
                if (curso.equalsIgnoreCase("salir")) {
                    break;
                } else {
                    Curso nuevoCurso = new Curso(curso);
                    estudiante.agregarCurso(nuevoCurso);
                }

            } while (true);

            listaEstudiantes.add(estudiante);
        }

    }
}