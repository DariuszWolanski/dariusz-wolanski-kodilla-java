package com.kodilla.blackjack;

public class BlackJack {

//#1
//    public static void main(String[] args) {
//        System.out.println("Uruchamiamy aplikację JavaFx");
//        launch(args);
//    }
//
//    @Override
//    public void init() throws Exception {
//        System.out.println("Wewnątrz metody init().");
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        System.out.println("Wewnątrz metody start().");
//        primaryStage.setTitle("Przyciski i zdarzenia w JavaFX");
//
//        FlowPane rootNode = new FlowPane(100, 100);
//        rootNode.setAlignment(Pos.CENTER);
//
//        Scene myScene = new Scene(rootNode, 300, 200);
//        primaryStage.setScene(myScene);
//
//        Label response = new Label("Przycisk");
//
//        Button up = new Button("Gora");
//        Button down = new Button("Dol");
//
//        up.setOnAction(event ->  response.setText("Nacisnales przycisk gora"));
//
//        down.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                response.setText("Nacisnales przycisk dol");
//            }
//        });
//
//        rootNode.getChildren().addAll(up, down, response);
//        primaryStage.show();
//    }
//
//    @Override
//    public void stop() throws Exception {
//        System.out.println("Wewnątrz metody stop().");
//    }

//    //#2
//    CheckBox cbSmartphone;
//    CheckBox cbTablet;
//    CheckBox cbNotebook;
//    CheckBox cbDestkop;
//
//    Label response;
//    Label selected;
//
//    String computers;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//
//    @Override
//    public void start(Stage myStage) throws Exception {
//        myStage.setTitle("Prezentacja pol wyboru");
//
//        FlowPane rootPane = new FlowPane(Orientation.VERTICAL, 10, 10);
//
//        rootPane.setAlignment(Pos.CENTER);
//
//        Scene myScene = new Scene(rootPane, 230, 200);
//        myStage.setScene(myScene);
//
//        Label handing = new Label("Jakie komputery posiadasz?");
//
//        response = new Label("");
//
//        selected = new Label("");
//
//        cbSmartphone = new CheckBox("Smartphone");
//        cbTablet = new CheckBox("Tablet");
//        cbNotebook = new CheckBox("Notebook");
//        cbDestkop = new CheckBox("Stacjonarny");
//
//        cbSmartphone.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                if (cbSmartphone.isSelected())
//                    response.setText("Zaznaczono pole 'smartfone'");
//                else
//                    response.setText("Usunieto zaznaczenie pola 'smartfom'");
//
//                showAll();
//
//            }
//    }
//}
}
