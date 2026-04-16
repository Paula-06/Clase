const prompt = require('prompt-sync')();

let cadena = prompt("Introduce una cadena de texto: ")
let posicion = parseInt(prompt("Introduce una posición de dicha cadena (1 es la primera letra izquierda): "))


// Comprobar si la posición es válida
if (posicion < 1 || posicion > cadena.length) {
    console.log("ERROR");
} else {
    let caracter = cadena.charAt(posicion - 1);
    console.log("El carácter en posición " + posicion + " es '" + caracter + "'.");
}

