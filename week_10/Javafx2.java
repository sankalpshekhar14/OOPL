import javafx.application.*; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*;
import javafx.scene.paint.Color; 
import javafx.event.*; 
//import javafx.scene.control.*;
import javafx.event.EventHandler; 
import javafx.scene.control.Label; 
import javafx.stage.Stage; 
import javafx.geometry.*;
import java.util.*;
import java.io.*;
public class Javafx2 extends Application { 

	// launch the application 
	public void start(Stage s) 
	{ 
		// set title for the stage 
		s.setTitle("Generate Multiplication Table."); 	
		Label l = new Label("Enter a number");
		TextField b = new TextField();
		Label result=new Label("");
	EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent e) 
			{ 
				int i=Integer.parseInt(b.getText());
		int n=1;
		String str="";
		String str2;
		for(int j=1;j<=10;j++){ n=i*j;
			str2=Integer.toString(n);
			str=str.concat(str2);
			str=str.concat("\n");

		} 
		result.setText(str);
			} 
		}; 

		// when enter is pressed 
		b.setOnAction(event); 


		
		l.setTextFill(Color.MAGENTA); 
		FlowPane r=new FlowPane();
		//r.setAlignment();
		r.setHgap(10);
		r.setVgap(10);
		// action event b.setOnAction(event); 

		// add textfield 
		//r.getChildren().add(b); 
		r.getChildren().addAll(l,b,result); 

		// create a scene 
		Scene sc = new Scene(r, 500, 200); 

		// set the scene 
		s.setScene(sc); 

		s.show(); 
	} 

	public static void main(String[] args) {
		launch(args);
	}

}