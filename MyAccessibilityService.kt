package com.example.amharicassistant

import android.accessibilityservice.AccessibilityService
import android.speech.tts.TextToSpeech
import android.view.accessibility.AccessibilityEvent
import java.util.Locale

class MyAccessibilityService : AccessibilityService(), TextToSpeech.OnInitListener {

    private lateinit var tts: TextToSpeech

    override fun onServiceConnected() {
        tts = TextToSpeech(this, this)
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {

        val text = event?.text?.joinToString(" ")

        if (!text.isNullOrEmpty()) {
            speak("በስክሪኑ ላይ: $text")
        }
    }

    override fun onInterrupt() {}

    override fun onInit(status: Int) {
        tts.language = Locale("am")
    }

    private fun speak(text: String) {
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
    }
}
