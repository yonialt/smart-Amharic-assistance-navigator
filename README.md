Smart Amharic Assistive Navigator (Flutter + Kotlin)
Overview

This project is a hybrid Android assistive system designed to help blind and visually impaired users interact with their smartphones using Amharic voice feedback.

It combines Kotlin (Android native core) and Flutter (UI layer) to build a full screen-reading and voice assistant system.

The main goal is to improve smartphone accessibility for Amharic-speaking users.

Features
Screen reading using Android Accessibility Service (Kotlin)
Real-time detection of UI text and system events
Amharic Text-to-Speech output
Voice narration of apps and system UI
Flutter-based user interface
Modular architecture (Flutter + Kotlin separation)
Foundation for camera-based AI assistance
Extensible for voice commands and automation
Tech Stack

Core (Android Engine)

Kotlin
Android AccessibilityService API
TextToSpeech (TTS)
SpeechRecognizer (planned)
CameraX (future)

UI Layer

Flutter (Dart)
Method Channel (Flutter ↔ Kotlin communication)
Architecture

Flutter (UI Layer)
→ Sends commands via Method Channel
→ Kotlin Android Core Engine
→ Accessibility Service reads screen
→ Converts text to Amharic speech
→ Outputs voice to user

Project Structure

android/

app/
java/com/example/amharicassistant/
MainActivity.kt
MyAccessibilityService.kt

flutter/

lib/
main.dart
screens/
services/
platform_channel/
Installation
Clone repository
git clone <repo-link>
cd amharic-assistive-navigator
Open project in Android Studio with Flutter support
Install Flutter dependencies
flutter pub get
Run project
flutter run
Enable Accessibility Service
Settings → Accessibility → Amharic Assistant → Enable
Permissions
Accessibility Service (required)
Text-to-Speech access
Microphone (future voice commands)
Camera (future AI features)
Current Limitations
Amharic TTS quality depends on device support
Accessibility must be enabled manually
No full AI vision system yet
Voice commands not implemented yet
Future Improvements
Voice commands in Amharic
Camera-based object detection
Smarter screen understanding
Offline Amharic TTS model
Full Flutter control dashboard
Notification summarization
AI assistant mode for full phone navigation
Why Hybrid (Flutter + Kotlin)
Kotlin is used for system-level Android features (Accessibility, screen reading)
Flutter is used for UI and user experience
Method Channels connect both layers

This allows full system control + clean interface design.

Goal

To build a fully functional assistive Android system for blind users in Ethiopia that provides real-time Amharic voice feedback for smartphone interaction.
