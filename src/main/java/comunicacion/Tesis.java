package comunicacion;
import java.util.ArrayList;

public class Tesis extends Escrito{

    private String idea;
    private static ArrayList<String> argumentos = new ArrayList<String>();
    private String conclusion;
    private String referencias;
    private String interpretacion;
    
    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        if (idea == null) {
            this.idea = "idea";
        } else {
            this.idea = idea;
        }
    }

    public static ArrayList<String> getArgumentos() {
        return argumentos;
    }

    public static void setArgumentos(ArrayList<String> argumentos) {
        Tesis.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        if (conclusion == null) {
            this.conclusion = "conclusion";
        } else {
            this.conclusion = conclusion;
        }
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        if (referencias == null) {
            this.referencias = "referencias";
        } else {
            this.referencias = referencias;
        }
    }

    public String interpretacion() {
        return interpretacion;
    }

    public int palabrasTotales(int palabrasPagina) {
        return super.getPaginas() * palabrasPagina * 5;
    }

    public void setInterpretacion(String interpretacion) {
        if (interpretacion == null) {
            this.interpretacion = "interpretacion";
        } else {
            this.interpretacion = interpretacion;
        }
    }

    public String toString() {
        return super.getOrigen() + "\n" + 
                super.getTitulo() + "\n" + 
                super.getAutor() + "\n" + 
                super.getPaginas() + "\n" + 
                idea + "\n" + 
                argumentos.size() + "\n" +
                conclusion + "\n" + 
                referencias;
    }


}
