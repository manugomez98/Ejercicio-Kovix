import org.junit.Assert;
import org.junit.Test;


public class ControladorRepeticionesTest {


    @Test
    //No supera la cantidad maxima de repeticiones y retorna la misma cadena
    public void mismaCadena(){

        Assert.assertEquals(ControladorRepeticiones.obtenerTextoLimpio("AABBC", 2),"AABBC");


    }
    @Test
    //Supera la cantidad maxima de repeticiones y retorna la misma cadena
    public void cadenaModificada(){

        Assert.assertEquals(ControladorRepeticiones.obtenerTextoLimpio("AAAAAFFFFOOOA", 2),"AAFFOOA");

    }
    @Test
    //Se ingresa una lista vacia
    public void listaVacia(){

        Assert.assertEquals(ControladorRepeticiones.obtenerTextoLimpio("", 1),"");

    }

}


