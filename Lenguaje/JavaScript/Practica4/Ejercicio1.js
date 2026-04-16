const prompt = require('prompt-sync')();

let num = prompt('Introduce un número real: ');

if( num < 0 )
{
	console.log('El numero es negativo')
}
else if( num > 0 )
{
	console.log('El numero es positivo')
}
else
{
	console.log('El numero es cero')
}
