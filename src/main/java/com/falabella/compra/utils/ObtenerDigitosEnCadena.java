package com.falabella.compra.utils;

public class ObtenerDigitosEnCadena {

    public static String getNumero(String cadena)
    {
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++ )
        {
            if(Character.isDigit(cadena_div[i]))
            {
                n+=cadena_div[i];
            }
        }
        return n;
    }
}
