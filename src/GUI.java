
        import javafx.application.Application;
        import javafx.stage.Stage;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.MenuButton;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.layout.HBox;
        import javafx.scene.control.MenuButton;


        public class GUI extends Application {

            void handleButtonPress() {

                System.out.println("HI!!!!");
            }


    public void start(Stage primaryStage) throws Exception {


        Image myBunnyPic = new Image("bunny.png");

        ImageView myBunnyView = new ImageView(myBunnyPic);

        primaryStage.setTitle("Image");

        MenuButton button1 = new MenuButton("Choose Photo");

        button1.setOnAction(e->handleButtonPress());

        MenuButton("Cute Cat", myBunnyPic);



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

