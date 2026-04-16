const prompt = require('prompt-sync')();

let num = parseInt(prompt('Introduce una calificación del 0 al 10: '))

if (num < 1 || num > 10 ) {
    console.log('ERROR');
} else  if (num < 5) {        
    console.log(' Suspenso  ');
} else if ( num <= 6) {
    console.log(' Aprobado  ')
} else if ( num <= 7) {
    console.log(' Bien')
} else if ( num <= 8) {
    console.log(' Notable ')
} else if (num <= 9) {
    console.log(' Sobresaliente ')
} else {
    console.log(' Matrícula de honor ')
}