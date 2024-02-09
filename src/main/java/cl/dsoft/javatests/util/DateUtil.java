package cl.dsoft.javatests.util;

public class DateUtil {
    public static boolean isLeapYear(int year) {
        /*
        Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400)
        Todos los años divisibles por 100 pero NO por 400 NO son bisiestos (1700, 1800, 1900)
        Todos los años divisibles por 4 son bisiestos (1996, 2004, 2012)
        Todos los años que NO son divisibles por 4 NO son bisiestos (2017, 2018, 2019)
         */

        return (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
    }
}
