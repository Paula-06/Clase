Algoritmo Contar 
	Definir numero, totalNumeros, pares, impares, suma Como Entero
    totalNumeros <- 0
    pares <- 0
    impares <- 0
    suma <- 0
	
	Repetir
        Escribir "Introduce un número entero positivo (o un número negativo para terminar): "
        Leer numero
		
        Si numero >= 0 Entonces
            totalNumeros <- totalNumeros + 1
            suma <- suma + numero
			
            Si numero MOD 2 = 0 Entonces
                pares <- pares + 1
            Sino
                impares <- impares + 1
            FinSi
        FinSi
    Hasta Que numero < 0
	Escribir "Cantidad total de números introducidos: ", totalNumeros
    Escribir "Cantidad de números pares: ", pares
    Escribir "Cantidad de números impares: ", impares
    Escribir "Suma total de los números: ", suma
FinAlgoritmo
