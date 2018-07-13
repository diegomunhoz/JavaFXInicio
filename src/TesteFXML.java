
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Diego Munhoz
 */

public class TesteFXML extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent tela = FXMLLoader.load(getClass().getResource("formulario.fxml"));
        stage.setTitle("Formulario FXML");
        stage.setScene(new Scene(tela,500,150));
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}