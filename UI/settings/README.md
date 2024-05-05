# 

Setting UI Project with JavaFX

This project is a user interface (UI) application developed using JavaFX. It incorporates components from the JFoenix library to enhance the user experience.

## Prerequisites

- Java Development Kit (JDK) installed on your system.
- JavaFX SDK installed, preferably version 17.0.11.
- JFoenix library.

## Launching the Application

To launch the JAR project, follow these steps:

1. Ensure that you have set up the necessary environment variables for JavaFX and JFoenix.
2. Open your command-line interface.
3. Navigate to the directory where the JAR file (`settings.jar`) is located.
4. Run the following command:

arduino

```java
java -jar --module-path "C:\java-libraries\javafx-sdk-17.0.11\lib" --add-modules javafx.controls,javafx.fxml,com.jfoenix settings.jar
```

This command sets the module path to include the JavaFX libraries and specifies the modules required for execution (`javafx.controls`, `javafx.fxml`, and `com.jfoenix`). Replace `"C:\java-libraries\javafx-sdk-17.0.11\lib"` with the actual path to your JavaFX libraries if different.

5. Press Enter to execute the command and launch the application.

## Usage

Once the application is launched, you can interact with the user interface to access and modify settings as needed.

## Troubleshooting

If you encounter any issues during launch or usage, ensure that you have correctly set up the JavaFX and JFoenix dependencies and that your system meets the prerequisites mentioned above. Additionally, check for any error messages in the command-line interface for further guidance.
