import javafx.application.*; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*;
import javafx.scene.paint.Color; 
import javafx.event.*; 
import javafx.event.EventHandler; 
import javafx.scene.control.Label; 
import javafx.stage.Stage; 
import javafx.geometry.*;
public class Javafx1 extends Application { 

	// launch the application 
	public void start(Stage s) 
	{ 
		// set title for the stage 
		s.setTitle("This is the first JavaFX Application."); 	
		Label l = new Label("Welcome to JavaFX programming.");
		l.setTextFill(Color.MAGENTA); 
		FlowPane r=new FlowPane();
		r.setAlignment(Pos.CENTER);
		r.setHgap(10);
		r.setVgap(10);
		// action event b.setOnAction(event); 

		// add textfield 
		//r.getChildren().add(b); 
		r.getChildren().add(l); 

		// create a scene 
		Scene sc = new Scene(r, 500, 200); 

		// set the scene 
		s.setScene(sc); 

		s.show(); 
	} 

	public static void main(String args[]) 
	{ 
		// launch the application 
		launch(args);
	} 
} 