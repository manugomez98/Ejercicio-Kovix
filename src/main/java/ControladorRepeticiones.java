/*
    Consigna
Escribí una función que reciba dos parámetros: un string S y un integer R.

La función debe devolver un string donde los caracteres consecutivos de S no se repitan más que R veces.

Tiene que devolver un string con el texto limpio y la cantidad de caracteres repetidos correcta.

Ejemplos:
Ej: "AAAAAFFFFOOOA", 2 => "AAFFOOA"
Ej: "111223333344", 1 => "1234"
Ej: "AABB", 1 => "AB"
 */



public class ControladorRepeticiones {

    public static String obtenerTextoLimpio(String cadena, Integer nroMaxDeRepeticiones){

       String caracteresRepetidos = "";

       String cadenaResultante= "";


       for(char character : cadena.toCharArray()){

           if(estaEnLaCadena(caracteresRepetidos, character) &&
                   caracteresRepetidos.length() < nroMaxDeRepeticiones){

               caracteresRepetidos += character;

               cadenaResultante += character;

           }else if(!estaEnLaCadena(caracteresRepetidos, character)){

               caracteresRepetidos = String.valueOf(character);

               cadenaResultante += character;
           }

       }

       return cadenaResultante;

    }

    public static boolean estaEnLaCadena(String unaCadena ,char character){

        return unaCadena.indexOf(character) != -1;

    }

}
