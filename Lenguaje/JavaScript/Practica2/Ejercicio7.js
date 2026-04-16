const prompt = require('prompt-sync')();

let cadena = prompt("Introduce una cadena de texto formada por tres palabras en minúsculas: ");

let espacio1 = cadena.indexOf(" ");
let espacio2 = cadena.lastIndexOf(" ");

let palabra1 = cadena.substring(0, espacio1);

let palabra2 = cadena.substring(espacio1 + 1, espacio2);

let palabra3 = cadena.substring(espacio2 + 1);

palabra1 = palabra1.replace(palabra1.charAt(0), palabra1.charAt(0).toUpperCase());
palabra2 = palabra2.replace(palabra2.charAt(0), palabra2.charAt(0).toUpperCase());
palabra3 = palabra3.replace(palabra3.charAt(0), palabra3.charAt(0).toUpperCase());

let resultado = palabra1 + " " + palabra2 + " " + palabra3;

console.log(`Tu cadena de texto con letras iniciales mayúsculas es ${resultado}.`);