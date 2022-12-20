package ar.com.codoacodo.interfaces.elementosHTML;

public class Separador implements ElementosHTML {
    @Override
    public String obtener_elemento_html() {
        return "<li><hr class=\"dropdown-divider\"></li>";
    }
}
