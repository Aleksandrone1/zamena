package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    public String rotate1(String s) {
        char[] s2 = s.toCharArray();
        StringBuilder s1= new StringBuilder();
        for (char c : s2) {
            if (Character.isLowerCase(c)) {
                String s5 = String.valueOf(c);
                s1.append(s5.toUpperCase());
            } else {
                String s5 = String.valueOf(c);
                s1.append(s5.toLowerCase());
            }
        }

        return s1.toString(); }
    public void start(Stage stage) {
        Button button=new Button("Кнопка для замены букв");
        TextField textField = new TextField();Pane root = new Pane();
        AnchorPane.setTopAnchor(textField, 10.0);
        AnchorPane.setLeftAnchor(textField, 350.0);
        AnchorPane.setBottomAnchor(textField, 150.0);
        TextField textField1 = new TextField();
        AnchorPane.setBottomAnchor(textField1,50.0);
        AnchorPane.setLeftAnchor(textField1, 350.0);
        AnchorPane.setTopAnchor(textField1, 150.0);
        AnchorPane anchorPane=new AnchorPane(textField,textField1);
        button.setOnAction(event->{
            String s=textField.getText();
            textField1.setText(rotate1(s));
        });
        VBox vBox=new VBox(button);
        Pane root1 = new AnchorPane(anchorPane,vBox,root);
        Scene scene = new Scene(root1);
        stage.setScene(scene);
        stage.setTitle("Замена букв");
        stage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
