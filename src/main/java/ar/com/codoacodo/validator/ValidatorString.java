package ar.com.codoacodo.validator;

public class ValidatorString implements ITPValidator {
    private String str;
    private String titulo;

    public ValidatorString(String titulo, String str) {
        this.str = str;
        this.titulo = titulo;
    }

    @Override
    public String obtener_error() {
        if( this.str == null || this.str.isEmpty() )
            return String.format("%s es inv&aacute;lido", this.titulo);

        return null;
    }
}
