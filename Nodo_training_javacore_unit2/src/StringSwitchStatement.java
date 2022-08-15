import java.util.Calendar;
import java.util.Locale;

public class StringSwitchStatement {
    public static void main(String[] args) {
        StringSwitchStatement statement= new StringSwitchStatement();
        Calendar calendar= Calendar.getInstance();
        System.out.println("Today is"+ statement.getTypeOfDay(calendar));
        calendar.set(Calendar.DATE,calendar.get(Calendar.DATE)+1);
        System.out.println("Tomorrow is"+statement.getTypeOfDay(calendar));
            }
    String getTypeOfDay (Calendar calendar) {
        String type = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("vi"));
        switch (type) {
            case"Th 2":return"Start of work week";
            case"Th 3":return "Nothing";
            case"Th 4":return "Midweek";
            case"Th 6":return "End of work week";
            case"Th 7":return "Fun";
            case "CN":return "Weekend";
        }
        return "Unknown";

    }
        }
