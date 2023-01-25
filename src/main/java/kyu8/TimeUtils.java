package kyu8;

class TimeUtils {
//    public static String convertTime(int timeDiff) {
//
//
//
//    }
public static void main(String[] args) {
     int timeDiff =90061;
    int day = 0;
    int houres = 0;
    int min = 0;
    int seconds = 0;


    seconds = timeDiff/(60*60*24) / min;
    day = timeDiff/(60*60*24);
    houres = timeDiff/(60*60*24) / day;
    min = timeDiff/(60*60*24) / houres ;

}
}