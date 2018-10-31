
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.control.MenuButton;
import javafx.stage.FileChooser;

import java.io.File;

public class GUI extends Application {

    ImageView myBunnyView;
    Image myBunnyPic;
    Image myBunnyPic2;
    Image myBunnyPic3;
    Image myBunnyPic4;
    Image myBunnyPic5;





    void choice1Press() {

        myBunnyView.setImage(myBunnyPic);
    }

    void choice2Press(){
        myBunnyView.setImage(myBunnyPic2);


    }

    void choice3Press(){
        myBunnyView.setImage(myBunnyPic3);


    }

    void choice4Press(){
        myBunnyView.setImage(myBunnyPic4);


    }

    void choice5Press(){
        myBunnyView.setImage(myBunnyPic5);


    }





    // add more methods to handle the GUI events for all of your choices


    public void start(Stage primaryStage) throws Exception {


        myBunnyPic = new Image("bunny.png");
        // load more pics
        myBunnyPic2 = new Image ("bunny2.jpg");

        myBunnyPic3 = new Image ("bunny3.png");

        myBunnyPic4 = new Image ("bunny4.png");

        myBunnyPic5 = new Image ("bunny5.png");

        FileChooser fileChooser = new FileChooser();







        myBunnyView = new ImageView(myBunnyPic);



        primaryStage.setTitle("Image");

        MenuButton button1 = new MenuButton("Choose Photo");
        button1.setOnAction(e->choice1Press());
        // add more GUI controls to your MenuButton

        //Label label1 = new Label("Option 1");
        MenuItem menuItem1 = new MenuItem("Bunny Pic 2");
        menuItem1.setOnAction(e->choice2Press());

        MenuItem menuItem2 = new MenuItem("Bunny Pic 3");
        menuItem2.setOnAction(e->choice3Press());


        MenuItem menuItem3 =  new MenuItem("Bunny Pic 4");
        menuItem3.setOnAction(e->choice4Press());

        MenuItem menuItem4 =  new MenuItem("Bunny Pic  5");
        menuItem4.setOnAction(e->choice5Press());

        MenuItem menuItem5 = new MenuItem("Select File");
        menuItem5.setOnAction(e -> {
             File chosenFile = fileChooser.showOpenDialog(primaryStage);
             try {
                 System.out.println("Trying to open: "+chosenFile.getCanonicalPath());
                 myBunnyView.setImage(new Image(chosenFile.getPath()));
             } catch (Exception ex) {
                 ex.printStackTrace();
             }

        });







        button1.getItems().addAll(menuItem1, menuItem2, menuItem3, menuItem4, menuItem5);



        HBox myBoxLayout = new HBox();

        myBoxLayout.getChildren().add(button1);

        myBoxLayout.getChildren().add(myBunnyView);

        Scene scene = new Scene(myBoxLayout, 800, 900);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }



}

