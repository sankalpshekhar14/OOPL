import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class Javafx3 extends Application{
  
    public static void main(String[] args) {
        launch(args);
    }
      
    @Override
    public void start(Stage s) {
        s.setTitle("Login Credentials");
         
       
        //Adding GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
         
       //Implementing Nodes for GridPane
        Label lblUserName = new Label("Username");
        final TextField txtUserName = new TextField();
        Label lblPassword = new Label("Password");
        final PasswordField pf = new PasswordField();//to get it hidden
        Button btnLogin = new Button("Sign in");
        final Label lbl = new Label();
         
        //Adding Nodes to GridPane layout
        gridPane.add(lblUserName, 0, 0);
        gridPane.add(txtUserName, 1, 0);
        gridPane.add(lblPassword, 0, 1);
        gridPane.add(pf, 1, 1);
        gridPane.add(btnLogin, 2, 1);
        gridPane.add(lbl, 1, 2);
        
        //String str="Welcome ";
        //String user;
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
         public void handle(ActionEvent event) {
          String str="Welcome ";
        String user;
          user = txtUserName.getText();

          str=str.concat(user);
          lbl.setText(str);

      }
  });

    Scene sc = new Scene(gridPane, 500, 200); 

        // set the scene 
        s.setScene(sc); 

        s.show(); 
    } 

   
} 
