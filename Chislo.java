package HomeWork3;

import java.util.Scanner;
/**
 *���� "������ �����": ��������� ���������� ����� [1, 100]. ����� ������� �� ������� ����������� ������ �����.
 * ������ ���, ����� �� ������ ����� ��������� ��������, ��� ������� ������ ��� ������� �����.
 * ��� ������ ������������ ������ �����, ������������ � ��������.
 */
public class Chislo {
    Scanner h = new Scanner(System.in);
    int f = 0, nn = 0, n = 0;

    public int vvod(){
        System.out.println("������� ����� ");
      return h.nextInt();
    }

    public int ugad(int nn){
        f = vvod();
        while (true) {
            if (f == nn) {
                System.out.println("�����������, �� �������!");
                break;
            } else {
                if (nn > f) {
                    System.out.println("����� ");
                    f = vvod();
                } else {
                    System.out.println("������ ");
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
