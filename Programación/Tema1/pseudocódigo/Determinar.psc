Algoritmo Determinar
    Definir num Como Entero
    
    Escribir 'Introduce un número entero:'
    Leer num
    
    
    SI num = 0 Entonces
        Escribir 'El número es CERO y es par.'
        
    SINO SI num > 0 Entonces
			// El número es positivo
			SI num MOD 2 = 0 Entonces
				Escribir 'El número es positivo y par.'
			SINO
				Escribir 'El número es positivo e impar.'
			FinSI
			
		SINO
			// El número es negativo (es decir, num < 0)
			SI num MOD 2 = 0 Entonces
				Escribir 'El número es negativo y par.'
			SINO
				Escribir 'El número es negativo e impar.'
			FinSI
			
		FinSI
		
	FinSi
	
FinAlgoritmo