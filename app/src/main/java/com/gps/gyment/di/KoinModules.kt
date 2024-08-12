package com.gps.gyment.di

import android.net.ConnectivityManager
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import com.gps.gyment.ui.viewmodels.SignUpViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module


val androidModule = module {
    single {
        androidContext()
            .getSystemService(ConnectivityManager::class.java)
                as ConnectivityManager
    }
}

val appModule = module {
    viewModelOf(::SignUpViewModel)
}

val firebaseModule = module {
    single {
        Firebase.auth
    }
}