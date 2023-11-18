public class Main {

    public static void main(String[] args) {      // egy soros megjegyzés
        /* ez egy több soros komment */


        int year = 2023;                                   // változó létrehozása érték nélkül
        int age = 30;

        System.out.println("Hello Progmatic");   // print 'linenew' új sorban ír ki
        System.out.print("helo progmatic ");
        System.out.print("helo progmatic");     // print egy sorba ír ki


        System.out.println(year);               // változó kiíratása
        System.out.println(age);

        year = 2024;                              // változó értékének felülírása

        System.out.println(year);               // változó felülírt értékének kiíratása

        System.out.println("year változó tartalma:" + year);

        String name;                            // értékadás nélkül string változó
        String actualDay = "Saturday";          // értékadássaé string változó

        System.out.println("Az actualDay változó tartalma: " + actualDay);
        name="Zsolt";                            // változó értékadás
        System.out.println(name);

        char classID;
        char answer = 'C';
        System.out.println('C');



        boolean nitroExist;
        nitroExist = true;
        System.out.println(nitroExist);

        boolean allWheelDrive = false;
        System.out.println(allWheelDrive);


    }
}
