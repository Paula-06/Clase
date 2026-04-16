const prompt = require('prompt-sync')();

let texto1 = prompt('Introduce tu año de nacimiento: ');

let texto2 = prompt('Introduce tu mes numérico de nacimiento (0 para enero, 1 para febrero,...): ');

let texto3 = prompt('Introduce tu día de nacimiento: ');

let fecha = new Date(texto1, texto2, texto3);

console.log('Tu fecha de nacimiento cae en ' + fecha.toString());