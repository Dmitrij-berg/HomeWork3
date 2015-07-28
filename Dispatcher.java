package HomeWork3;

public class Dispatcher {

    public static void main(String[] args) {

        Dispatcher disp = new Dispatcher();

        Cars[] car = new Cars[3];
        car[0]=new Cars(2316," Toyota");
        car[1]=new Cars(4589," Reno");
        car[2]=new Cars(8452," Nisan");

        Voyage[] vo = new Voyage[3];
        vo[0]=new Voyage("Киев - Харьков", 1);
        vo[1]=new Voyage("Харьков - Львов", 2);
        vo[2]=new Voyage("Полтава - Чернигов",3);

        Drivers[] pers = new Drivers[3];
        pers[0]=new Drivers("Николай Викторович", 40);
        pers[1]=new Drivers("Владимир Иванович", 35);
        pers[2]=new Drivers("Василий Петрович", 45);

        int r = (int) (Math.random() * 3);
        pers[r].pe();  vo[r].str(); car[r].ca(); pers[r].status(); pers[r].condition();

    }
}



class Cars {
    private int id_car;
    private String brend;

    Cars(int id_car, String brend){
        this.setId_car(id_car);
        this.setBrend(brend);
    }


    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public  void  ca(){
        System.out.println(toString());
    }

    public String toString()   {
        return  "Авто №" + getId_car() + ", марка" + getBrend() ;
    }

}


class Drivers {

    private String name;
    private int age;

    Drivers(String name, int age){
        this.setAge(age);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void repair(){
        System.out.println(" Необходим ремонт автомобиля! ");
    }

    public void status(){
        String[] stat = new String[3] ;
        stat[0] = (" Выполнено");
        stat[1] = (" В пути");
        stat[2] = (" Только выехал");


        int s = (int) (Math.random() * 3) ;

        System.out.println("Выполнение рейса - № " + s + " Статус:" + stat[s]);
    }

    public void condition(){
        int c = (int) (Math.random() * 3);
        switch (c){
            case 1: repair(); System.out.println("Спустило колесо "); break;
            case 0: System.out.println("Все в порядке, автомобиль исправен "); break;
            case 2: repair(); System.out.println("Поломка двигателя "); break;
            default: break;
        }

    }

    public  void  pe(){
        System.out.println(toString());
    }

    public String toString()   {
        return  "Имя: " + getName() + ", возраст: " + getAge() ;
    }

}



class Voyage {

    private String voy;
    private int id_v;

    Voyage(String voy, int id_v){
        this.setVoy(voy);
        this.setId_v(id_v);
    }

    public String getVoy() {
        return voy;
    }

    public void setVoy(String voy) {
        this.voy = voy;
    }

    public int getId_v() {
        return id_v;
    }

    public void setId_v(int id_v) {
        this.id_v = id_v;
    }

    public void str(){
        System.out.println(toString());
    }

    public String toString()   {
        return  "Рейс №" + getId_v() + ", Маршрут: " + getVoy() ;
    }
}