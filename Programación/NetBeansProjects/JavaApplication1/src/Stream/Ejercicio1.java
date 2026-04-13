package Stream;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Crear arrays de caracteres
        char[] letras = {'a', 'B', 'c', 'D', 'e', 'F', 'g', 'H', 'i', 'J'};

        //Mostrar en mayusculas
        System.out.println("Las letras en mayúsculas: ");
        for (char c : letras) {
            System.out.println(Character.toUpperCase(c));
        }

        System.out.println("___________________");

        //Mostrar en minúsculas
        System.out.println("Las letras en minúculas: ");
        for (char c : letras) {
            System.out.println(Character.toLowerCase(c));
        }
    }
}
