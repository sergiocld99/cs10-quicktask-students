package cs10.apps.android.quicktaskforstudents.common;

public class OnlyPositiveException extends IllegalArgumentException {

    public OnlyPositiveException(int number) {
        super(number + " should be positive");
    }
}
