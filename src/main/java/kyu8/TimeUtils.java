package kyu8;

class TimeUtils {
    public static String convertTime(int timeDiff) {
        int day = 0, hour = 0, minute = 0, second = 0;
        int timeAux = timeDiff;
        if(timeAux < 0){
            timeAux *= -1;
        }

        while(timeAux > 0){
            if(timeAux >= 60*60*24){
                day ++;
                timeAux -= 60*60*24;
            } else if(timeAux >= 60*60){
                hour ++;
                timeAux -= 60*60;
            } else if (timeAux >= 60) {
                minute ++;
                timeAux -= 60;
            } else {
                second = timeAux;
                timeAux = 0;
            }

        }

        if(timeDiff < 0){
            day *= -1;
            hour *= -1;
            minute *= -1;
            second *= -1;
        }

        return day + " " + hour + " " + minute + " " + second ;

    }
}
