package com.github.monolabhituszi.portal

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.PreferenceManager

class Theme {
    companion object {
        private const val key = "theme"
        private const val default = "default"
        private const val light = "light"
        private const val dark = "dark"

        fun applyThemeConfig(context: Context) {
            val prefs = PreferenceManager.getDefaultSharedPreferences(context.applicationContext)
            applyTheme(
                prefs.getString(
                    key,
                    default
                ) ?: default
            )
        }

        fun applyTheme(mode: String) {
            when (mode) {
                default -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_UNSPECIFIED)
                }
                light -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
                dark -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
            }
        }
    }
}
