package com.o_bdreldin.bookkeeper.extension

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.toastLong(message : String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
}

fun AppCompatActivity.toastLong(message : Int) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
}

fun Fragment.toastLong(message: String) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show();
}

fun Fragment.toastLong(message: Int) {
    Toast.makeText(context, message, Toast.LENGTH_LONG).show();
}