package ar.com.codoacodo.validator;

import java.util.ArrayList;
import java.util.List;

public class TPValidator {

    List<ITPValidator> filtro;
    public TPValidator( List<ITPValidator> elementosAVerificar ) {
        this.filtro = elementosAVerificar;
    }


    public List<String> validate() {
        List<String> temp = new ArrayList<>();

        for( ITPValidator filtro : this.filtro ) {
            if (filtro.obtener_error() != null)
                temp.add(filtro.obtener_error());
        }
        return temp;
    }
}
