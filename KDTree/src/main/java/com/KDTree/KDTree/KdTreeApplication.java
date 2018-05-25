package com.KDTree.KDTree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KdTreeApplication {
	public static void main(String[] args) {
		SpringApplication.run(KdTreeApplication.class, args);
		Punto punto1 = new Punto(1, 5);
		Punto punto2 = new Punto(1, 3);
		Punto punto3 = new Punto(5, 2);
		Punto punto4 = new Punto(6, 2);
		Punto punto5 = new Punto(7, 7);
		Punto punto6 = new Punto(4, 5);
		Punto punto7 = new Punto(7, 6);
		Punto punto8 = new Punto(2, 7);
		List<Punto> puntos = new ArrayList<>();
		puntos.add(punto1);
		puntos.add(punto2);
		puntos.add(punto3);
		puntos.add(punto4);
		puntos.add(punto5);
		puntos.add(punto6);
		puntos.add(punto7);
		puntos.add(punto8);
		ManejadorDeCoordenadas manejadorDeCoordenadas = new ManejadorDeCoordenadas();
		List<List<Punto>> listaTotal = manejadorDeCoordenadas.crearMatriz(puntos);
		System.out.println(listaTotal.get(0).size());
		System.out.println(listaTotal.get(1).size());
		System.out.println(listaTotal.get(2).size());
		System.out.println(listaTotal.get(3).size());
	}
}
