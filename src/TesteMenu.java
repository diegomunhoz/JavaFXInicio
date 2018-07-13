/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Diego Munhoz
 */
public class TesteMenu extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent tela = FXMLLoader.load(getClass().getResource("FxmlMenu.fxml"));
        stage.setTitle("Menu Principal");
        stage.setScene(new Scene(tela));
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}
