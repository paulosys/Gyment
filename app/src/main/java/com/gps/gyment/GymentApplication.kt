package com.gps.gyment

import android.app.Application
import com.gps.gyment.di.firebaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class GymentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@GymentApplication)
            modules(firebaseModule)
        }
    }
}