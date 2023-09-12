
package mx.itson.tortilla.negocio;

/**
 * Contiene metodos para trabajar con cadenas de texto.
 * @author Propietario
 */
public class Operacion {
    
    /**
     * Separa una cadena de texto en donde encuentra el caracter guion medio.
     * @param oracion Es la oracion que sera separada en fracciones.
     * @return Array de String en cuyo cada componentee sera una fraccion de a cadena cargada.
     */
    public String[] seprar(String oracion){
       String[] resultado = oracion.split("-");
    return resultado;
    }
}
