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

public class JavaFX2 extends Application {
GraphicsContext gc;
String st="";
public static void main(String[] args) {
launch(args);
}
public void start(Stage myStage) {
myStage.setTitle("Draw Shapes");

FlowPane rootNode = new FlowPane(10, 10);


Scene myScene = new Scene(rootNode, 300, 600);

myStage.setScene(myScene);
Canvas canvas = new Canvas(300,500);
 gc = canvas.getGraphicsContext2D();

RadioButton rbc = new RadioButton("circle");
RadioButton rbr = new RadioButton("rectangle");
RadioButton rbl = new RadioButton("line");
ToggleGroup tg = new ToggleGroup();
rbc.setToggleGroup(tg);
rbr.setToggleGroup(tg);
rbl.setToggleGroup(tg);

rbc.setOnAction(new MyHandler()); 
rbr.setOnAction(new MyHandler()); 
rbl.setOnAction(new MyHandler()); 
rootNode.getChildren().addAll(rbc, rbr, rbl, canvas);
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
          
          gc.setFill(Color.BLUE);
	  gc.fillRect(0,0,300,500);
          
          if("line".equals(st)){
             
	     gc.strokeLine(x,y,x1,y1);
             gc.strokeText("line drawn",25,450);
             }
          else if("rectangle".equals(st)){
	     gc.strokeRect(x,y,x1-x,y1-y);
             gc.strokeText("Area of rectangle=" + (x1-x)*(y1-y),25,450);
             }
          else {
             gc.strokeOval(x,y,x1-x,x1-x);
             gc.strokeText("Area of circle=" + 3.14*(x1-x)*(x1-x)/(37.8*37.8),25,450);
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