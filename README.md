# Smart Amharic Assistive Navigator (Flutter + Kotlin)

## Overview

This project is a hybrid Android assistive system designed to help blind and visually impaired users interact with their smartphones using Amharic voice feedback.

It combines Kotlin (Android native core) and Flutter (UI layer) to build a screen reading and voice assistant system.

The main goal is to improve smartphone accessibility for Amharic-speaking users.

---

## Features

- Screen reading using Android Accessibility Service (Kotlin)
- Real-time detection of UI text and system events
- Amharic Text-to-Speech output
- Voice narration of apps and system UI
- Flutter-based user interface
- Modular architecture (Flutter + Kotlin separation)
- Foundation for camera-based AI assistance
- Extensible for voice commands and automation

---

## Tech Stack

**Core (Android Engine)**
- Kotlin
- Android AccessibilityService API
- TextToSpeech (TTS)
- SpeechRecognizer (planned)
- CameraX (future)

**UI Layer**
- Flutter (Dart)
- Method Channel (Flutter ↔ Kotlin communication)

---

## Architecture

Flutter (UI Layer)
→ Sends commands via Method Channel  
→ Kotlin Android Core Engine  
→ Accessibility Service reads screen content  
→ Converts text to Amharic speech  
→ Outputs voice to user  

---

## Project Structure

android/
- app/
  - java/com/example/amharicassistant/
    - MainActivity.kt
    - MyAccessibilityService.kt

flutter/
- lib/
  - main.dart
  - screens/
  - services/
  - platform_channel/

---

## Installation

1. Clone the repository

git clone <repo-link>
cd amharic-assistive-navigator

2. Install Flutter dependencies

flutter pub get

3. Open project in Android Studio (with Flutter plugin)

4. Run the app

flutter run

5. Enable Accessibility Service

Settings → Accessibility → Amharic Assistant → Enable

---

## Permissions

- Accessibility Service (required)
- Text-to-Speech access
- Microphone (future voice commands)
- Camera (future AI features)

---

## Current Limitations

- Amharic TTS quality depends on device support
- Accessibility must be enabled manually
- No full AI vision system yet
- Voice commands not implemented yet

---

## Future Improvements

- Voice commands in Amharic
- Camera-based object detection
- Smarter screen understanding
- Offline Amharic TTS model
- Full Flutter control dashboard
- Notification summarization
- AI assistant mode for full phone navigation

---

## Why Hybrid (Flutter + Kotlin)

- Kotlin handles system-level Android features (Accessibility, screen reading)
- Flutter handles UI and user experience
- Method Channels connect both layers

This allows full system control with a clean interface.

---

## Goal

To build a fully functional assistive system for blind users in Ethiopia that provides real-time Amharic voice feedback for smartphone interaction.
