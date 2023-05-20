package com.example.kobit.application

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class KobitApplication : Application() {

    companion object {
        private lateinit var instance: KobitApplication

        private fun setInstance(application: KobitApplication) {
            instance = application
        }

        fun getGlobalContext(): Context = instance.applicationContext
    }

    override fun onCreate() {
        super.onCreate()
        setInstance(this@KobitApplication)
    }

}