## START JAVAFX IN VS CODE

- https://openjfx.io/openjfx-docs/ (DOCUMENTATIONS)

- GO TO JAVA PROJECTS > referenced libraries
  
  - add all libraries  lib in **JAVAFX SDK**
  
  - go to **run > Add Configuration**
  
  - add this in end 
  
  ```json
  "vmArgs": "--module-path \"C:/javafx-sdk-20.0.1/lib\" --add-modules javafx.controls,javafx.fxml"
  ```

- create controller class and go to scene view > controller skeleton and past it in the controller and give the name in the scene
