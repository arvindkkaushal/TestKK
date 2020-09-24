package com.arv.mynytimes

import android.app.Application
import com.arv.mynytimes.di.DaggerApplicationComponent

class MyNYTimesApplication: Application() {
    val applicationComponent= DaggerApplicationComponent.create()
}