import java.util.Random;
import java.util.Scanner;

public class GameNumber {


    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 0 до 10");

        int tmp;
        int rand = random.nextInt(9);


        Boolean win = false;

        for (int i = 1; i < 4; i++) {

            if (i == 1) System.out.println("Вам дается 3 попытки");
            tmp = sc.nextInt();

            if (tmp > rand) {
                System.out.println("Искомое число меньше " + tmp);
            } else if (tmp < rand) {
                System.out.println("Искомое число больше " + tmp);

            } else if (tmp == rand) {
                System.out.println("Вы угадали, это число " + rand);
                System.out.println("Повторить игру еще раз 1 - да / 0 - нет");


                win = true;
                tmp = sc.nextInt();


                if (tmp == 1) {

                    i = 0;
                    win = false;
                    rand = random.nextInt(9);
                } else if (tmp == 0) {
                    break;

                }

            }

            if (!win && i == 3) {

                System.out.println("Вы не угодали число");
                System.out.println("Вы не угодали число. Повторить игру еще раз 1 - да / 0 - нет");
                tmp = sc.nextInt();

                if (tmp == 1) {
                    i = 0;
                    win = false;
                    rand = random.nextInt(9);
                } else if (tmp == 0) {
                    break;
                }
            }
        }
    }
}
