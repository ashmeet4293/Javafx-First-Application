
package first.javafx.program;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FirstJavafxProgram extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) {
        window=primaryStage; //1st assing the primaryStage to window
        BorderPane border=new BorderPane(); //create BorderPane
        Button button=new Button("Click me "); //create button
        Label txtHello=new Label("THis is frist Prgram"); //create label
        
        border.setCenter(button); //Setting the button in center of the Layout i.e. borderPane
        border.setBottom(txtHello); //Setting the Label in buttom of the layout i.e. borderPane
        Scene scene = new Scene(border,800, 500); //Giving the scene size and adding layout in scene
        
        window.setTitle("First APP"); //setting the title of the window
        window.setScene(scene); //seting the scene in the window
        window.show(); //showing the window
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
