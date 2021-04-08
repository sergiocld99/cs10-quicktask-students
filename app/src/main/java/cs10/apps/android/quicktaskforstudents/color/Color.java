package cs10.apps.android.quicktaskforstudents.color;

import cs10.apps.android.quicktaskforstudents.R;

public enum Color {
    RED(R.color.red),
    ORANGE(R.color.orange),
    GREEN(R.color.green),
    BLUE(R.color.blue),
    PURPLE(R.color.purple_500),
    BLACK(R.color.black);

    public final int value;

    Color(int value) {
        this.value = value;
    }
}
