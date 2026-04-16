const prompt = require('prompt-sync')();

let num = parseInt(prompt('Introduce un número real: '));

if (num%2 == 0) {
    console.log('El numero es par')
} else {
    console.log('El número es impar')
}
