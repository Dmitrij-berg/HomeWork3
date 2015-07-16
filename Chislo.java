package HomeWork3;

import java.util.Scanner;
/**
 *Игра "Угадай число": программа генерирует число [1, 100]. Потом выводит на консоль приглашение ввести число.
 * Каждый раз, когда мы вводим число программа сообщает, или слишком высоко или слишком низко.
 * Как только пользователь угадал число, поздравляете и выходите.
 */
public class Chislo {
    Scanner h = new Scanner(System.in);
    int f = 0, nn = 0, n = 0;

    public int vvod(){
        System.out.println("Введите число ");
      return h.nextInt();
    }

    public int ugad(int nn){
        f = vvod();
        while (true) {
            if (f == nn) {
                System.out.println("Поздравляем, вы угадали!");
                break;
            } else {
                if (nn > f) {
                    System.out.println("Низко ");
                    f = vvod();
                } else {
                    System.out.println("Высоко ");
                    f = vvod();
                  }
            }
        }
     return  f;
    }

    public void pers(){
        n = (int) (Math.random()*100)+1;
        ugad(n);
    }
    public static void main(String[] args) {
        Chislo ggg = new Chislo();
        ggg.pers();
    }
}
