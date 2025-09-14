package com.follow.clashx;

import android.app.Application
import android.content.Context

class MBzeGuardXApplication : Application() {
    companion object {
        private lateinit var instance: MBzeGuardXApplication
        fun getAppContext(): Context {
            return instance.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}