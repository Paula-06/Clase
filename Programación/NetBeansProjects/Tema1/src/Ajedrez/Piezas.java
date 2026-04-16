package Ajedrez;

import java.util.Scanner;

public class Piezas{
protected String nombre;
protected int valor;
protected String movimiento;
	public Piezas(String nom, int val, String mov) {
		this.nombre = nom;
		this.valor=val;
		this.movimiento=mov;
	}
}