Algoritmo Positivonegativo
	Definir contador Como Entero
	Escribir 'Digame un número'
	leer num
	contador = 0
	Si num >0
		Escribir 'El número es positivo'
		 Repetir
			Escribir 'Escriba más numeros'
			Leer num
			contador = contador + 1
		Hasta Que num <0
		Escribir 'Total de numeros positivos: ' contador
		Escribir 'Hasta luego'
	 FinSi
FinAlgoritmo
