public class SecondsAndMinutesChallenge {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long minutes, long seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if(remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(long seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
