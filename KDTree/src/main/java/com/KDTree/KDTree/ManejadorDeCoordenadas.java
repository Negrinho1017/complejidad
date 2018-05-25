package com.KDTree.KDTree;

import java.util.ArrayList;
import java.util.List;

public class ManejadorDeCoordenadas {
    public Punto getVecinoMasCercano(Punto punto){
        return null;
    }

    public List<List<Punto>> crearMatriz(List<Punto> puntos){
        List<List<Punto>> listaTotal = new ArrayList<>();
        List<Punto> puntos11 = new ArrayList<>();
        List<Punto> puntos12 = new ArrayList<>();
        List<Punto> puntos21 = new ArrayList<>();
        List<Punto> puntos22 = new ArrayList<>();

        for(int i=0; i<puntos.size(); i++){
            if(puntos.get(i).getX()<=4 && puntos.get(i).getY()<=4){
                puntos11.add(puntos.get(i));
            }
            if(puntos.get(i).getX()<=4 && puntos.get(i).getY()>=4){
                puntos12.add(puntos.get(i));
            }
            if(puntos.get(i).getX()>=4 && puntos.get(i).getY()<=4){
                puntos21.add(puntos.get(i));
            }
            if(puntos.get(i).getX()>=4 && puntos.get(i).getY()>=4){
                puntos22.add(puntos.get(i));
            }
        }
        listaTotal.add(puntos11);
        listaTotal.add(puntos12);
        listaTotal.add(puntos21);
        listaTotal.add(puntos22);
        return listaTotal;
    }
}
