import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private int edad;
    private List<Curso> cursos;

    public Estudiante() {
        cursos = new ArrayList<>();
    }

    public Estudiante(String nombre, int edad, List<Curso> cursos) {
        this.nombre = nombre;
        this.edad = edad;
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void borrarCurso(Curso curso) {
        cursos.remove(curso);
    }



}
