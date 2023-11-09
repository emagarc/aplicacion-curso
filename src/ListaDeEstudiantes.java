import java.util.List;
public class ListaDeEstudiantes {
    List<Estudiante> listaEstudiantes;

    public ListaDeEstudiantes() {
    }

    public ListaDeEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
