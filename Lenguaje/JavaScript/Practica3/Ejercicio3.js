const prompt = require('prompt-sync')();

let dias = parseInt(prompt('Introduce un número de días: '));

let fechaActual = new Date();

let fechaFutura = new Date();
fechaFutura.setDate(fechaActual.getDate() + dias);

let dia = fechaFutura.getDate().toString();
let mes = fechaFutura.getMonth() + 1;
let anio = fechaFutura.getFullYear();

let fechaFormateada = `${dia}/${mes}/${anio}`;


console.log('Trancurridos ' + dias + ' días desde hoy la fecha será ' + fechaFormateada)
