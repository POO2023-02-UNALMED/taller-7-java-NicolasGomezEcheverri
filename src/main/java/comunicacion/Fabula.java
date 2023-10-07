package comunicacion;

public class Fabula extends Escrito {

    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        if (interpretacion == null) {
            this.interpretacion = "interpretacion";
        } else {
            this.interpretacion = interpretacion;
        }
    }

    public int palabrasTotales(int palabrasPagina) {
        return super.getPaginas() * palabrasPagina * 1;
    }

    public String toString() {
        return super.getOrigen() + "\n" + 
                super.getTitulo() + "\n" + 
                super.getAutor() + "\n" + 
                super.getPaginas() + "\n" + 
                ensenanza;
    }
}
