const prompt = require('prompt-sync')();

let texto = prompt('Introduce una cadena de texto: ')
let posicion1 = parseInt(prompt('Introduce una posición inicial (1 es la primera letra izquierda: '))

posicion1 = texto.indexOf(" ");

if (posicion1 < 1 || posicion1 > texto.lenght) {
    console.log('ERROR')
} else {
    let posicion2 = parseInt(prompt('Introduce una posición final (1 es la primera letra izquierda): '))
    posicion2 = texto.lastIndexOf(" ");
}

if (posicion2 < 1 || posicion2 > texto.lenght) {
    console.log('ERROR')
} else {
    let subCadena = texto.substring(posicion1, posicion2)
}

console.log('La subcadena de texto de ' +  texto + ' entre la posición inicial '+ posicion1 +' y la posición final ' + posicion2 + ' es ' + subCadena)
