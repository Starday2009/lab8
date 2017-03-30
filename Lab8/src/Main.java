import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Integer inp;
        Arr1 array = new Arr1();
        System.out.println("1. Create Array with odd digits");
        System.out.println("2. Create Array with 8 random digits");
        System.out.println("3. Create Two-dimensional Array ");
        System.out.println("4. Create Two-dimensional Array with MAX");
        System.out.println("0. Exit");
        System.out.print("Введите цифру с желаемым действием: ");

        do {
            Scanner sc = new Scanner(System.in);
            inp = sc.nextInt();
            switch (inp) {
                case 1:
                    array.createArr();
                    break;
                case 2:
                    array.random();
                    break;

                case 3:
                    array.dou();
                    break;
                case 4:
                    array.doudou();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ошибка-неизвестная команда");
            }
        }
        while (inp != 0);
    }

    }