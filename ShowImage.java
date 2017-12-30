//Tsagan Garyaeva
//COMP-271
//Lab 5 Cards

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImage extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  GridPane pane = new GridPane();
      pane.setAlignment(Pos.CENTER);
      // choose 3 random distinct cards from the deck
      int count = 0;
      while (count < 3) {
          int card = (int) (Math.random() * 52);
              // card png files start from 1, so increment card by one
              pane.add(new ImageView(new Image("image/card/"+(++card)+".png")), count, 0);
              count++;
      }
      Scene scene = new Scene(pane, 250, 150);
      primaryStage.setTitle("3 Random Cards");
      primaryStage.setScene(scene);
      primaryStage.show();
}
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
