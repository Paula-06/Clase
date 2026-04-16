const prompt = require('prompt-sync')();

// Pedir fechas

let texto1 = parseInt(prompt('Introduce el año de la fecha futura: '));

let texto2 = parseInt(prompt('Introduce el mes numérico de la fecha futura (0 para enero, 1 para febrero,...): '));

let texto3 = parseInt(prompt('Introduce el día de la fecha futura: '));

//Guardar fehcchas

let fechaFutura  = new Date(texto1, texto2, texto3);

let fechaActual = new Date();//fecha actual

let fecha = (fechaFutura - fechaActual);

let miliseg = 1000*60*60*24
let diasres = Math.ceil(fecha / miliseg)

console.log('Quedan ' + diasres + ' días para alcanzar tu fecha futura ')

//Sin terminar