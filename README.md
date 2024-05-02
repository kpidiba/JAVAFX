# JAVAFX

### DESCRIPTION

**JavaFX** est un [framework](https://fr.wikipedia.org/wiki/Framework "Framework") et une [bibliothèque d'interface utilisateur](https://fr.wikipedia.org/wiki/Biblioth%C3%A8que_graphique "Bibliothèque graphique") issue du projet [OpenJFX](https://fr.wikipedia.org/wiki/OpenJFX "OpenJFX"), qui permet aux développeurs [Java](https://fr.wikipedia.org/wiki/Java_(langage) "Java (langage)") de créer une [interface graphique](https://fr.wikipedia.org/wiki/Interface_graphique "Interface graphique") pour des applications de bureau, des [applications internet riches](https://fr.wikipedia.org/wiki/Rich_desktop_application "Rich desktop application") et des applications smartphones et tablettes tactiles.

Créé à l'origine par [Sun MicroSystems](https://fr.wikipedia.org/wiki/Sun_Microsystems "Sun Microsystems"), puis développé par [Oracle](https://fr.wikipedia.org/wiki/Oracle_(entreprise) "Oracle (entreprise)") après son rachat et ce, jusqu'à la version 11 du [JDK](https://fr.wikipedia.org/wiki/Java_Development_Kit "Java Development Kit"), c'est depuis lors à la communauté OpenJFX que revient la poursuite de son développement[1](https://fr.wikipedia.org/wiki/JavaFX#cite_note-1).

Cette bibliothèque a été conçue pour remplacer [Swing](https://fr.wikipedia.org/wiki/Swing_(Java) "Swing (Java)") et [AWT](https://fr.wikipedia.org/wiki/Abstract_Window_Toolkit "Abstract Window Toolkit"),
 qui ont été développés à partir de la fin des années 90, pour pallier 
les défauts de ces derniers et fournir de nouvelles fonctionnalités 
(dont le support des écrans tactiles).

Le cycle de sortie d'une nouvelle version de JavaFX correspond à celui de Java, soit tous les 6 mois.

### COMPOSANTS

JavaFX est composé des 7 modules suivants:

- **javafx.base**: Définit l'API de base
- **javafx.controls**: Définit la majorité des composants graphiques de l'API
- **javafx.fxml**: Définit l'API relative au langage [FXML](https://fr.wikipedia.org/wiki/FXML "FXML") qui permet de décrire une interface utilisateur d'une manière alternative à l'écriture de lignes de code
- **javafx.graphics**: Définit l'API relative aux conteneurs, 
  animations, effets visuels, formes 2D et 3D, images, impression, 
  fenêtres, événements, robots, au support du CSS et à l'application
- **javafx.media**: Définit l'API dédié à la lecture de contenu audio et vidéo
- **javafx.swing**: Définit l'API qui fournit le support d’interopérabilité entre JavaFX et [Swing](https://fr.wikipedia.org/wiki/Swing_(Java) "Swing (Java)")
- **javafx.web**: Définit l'API dédié à l'affichage de contenu web (notamment un éditeur HTML et un moteur de rendu de pages web basé sur [WebKit](https://fr.wikipedia.org/wiki/WebKit "WebKit"))

### GENERATE JAR VS CODE

- CLIQUER SUR EXPORT JAR FILE

- COMMAND TO LAUNCH IT

```bash
JAVA -jar --module-path /path/to/JavaFX/lib --add-modules=javafx.controls jar_file_name.jar
```

- LAUNCH4j install

- specify output file,jar file,in JRE -> version ,JVM options( --enable-preview --module-path C:/javafx-sdk-20.0.1/lib --add-modules=javafx.controls,javafx.media,javafx.fxml,javafx.graphics )

## Scene Builder: l'outil de conception d'interfacesArticle détaillé : [Scene Builder](https://fr.wikipedia.org/wiki/Scene_Builder "Scene Builder").

**Scene Builder** est un [outil interactif de conception d'interface graphique](https://fr.wikipedia.org/wiki/Constructeur_d%27interface_graphique "Constructeur d'interface graphique") pour JavaFX. Il permet de créer des interfaces utilisateurs rapidement et sans avoir besoin de [coder](https://fr.wikipedia.org/wiki/Programmation_informatique "Programmation informatique"): il en résulte des fichiers au format [FXML](https://fr.wikipedia.org/wiki/FXML "FXML") qui sont ensuite chargés par le programme pour afficher une interface graphique à ses utilisateurs.

Développé initialement par Oracle et sous le nom JavaFX Scene Builder[5](https://fr.wikipedia.org/wiki/JavaFX#cite_note-5), son code source a été publié en [open source](https://fr.wikipedia.org/wiki/Open_source "Open source") à partir de sa version 2.0[6](https://fr.wikipedia.org/wiki/JavaFX#cite_note-6).

Depuis, le logiciel est principalement développé et soutenu par la société [Gluon](https://fr.wikipedia.org/w/index.php?title=Gluon_(entreprise)&action=edit&redlink=1 "Gluon (entreprise) (page inexistante)")[7](https://fr.wikipedia.org/wiki/JavaFX#cite_note-7).

### **SETUP**

To properly set up your JavaFX project environment, follow these steps:

1. **Install Necessary Extensions:**
   
   - Ensure you have the following extensions installed in your development environment:
     - JavaFX Support
     - FXML Viewer
     - Java Extension Pack

2. **Install Scene Builder:**
   
   - Download the latest version of Scene Builder from [Gluon's official website](https://gluonhq.com/scene-builder-17-release/) and install it.

3. **Download JDK and SDK:**
   
   - Download the JavaFX SDK for x64 architecture from [Gluon's website](https://gluonhq.com/products/javafx/).
   - Extract the downloaded SDK to `C:/` and select the second folder during extraction.

4. **Create Java Project:**
   
   - Start by creating a new Java project without any build tools.

5. **Configure Project Settings:**
   
   - Navigate to the main directory of your Java project, and it will appear in the sidebar or at the bottom of the IDE.
   - Click on "References Libraries" and add all the necessary SDK libraries for JavaFX.

6. **Add Run Configuration:**
   
   - Click on "Run" and then "Add Configuration" to configure the run settings.

7. **Set VM Options:**
   
   - Go to the documentation for `javax` in NetBeans and search for VM options.
   - Copy and paste the following VM options

```java
"vmArgs": "--module-path \"C:/javafx-sdk-20.0.1/lib\" --add-modules javafx.controls,javafx.fxml"
```

**Source Code:**

- Use the provided Java source code to initialize a basic JavaFX application. Ensure that you replace the existing code with the provided one.
- This code sets up a simple "Hello World" application using JavaFX.

```java
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
       btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("Hello World!");
            }

        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

  /*
  Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
  Scene scene = new Scene(root);
  */

  Scene scene = new Scene(root, 300, 250);

  primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

 public static void main(String[] args) {
        launch(args);
    }
}
```

**Create Scene and Controller:**

- Create a scene and add it to the source code as per your application requirements.
- Navigate to `View` and select `Show Sample Controller Skeleton`.
- Add the controller class to the view to manage the application logic.
