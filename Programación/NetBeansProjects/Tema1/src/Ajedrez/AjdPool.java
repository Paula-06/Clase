package Ajedrez;

import java.util.Scanner;

public class AjdPool {

	public static void main(String[] args) {
		
		///Nombre	Valor	Movimiento
		Piezas vacio = new Piezas("vacio",0,"nulo");
		
		Piezas peonW = new Piezas("PeonW",1,"peon");
		Piezas peonB = new Piezas("PeonB",1,"peon");
		
		Piezas caballoW = new Piezas("CaballoW",3,"caballo");
		Piezas caballoB = new Piezas("CaballoB",3,"caballo");
		
		Piezas alfilW = new Piezas("AlfilW",3,"alfil");
		Piezas alfilB = new Piezas("AlfilB",3,"alfil");
		
		Piezas torreW = new Piezas("TorreW",5,"torre");
		Piezas torreB = new Piezas("TorreB",5,"torre");
		
		Piezas damaW = new Piezas("DamaW",9,"dama");
		Piezas damaB = new Piezas("DamaB",9,"dama");
		
		Piezas reyW = new Piezas("ReyW",1000,"rey");
		Piezas reyB = new Piezas("ReyB",1000,"rey");
		
		String tablero[][] = new String[8][8];
		Piezas tableroBack[][] = new Piezas[8][8];
		
		//Puntuaciones de los lados
		int puntuacionW=0;
		int puntuacionB=0;
		
		//Montar el tablero interno
		montarTableroBack(tableroBack, vacio, peonW, peonB, caballoB, caballoW, alfilB, alfilW, torreB, torreW, damaW, damaB, reyW, reyB);
		//Montar el tablero externo
		montarTableroFront(tablero, vacio, peonW, peonB, caballoB, caballoW, alfilB, alfilW, torreB, torreW, damaW, damaB, reyW, reyB);
		
		///
		///Empezar a jugar:
		///
		
		//Mostrar el tablero y las puntuaciones para mover BLANCAS
		mostrarPuntuacionW(puntuacionW);
		mostrarTableroFront(tablero);
		mostrarPuntuacionB(puntuacionB);
		do {
		//Pedir el primer movimiento
		puntuacionW = pedirMovimientoBlancas(tableroBack, tablero, vacio, puntuacionW);
		//Mostrar el tablero y las puntuaciones para mover NEGRAS
		mostrarPuntuacionB(puntuacionB);
		mostrarTableroFront(tablero);
		mostrarPuntuacionW(puntuacionW);
				
		} while (puntuacionW<100 && puntuacionB<100);
		//Declarar el ganador
		if(puntuacionW>100)
			System.out.println("BLANCAS GANAN");
		else
			System.out.println("NEGRAS GANAN");
	}
	
	
	
	
	
	public static void montarTableroBack(Piezas tableroBack[][],Piezas vacio,Piezas peonW,Piezas peonB,Piezas caballoB,Piezas caballoW,Piezas alfilB,Piezas alfilW,Piezas torreB,Piezas torreW,Piezas damaW,Piezas damaB,Piezas reyW,Piezas reyB) {
		//Rellenar el tablero vacio
		for(int x=0;x<8;x++) {
			for(int y=0;y<8;y++) {
				tableroBack[x][y]=vacio;
			}
		}
		//Asignar piezas blancas(W)
		tableroBack[0][0]=torreW;
		tableroBack[0][1]=caballoW;
		tableroBack[0][2]=alfilW;
		tableroBack[0][3]=damaW;
		tableroBack[0][4]=reyW;
		tableroBack[0][5]=alfilW;
		tableroBack[0][6]=caballoW;
		tableroBack[0][7]=torreW;
		for(int i=0;i<8;i++) {
			tableroBack[1][i]=peonW;
		}
		//Asignar piezas negras(B)
		tableroBack[7][0]=torreB;
		tableroBack[7][1]=caballoB;
		tableroBack[7][2]=alfilB;
		tableroBack[7][3]=damaB;
		tableroBack[7][4]=reyB;
		tableroBack[7][5]=alfilB;
		tableroBack[7][6]=caballoB;
		tableroBack[7][7]=torreB;
		for(int i=0;i<8;i++) {
			tableroBack[6][i]=peonB;
		}
	}
	public static void montarTableroFront(String tablero[][],Piezas vacio,Piezas peonW,Piezas peonB,Piezas caballoB,Piezas caballoW,Piezas alfilB,Piezas alfilW,Piezas torreB,Piezas torreW,Piezas damaW,Piezas damaB,Piezas reyW,Piezas reyB) {
		//Rellenar el tablero vacio
			for(int x=0;x<8;x++) {
				for(int y=0;y<8;y++) {
					tablero[x][y]=vacio.nombre;
				}
			}
			//Asignar piezas negras(B)
			tablero[0][0]=torreB.nombre;
			tablero[0][1]=caballoB.nombre;
			tablero[0][2]=alfilB.nombre;
			tablero[0][3]=damaB.nombre;
			tablero[0][4]=reyB.nombre;
			tablero[0][5]=alfilB.nombre;
			tablero[0][6]=caballoB.nombre;
			tablero[0][7]=torreB.nombre;
			for(int i=0;i<8;i++) {
				tablero[1][i]=peonB.nombre;
			}
			//Asignar piezas blancas(W)
			tablero[7][0]=torreW.nombre;
			tablero[7][1]=caballoW.nombre;
			tablero[7][2]=alfilW.nombre;
			tablero[7][3]=damaW.nombre;
			tablero[7][4]=reyW.nombre;
			tablero[7][5]=alfilW.nombre;
			tablero[7][6]=caballoW.nombre;
			tablero[7][7]=torreW.nombre;
			for(int i=0;i<8;i++) {
				tablero[6][i]=peonW.nombre;
			}
	}
	public static void mostrarTableroFront(String[][] tablero) {
		System.out.print("\n");
		for(int x=0;x<8;x++) {
			for(int y=0;y<8;y++) {
				System.out.printf("%10s",tablero[x][y]);
			}
			System.out.println("\n");
		}
	}
	public static void mostrarPuntuacionW(int puntW) {
		System.out.println("Blancas: "+puntW);
	}
	public static void mostrarPuntuacionB(int puntB) {
		System.out.println("Negras: "+puntB);
	}
	public static int casillaDeLetraANumero(String piezaMover) {
		char charX1=piezaMover.charAt(0);
		String posX1=String.valueOf(charX1);
		if(posX1.equalsIgnoreCase("A")) {
			posX1="0";
		} else if(posX1.equalsIgnoreCase("B")) {
			posX1="1";
		} else if(posX1.equalsIgnoreCase("C")) {
			posX1="2";
		} else if(posX1.equalsIgnoreCase("D")) {
			posX1="3";
		} else if(posX1.equalsIgnoreCase("E")) {
			posX1="4";
		} else if(posX1.equalsIgnoreCase("F")) {
			posX1="5";
		} else if(posX1.equalsIgnoreCase("G")) {
			posX1="6";
		} else
			posX1="7";
		int casilla=Integer.valueOf(posX1);
		return casilla;
	}
	public static int posicionBuena(int pos) {
		switch (pos) { 
	    case 1:
	    	pos=7;
	    	break;
	    case 2:
	    	pos=6;
	    	break;
	    case 3:
	    	pos=5;
	    	break;
	    case 4:
	    	pos=4;
	    	break;
	    case 5:
	    	pos=3;
	    	break;
	    case 6:
	    	pos=2;
	    	break;
	    case 7:
	    	pos=1;
	    	break;
	    case 8:
	    	pos=0;
	    	break;
		}
		return pos;
	}
	public static void movimientoNoPermitidoPieza() {
		System.out.println("Movimiento ilegal, esa pieza no puede moverse de esa manera");
	}
	public static int pedirMovimientoBlancas(Piezas tableroBack[][], String tablero[][],Piezas vacio, int PuntuacionW) {
		System.out.println("MUEVEN BLANCAS");
		Scanner teclado = new Scanner(System.in);
		boolean casillaReal=false;
		int contadorErr=0;
		int posX1int=-1;
		int posY1int=-1;
		int posX2int=-1;
		int posY2int=-1;
		String piezaMover="";
		do {
			if(contadorErr==0)
				System.out.print("Introduce la casilla de la pieza a mover: ");
			else
				System.out.print("Introduce una casilla que este ocupada por una pieza blanca: ");
			piezaMover = teclado.nextLine();
			if(piezaMover.matches("[A-H][1-8]")||piezaMover.matches("[a-h][1-8]")) {
				casillaReal=true;
				posX1int = casillaDeLetraANumero(piezaMover);
				char charY1=piezaMover.charAt(1);
				posY1int=(int)(charY1)-48;
				
				posY1int=posicionBuena(posY1int);
				
				String casilla1 = tablero[posY1int][posX1int];
				char W = casilla1.charAt(casilla1.length()-1);
				String lastW = String.valueOf(W);
				if(lastW.compareTo("W")==0) {
					//tablero[posY1int][posX1int]=vacio.nombre;
					contadorErr=0;
				} else {
					casillaReal=false;
					contadorErr++;
				}
				//Muestra la pieza a mover y si es blanca o negra (W = blanca B = negra)
				System.out.println(casilla1+" "+W);
			}
			else {
				System.out.println("Introduce una casilla real");
				contadorErr=0;
			}
		} while(casillaReal!=true);
		//La casilla a donde lo mueves
		do {
			casillaReal=false;
			System.out.print("Introduce la casilla donde mueves la pieza: ");
			String moverA = teclado.nextLine();
			String piezaMoverLower=piezaMover.toLowerCase();
			if(piezaMoverLower.compareTo(moverA.toLowerCase())==0) {
				System.out.println("No puedes moverla a la misma casilla");
				casillaReal=false;
			} else {
				if(moverA.matches("[A-H][1-8]")||moverA.matches("[a-h][1-8]"))
					casillaReal=true;
				else
					System.out.println("Introduce una casilla real");
			}
			posX2int=casillaDeLetraANumero(moverA);
			char charY2=moverA.charAt(1);
			posY2int=(int)(charY2)-48;
			posY2int=posicionBuena(posY2int);
			
			//Comprobar si la pieza a mover puede hacer ese movimiento
			Piezas piezaParaMover = tableroBack[posY1int][posX1int];
			Piezas dondeSeMueve = tableroBack[posY2int][posX2int];
			switch (piezaParaMover.movimiento) {
				case "peon":{
					if(posY1int==1 && posY2int==posY1int-2) {
						System.out.println("Esta permitido--------------------Doble recto");
					} else if(posY2int==posY1int-1 && posX2int==posX1int) {	//Si es una casilla para arriba
						System.out.println("Esta permitido--------------------Recto");
					} else if(posY2int==posY1int-1 && posX2int==posX1int+1) {	//Si es una casilla para arriba a la derecha
						if(dondeSeMueve.nombre.equals("vacio")==false)
							System.out.println("Esta permitido--------------------Derecha");
						else {
							casillaReal=false;
							movimientoNoPermitidoPieza();
						}
					} else if(posY2int==posY1int-1 && posX2int==posX1int-1) {	//Si es una casilla para arriba a la derecha
						if(dondeSeMueve.nombre.equals("vacio")==false)
							System.out.println("Esta permitido--------------------Izquierda");
						else {
							casillaReal=false;
							movimientoNoPermitidoPieza();
						}
					} else {
						casillaReal=false;
						if(posY2int!=posY1int)
							movimientoNoPermitidoPieza();
					}
				}
				case "caballo":{
					
				}
				case "alfil":{
					
				}
				case "torre":{
					
				}
				case "dama":{
					
				}
				case "rey":{
					
				}
			}
		} while(casillaReal!=true);
		
		if(posX1int != -1|posY1int != -1|posX2int != -1|posY2int != -1) {
			
			//Mover las piezas en el Tablero Externo
			tablero[posY2int][posX2int]=tablero[posY1int][posX1int];
			tablero[posY1int][posX1int]=vacio.nombre;
			Piezas casillaPiezaA = tableroBack[posY2int][posX2int];
			PuntuacionW+=casillaPiezaA.valor;
			//Mover las piezas en el Tablero Interno
			tableroBack[posY2int][posX2int]=tableroBack[posY1int][posX1int];
			tableroBack[posY1int][posX1int]=vacio;
		}
		else
			System.out.println("Algo salio mal");
		return PuntuacionW;
	}
}