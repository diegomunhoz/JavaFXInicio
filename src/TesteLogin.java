
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Diego Munhoz
 */

public class TesteLogin extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent tela = FXMLLoader.load(getClass().getResource("FxmlLogin.fxml"));
        stage.setTitle("Formulario Login!");
        stage.setScene(new Scene(tela));
        stage.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}