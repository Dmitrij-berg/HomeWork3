package HomeWork3;

/**
 Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 Определить дополнительно методы в классе, создающем массив объектов.
 Задать критерий выбора данных и вывести эти данные на консоль.

 6. House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица,
 Тип здания, Срок эксплуатации.
 Создать массив объектов. Вывести:
 a)  список квартир, имеющих заданное число комнат;
 b)  список квартир, имеющих заданное число комнат и расположенных
 на этаже, который находится в заданном промежутке;
 c)  список квартир, имеющих площадь, превосходящую заданную.

 */


        import java.util.Scanner;


public class Haus0 {

    public static void main(String[] args) {

        Scanner nn = new Scanner(System.in);
        Haus0 hh = new Haus0();
        Haus[] hau = new Haus[6];
        hau[0] = new Haus(1, 5, 44, 3, 2, "Ленина", "Кооперативный", "10 лет" );
        hau[1] = new Haus(2, 25, 50, 1, 3, "Киевская", "Кооперативный", "20 лет");
        hau[2] = new Haus(3, 55, 35, 2, 1, "Гоголя", "Кооперативный", "15 лет" );
        hau[3] = new Haus(4, 15, 50, 1, 3, "Пушкина", "Кооперативный", "30 лет" );
        hau[4] = new Haus(5, 2, 45, 4, 2, "Советская", "Кооперативный", "25 лет" );
        hau[5] = new Haus(6, 24, 50, 1, 3, "Киевская", "Кооперативный", "5 лет" );


        System.out.println("Введите необходимое число комнат: ");
        int    dd = nn.nextInt();
        for(int j = 0; j < hau.length; j++) {
            hau[j].komn(dd);
        }
        System.out.println();

        System.out.println("Введите необходимый min этаж: ");
        int    d2 = nn.nextInt();
        System.out.println("Введите необходимый max этаж: ");
        int    d3 = nn.nextInt();
        System.out.println("Введите необходимое число комнат: ");
        int    d4 = nn.nextInt();
        for (int j = 0; j < hau.length ; j++) {
            hau[j].eta_komn(d4,d2,d3);
        }
        System.out.println();

        System.out.println("Введите небходимую минимальную площадь: ");
        int    d = nn.nextInt();
        for (int j = 0; j < hau.length; j++) {
            hau[j].plo(d);
        }
  }
}
       class  Haus {

            private int id;
            private int nom_kvar;
            private int ploch;
            private int etag;
            private int komnat;
            private String ulica;
            private String tip;
            private String srok;

            public Haus(int id, int nom_kvar, int ploch, int etag, int komnat, String ulica, String tip, String srok) {
                this.setId(id);
                this.setNom_kvar(nom_kvar);
                this.setPloch(ploch);
                this.setEtag(etag);
                this.setKomnat(komnat);
                this.setUlica(ulica);
                this.setTip(tip);
                this.setSrok(srok);
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getNom_kvar() {
                return nom_kvar;
            }

            public void setNom_kvar(int nom_kvar) {
                this.nom_kvar = nom_kvar;
            }

            public int getPloch() {
                return ploch;
            }

            public void setPloch(int ploch) {
                this.ploch = ploch;
            }

            public int getEtag() {
                return etag;
            }

            public void setEtag(int etag) {
                this.etag = etag;
            }

            public int getKomnat() {
                return komnat;
            }

            public void setKomnat(int komnat) {
                this.komnat = komnat;
            }

            public String getUlica() {
                return ulica;
            }

            public void setUlica(String ulica) {
                this.ulica = ulica;
            }

            public String getTip() {
                return tip;
            }

            public void setTip(String tip) {
                this.tip = tip;
            }

            public String getSrok() {
                return srok;
            }

            public void setSrok(String srok) {
                this.srok = srok;
            }

            public void plo(int y) {
                     if (this.getPloch()  > (y)) {
                         System.out.println(toString());
                     }
            }
            public void eta_komn(int t, int t1, int t2) {
                if ((this.getEtag() >= t1) && (this.getEtag() <= t2))
                {
                    if (this.getKomnat()  == t){
                        System.out.println(toString());
                    }
                }
            }
            public void komn(int e) {
                 if(this.getKomnat() == e){
                     System.out.println(toString());
                 }
            }

            public String toString()   {
                return  "Дом№" + getId() + ", кв.№" + getNom_kvar() +
                        ", площадь - " + getPloch() + ", этаж - " + getEtag() +
                        ", комнат - " + getKomnat() + ", ул." + getUlica() +
                        ", тип здания - " + getTip() + ", срок эксплуатации - " + getSrok();
            }
        }