const prompt = require('prompt-sync')();

let texto = prompt('Introduce tu nombre y apellidos separados por espacios: ')

let partes = texto.toLowerCase().split(" ");

let correo = partes[0] + "." + partes[1] + "." + partes[2] + "@al.colegiosangabriel.com";

console.log('"Tu correo electrónico es ' + correo + '.')