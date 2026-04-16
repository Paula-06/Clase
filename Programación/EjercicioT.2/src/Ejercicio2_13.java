import java.util.Scanner;

public class Ejercicio2_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hora, min, seg;
        System.out.println("Ponga la hora: ");
            hora = sc.nextInt();
        System.out.println("Ponga los minutos: ");
            min = sc.nextInt();
        System.out.println("Ponga los segundos: ");
            seg = sc.nextInt();
        seg++ ;
        if (seg > 59) {
            seg = 00;
              min ++;
                if (min > 59) {
                    min = 00;
                      hora++;
                        if (hora > 24) {
                            hora = 00;
                  }
                }
              }
        System.out.println("La hora actual con un segundo mas es: " + hora + ":" + min + ":" + seg);
    }
}
