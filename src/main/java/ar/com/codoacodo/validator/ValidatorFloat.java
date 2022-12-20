package ar.com.codoacodo.validator;

public class ValidatorFloat implements ITPValidator {
    private final Float precio;
    private final String titulo;

    public ValidatorFloat(String titulo, Float precio) {
        this.precio = precio;
        this.titulo = titulo;
    }

    @Override
    public String obtener_error() {
        if( this.precio == null || Float.isNaN(this.precio) )
            return String.format("%s es inv&aacute;lido", this.titulo);

        return null;
    }
}
