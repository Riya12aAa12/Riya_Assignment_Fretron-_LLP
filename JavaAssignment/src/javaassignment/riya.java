package javaassignment;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class riya extends Application {

    @Override
    public void start(Stage primaryStage) {
       
        Canvas canvas = new Canvas(600, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

       
        drawFlightPaths(gc);

        
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Flight Paths");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawFlightPaths(GraphicsContext gc) {
       
        gc.setLineWidth(2);

        
        gc.setStroke(javafx.scene.paint.Color.BLUE);
        gc.strokeLine(50, 300, 150, 200);
        gc.strokeLine(150, 200, 250, 100);

       
        gc.setStroke(javafx.scene.paint.Color.RED);
        gc.strokeLine(50, 300, 200, 250);
        gc.strokeLine(200, 250, 300, 150);

    
        gc.setStroke(javafx.scene.paint.Color.GREEN);
        gc.strokeLine(50, 300, 300, 200);
        gc.strokeLine(300, 200, 450, 100);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
