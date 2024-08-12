package com.gps.gyment

import android.app.Application
import com.gps.gyment.di.androidModule
import com.gps.gyment.di.appModule
import com.gps.gyment.di.firebaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class GymentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@GymentApplication)
            modules(
                appModule,
                androidModule,
                firebaseModule
            )
        }
    }
}