# DEPLOY JAVAFX PROJECT

1. Launch4j
- Install [Launch4j](https://launch4j.sourceforge.net/).
- Specify the following:
  - Output file.
  - JAR file.
  - JRE version.(facultatif)
  - JVM options (`--enable-preview --module-path C:/javafx-sdk-20.0.1/lib --add-modules=javafx.controls,javafx.media,javafx.fxml,javafx.graphics`).
2. INNO SETUP: [Inno Setup Downloads](https://jrsoftware.org/isdl.php) 
- Select File > New
- Put application name , version, Publisher, sit web
- Destination folder  -> select custom
- put C:\
- Application folder put the javafx lib subfolder like **javafx-sdk-20.0.1**
- Select the exe 
- add **/lib** Folder
- 
