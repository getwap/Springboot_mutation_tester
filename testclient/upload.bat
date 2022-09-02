@echo off

cd %~dp0

set PROJECT_ID=
set SOLUTION_PATH=

rem *** read -r -p "Enter the project id: " PROJECT_ID|| exit 100
set /p PROJECT_ID=Enter the project id: 

rem *** test -z "$PROJECT_ID" && exit 100
if "%PROJECT_ID%"=="" (
	echo Project ID was not entered
	goto end
)


rem *** read -r -p "Enter the zip path: " SOLUTION_PATH|| muexit 100
set /p SOLUTION_PATH=Enter the zip path:

rem *** test -z "$SOLUTION_PATH" && exit 100
if "%SOLUTION_PATH%"=="" (
	echo Zip path was not entered
	goto end
)

rem *** curl -v -F project=$PROJECT_ID -F solution=@$SOLUTION_PATH http://localhost:8080/api/submissions
curl -v -F project=%PROJECT_ID% -F "solution=@\"%SOLUTION_PATH%\"" http://localhost:8080/api/submissions

:end
pause