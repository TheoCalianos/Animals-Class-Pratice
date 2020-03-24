package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class Main extends Application {

    Calculations calculation = new Calculations();
    public static void main (String[]args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Binary Converter");
        Button btn = new Button();
        Button btn0 = new Button();
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        Button btn7 = new Button();
        Button btn8 = new Button();
        Button btn9 = new Button();
        btn.setText("Calculate");
        btn0.setText("0");
        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn5.setText("5");
        btn6.setText("6");
        btn7.setText("7");
        btn8.setText("8");
        btn9.setText("9");
        TextField text = new TextField();
        VBox row3 = new VBox(5);
        row3.getChildren().addAll(btn, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,text);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String SNum = text.getText();
                int INum = Integer.parseInt(SNum);
                INum = INum / 2;
                StringBuilder binaryNum = new StringBuilder();
                while(INum > 0)
                {
                    String bin = String.valueOf(INum % 2);
                    binaryNum.append(bin);
                    INum = INum / 2;

                }
                while(String.valueOf(binaryNum).length() < 8)
                {
                    binaryNum.append(0);
                }
                text.setText(String.valueOf(binaryNum));
            }
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "9";
                text.setText(newText);
            }
        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "8";
                text.setText(newText);
            }
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "7";
                text.setText(newText);
            }
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "6";
                text.setText(newText);
            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "5";
                text.setText(newText);
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "4";
                text.setText(newText);
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "3";
                text.setText(newText);
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "2";
                text.setText(newText);
            }
        });
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "1";
                text.setText(newText);
            }
        });
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String currentText = text.getText();
                String newText = currentText + "0";
                text.setText(newText);
            }
        });
        VBox.setMargin(text, new Insets(5, 150, 0, 150));
        StackPane root = new StackPane();

        primaryStage.setScene(new Scene(root, 500, 500));
        root.getChildren().addAll(row3);
        primaryStage.show();
    }
}
