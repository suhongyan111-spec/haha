# ScreenTranslator - Lite (for online build)
This is a minimal Android project prepared for easy online building (no Android Studio required).
Features (Lite):
- Floating button to trigger screenshot flow (placeholder)
- ML Kit OCR helper (example)
- Simple translator manager (placeholder - requires API key configuration)
- Instructions to build using an online Android build service.

## How to build
1. Zip this project (it is already zipped for you as ScreenTranslator_Lite.zip).
2. Upload to any online Android builder that accepts Android Studio/Gradle projects (or import into Android Studio if desired).
3. Provide your signing keystore or follow the builder's signing options.
4. Build -> download APK -> install on your Honor X50.

## Notes
- Replace placeholder API endpoints and API keys in `TranslatorManager.kt` before publishing.
- This project targets SDK 34 and minSdk 26. If the builder complains, adjust `compileSdk`/`targetSdk` in `app/build.gradle`.
