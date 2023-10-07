package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma {

    private static ArrayList<String> letras = new ArrayList<String>();
    private String interpretacion;

    public Alfabeto(String origen, String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
    }

    public static ArrayList<String> getLetras() {
        return letras;
    }

    public static void setLetras(ArrayList<String> letras) {
        Alfabeto.letras = letras;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String toString() {
        return String.join(", ", letras);
    }

    public int cantidadLetras() {
        return letras.size();
    }
}
