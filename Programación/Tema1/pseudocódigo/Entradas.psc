Algoritmo Entradas
	Definir edad Como Entero
	Definir precioBase Como Real
	precioBase = 35
    Definir precioFinal Como Real
	Escribir '¿Cuál es tu edad?'
	leer edad
 Si edad < 12
	 Escribir 'Entrada gratuita'
	 Escribir 'Su entrada quedaría en' + ConvertirATexto(precioFinal) + '?'
	 precioFinal = 0
 FinSi
  Si edad > 11 y edad < 18
	  Escribir 'Descuento del 50%'
	  precioFinal=precioBase - (precioBase*0.5) 
  FinSi
   Si edad = 18 o edad > 18 y edad < 65
	   Escribir 'Precio completo'
	   Escribir '¿Eres estudiante?'
	   leer categoria 
	   Si categoria='si' Entonces
		   Escribir 'Tienes un descuento del 25%'
		   precioFinal=precioBase - (precioBase*0.25) 
	   SiNo
		   Escribir 'No tienes descuentos'
	   FinSi
   FinSi
   Si edad > 64 
		Escribir 'Descuento del 10%'
		Escribir '¿Eres estudiante?'
		leer categoria 
		Si categoria='si' Entonces
			Escribir 'Tienes un descuento del 35%, ya que se te añade el 10% y el 25%'
			precioFinal=precioBase - (precioBase*0.35) 
		SiNo
			Escribir 'No tienes descuentos'
		FinSi
    FinSi
	Escribir 'El precio final a pagar es: ', precioFinal
	
	
FinAlgoritmo
