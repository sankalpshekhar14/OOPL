import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.input.MouseEvent;
import javafx.geometry.*;
import java.util.*;

public class JavaFX3 extends Application {
GraphicsContext gc;
String st="";
public static void main(String[] args) {
launch(args);
}
public void start(Stage myStage) {
myStage.setTitle("Random Circle");

FlowPane rootNode = new FlowPane(10, 10);


Scene myScene = new Scene(rootNode, 300, 600);

myStage.setScene(myScene);
Canvas canvas = new Canvas(300,500);
 gc = canvas.getGraphicsContext2D();

RadioButton rb1 = new RadioButton("Area");
RadioButton rb2 = new RadioButton("Radius");
RadioButton rb3 = new RadioButton("Diameter");
RadioButton rb4 = new RadioButton("Circumference");
ToggleGroup tg = new ToggleGroup();
rb1.setToggleGroup(tg);
rb2.setToggleGroup(tg);
rb3.setToggleGroup(tg);
rb4.setToggleGroup(tg);
rb1.setOnAction(new MyHandler()); 
rb2.setOnAction(new MyHandler()); 
rb3.setOnAction(new MyHandler()); 
rb4.setOnAction(new MyHandler());
rootNode.getChildren().addAll(rb1, rb2, rb3, rb4, canvas);
myStage.show();
canvas.addEventFilter(MouseEvent.ANY, new EventHandler<MouseEvent>() {
    double x,y,x1,y1;
    public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getEventType() == MouseEvent.MOUSE_CLICKED){
            
            x=mouseEvent.getX();
            y=mouseEvent.getY();
        }
        if(mouseEvent.getEventType() == MouseEvent.MOUSE_DRAGGED ){
           x1=mouseEvent.getX();
            y1=mouseEvent.getY();
          
          gc.setFill(Color.WHITE);
	        gc.fillRect(0,0,300,500);
           gc.strokeOval(x,y,x1-x,x1-x);
          if("Area".equals(st)){
              gc.strokeText("Area of circle=" + 3.14*(x1-x)*(x1-x)/(37.8*37.8),25,450);
             }
          else if("Radius".equals(st)){
             gc.strokeText("Radius of Circle=" + (x1-x),25,450);
             }
          else if("Diameter".equals(st)) {
            gc.strokeText("Diameter of Circle=" + 2*(x1-x),35,450);
            }
          else{
            gc.strokeText("Circumference of Circle=" + (2*3.14*(x1-x)),25,450);
          }	
    }
}});
}
class MyHandler implements EventHandler<ActionEvent>{
public void handle(ActionEvent ae) {
 st=((RadioButton)ae.getSource()).getText();


}
}
}