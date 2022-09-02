@echo off

rem set "HOME=%HOMEDRIVE%%HOMEPATH%"

cd %~dp0
PATH = %PATH%;%CD%\jdk-11.0.13.8-hotspot\bin\;%CD%\apache-maven-3.8.6\bin

echo %PATH%

java --module-path "javafx-11.0.2\lib" --add-modules javafx.base,javafx.graphics,javafx.controls,javafx.fxml -jar "test-preprocessor-0.0.1-SNAPSHOT.jar"
rem java --module-path "javafx-11.0.2\lib" --add-modules javafx.base,javafx.graphics,javafx.controls,javafx.fxml -cp test-preprocessor-0.0.1-SNAPSHOT.jar com.edward.testpreprocessor.MutationTestPreprocessorApplication

rem java -cp .;test-preprocessor-0.0.1-SNAPSHOT_win.jar com.example.demo.TestPreprocessorApplication


rem java --module-path "javafx-11.0.2\lib" --add-modules javafx.base,javafx.graphics,javafx.controls,javafx.fxml -cp .;test-preprocessor-0.0.1-SNAPSHOT_win.jar com.edward.testpreprocessor.MutationTestPreprocessorApplication

pause
