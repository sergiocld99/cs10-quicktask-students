package cs10.apps.android.quicktaskforstudents.subject

import cs10.apps.android.quicktaskforstudents.color.Color

class Subject(var name:String, var code:String, var color:Color) {

    override fun toString(): String {
        return "$code - $name";
    }
}