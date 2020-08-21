package com.example.imc;

import android.util.Log;

public class ExpertoDescripcion {
    public String nombreCafe;
    public String descrip;


    public ExpertoDescripcion(String nombreCafe) {
        this.nombreCafe = nombreCafe;
        setDescrip();
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip() {

        if(nombreCafe.contentEquals("Arabica(Coffea Arabica)")){
            Log.d("Prueba ", "Entro");
            descrip = "La variedad de café Arábica es originaria de Etiopía, se caracteriza desde un punto de " +
                    "vista aromático por un sabor dulce y afrutado, en gran parte porque su grano tiene un bajo contenido en cafeína," +
                    " que se estima entre un 1,5% y 1,7%. En algunos foros está catalogado como un Gourmet Coffee.";

        }if (nombreCafe.contentEquals("Robusta(Coffea Canephora)")){
            descrip = "Esta variedad es originaria de Monrovia (Liberia), de donde toma su nombre. El aroma y sabor de este grano de" +
                    " café es muy peculiar, por lo que su consumo está muy poco extendido, se centra principalmente en los países Escandinavos. .";
 //por que con el == no me funciona ????
        }if (nombreCafe == "Liberica(Coffea Liberica)"){
            descrip="Esta variedad es originaria de Monrovia (Liberia), de donde toma su nombre. El aroma y sabor de este grano de café es muy peculiar," +
                    " por lo que su consumo está muy poco extendido, se centra principalmente en los países Escandinavos. ";
        }



    }

    public String getNombreCafe() {
        return nombreCafe;
    }

    public void setNombreCafe(String nombreCafe) {
        this.nombreCafe = nombreCafe;
        setDescrip();
    }



}
