package ar.com.codoacodo.interfaces.elementosHTML;

public class Trabajo implements ElementosHTML {
    private String titulo_proyecto;
    private String url_proyecto;

    public Trabajo(String titulo, String url) {
        this.titulo_proyecto = titulo;
        this.url_proyecto = url;
    }

    @Override
    public String obtener_elemento_html() {
        return String.format("<li><a class=\"dropdown-item\" href=\"%s\">%s</a></li>", this.url_proyecto, this.titulo_proyecto);
    }
}
