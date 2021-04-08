package cs10.apps.android.quicktaskforstudents.common;

import androidx.annotation.NonNull;

public class Utils {

    @NonNull
    public static String twoDigits(int number){
        if (number < 0) throw new OnlyPositiveException(number);
        return number < 10 ? "0"+number : String.valueOf(number);
    }
}
