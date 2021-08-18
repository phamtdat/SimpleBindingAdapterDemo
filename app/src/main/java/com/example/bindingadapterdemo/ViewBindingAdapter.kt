package com.example.bindingadapterdemo

import android.util.Log
import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("borderLine")
fun View.borderLine(item: AccessListItem?) {
    item.let {
        Log.d("AAAA", "Hello, my name is ${it?.name}")
    }
}