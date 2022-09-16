package com.example.javafxapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class MyMain extends Application {

    public static void main(String[] args){
    launch(args);
    } //optionalhelp

    @Override
    public void init() throws Exception {
        System.out.println("init");
        super.init();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start");
        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("app_layout.fxml"));
        VBox rootNode = loader.load();
        MenuBar newMenu = createMenu();
        rootNode.getChildren().add(0,newMenu);
        Scene scene = new Scene(rootNode);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
//        primaryStage.setResizable(false); stage will not be resizable
        primaryStage.show();
    }
    public MenuBar createMenu(){
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
        newMenuItem.setOnAction(event -> System.out.println("New File is Clicked"));
        MenuItem openMenuItem = new MenuItem("Quit");
        openMenuItem.setOnAction(event -> {
            Platform.exit();
            System.exit(0);
        });
        fileMenu.getItems().addAll(newMenuItem, separatorMenuItem, openMenuItem);
        //Help
        Menu helpMenu = new Menu("Help");
        MenuItem aboutMenuItem = new MenuItem("About Us");
        aboutMenuItem.setOnAction(actionEvent -> {
            aboutApp();
        });
        helpMenu.getItems().addAll(aboutMenuItem);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu,helpMenu);
        return menuBar;
    }

    private void aboutApp() {
        Alert alertDialogue = new Alert(Alert.AlertType.INFORMATION);
        alertDialogue.setTitle("My First Desktop");
        alertDialogue.setHeaderText("Learning JavaFX");
        alertDialogue.setContentText("I am just a beginner but soon I will be a pro Developer.\nPlease Rate the App.");
        //Custom Button
        ButtonType yesBtn = new ButtonType("Yes");

        ButtonType noBtn = new ButtonType("No");
        alertDialogue.getButtonTypes().setAll(yesBtn,noBtn);
        Optional<ButtonType> clickedBtn = alertDialogue.showAndWait();
        if (clickedBtn.isPresent() && clickedBtn.get() == yesBtn){
            System.out.println("Yes Button is clicked");
        }else {
            System.out.println("No Button is Clicked");
        }
       // if(clickedBtn.isPresent() && clickedBtn.get() == noBtn){
       //     System.out.println("No Button is Clicked");

    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
        super.stop();
    }
}
