//package com.example.demo2;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventHandler.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.event.EventHandler;
import  javafx.event.ActionEvent;
public class JavaFx extends Application implements EventHandler<ActionEvent>{
    RadioButton r1,r2,r3;
    CheckBox c1,c2,c3 ;
    ChoiceBox<Integer> ch;
    Text t;
    FontWeight fw;
    FontPosture fp;

    public void start(Stage stage)throws Exception{
        t = new Text("Hello World");

        HBox hb0 = new HBox();
        hb0.getChildren().add(t);
        r1 = new RadioButton("Red");
        r2 = new RadioButton("Green");
        r3 = new RadioButton("Blue");

        ToggleGroup tg = new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);

        HBox hb1 = new HBox();
        hb1.getChildren().addAll(r1,r2,r3);


        c1 = new CheckBox("Normal");
        c2 = new CheckBox("Italic");
        c3 = new CheckBox("Bold");

        HBox hb2 = new HBox();
        hb2.getChildren().addAll(c1,c2,c3);
        ch = new ChoiceBox<>();
        ch.getItems().addAll(10,20,30,40);

        VBox vb = new VBox();
        vb.getChildren().addAll(hb0,hb1,hb2,ch);
        Scene sc = new Scene(vb,400,400);
        stage.setScene(sc);
        stage.show();

        hb0.setSpacing(10);
        hb0.setPadding(new Insets(10,10,10,10));
        hb1.setSpacing(10);
        hb1.setPadding(new Insets(10,10,10,10));
        hb2.setSpacing(10);
        hb2.setPadding(new Insets(10,10,10,10));
        vb.setPadding(new Insets(10,10,10,10));
        r1.setOnAction(this);
        r2.setOnAction(this);
        r3.setOnAction(this);
        c1.setOnAction(this);
        c2.setOnAction(this);
        c3.setOnAction(this);
        ch.setOnAction(this);
    }
    public void handle(ActionEvent e){
        if(r1.isSelected()){
            t.setFill(Color.valueOf("RED"));
        }
        if(r2.isSelected()){
            t.setFill(Color.valueOf("GREEN"));
        }
        if(r3.isSelected()){
            t.setFill(Color.valueOf("BLUE"));
        }

        if (c2.isSelected()){
            fw = FontWeight.BOLD;
        }
        if (c3.isSelected()){
            fp = FontPosture.ITALIC;
        }
        t.setFont(Font.font("Times New Roman",fw,fp,ch.getValue()));
        }


}
