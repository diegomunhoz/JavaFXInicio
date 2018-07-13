
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Munhoz
 */
public class TesteCadastro extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent tela = FXMLLoader.load(getClass().getResource("FxmlCadastro.fxml"));
        stage.setTitle("Cadastro de Cliente");
        stage.setScene(new Scene(tela));
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}