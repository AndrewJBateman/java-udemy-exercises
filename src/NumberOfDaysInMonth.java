public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth;
        Boolean aLeapYear = isLeapYear(year);

        if(month < 1 || month > 12 || year < 1 || year >9999) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 2:
                    if(aLeapYear) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                       }
                    break;
                default:
                    daysInMonth = 30;
                break;
            }

        }
        return daysInMonth;
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        } else return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
