package cs10.apps.android.quicktaskforstudents.date

import cs10.apps.android.quicktaskforstudents.common.Utils

class DayTime(var hour:Int, var minute:Int) {

    override fun toString(): String {
        return "$hour:" + Utils.twoDigits(minute)
    }
}