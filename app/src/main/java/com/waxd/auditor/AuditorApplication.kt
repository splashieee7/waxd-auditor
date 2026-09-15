package com.waxd.auditor

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class AuditorApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Material You dynamic color intentionally not applied: the waxd palette
        // in values-night/colors.xml is the fixed brand look, not system wallpaper
        // colors. Forcing dark mode always (rather than following the system
        // setting) is what makes that values-night palette the one that's ever
        // shown, matching the rest of the waxd suite always rendering dark.
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }
}
