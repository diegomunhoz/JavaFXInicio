import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.stage.Stage;


public class MenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Menu itemMenuCadastro;

    @FXML
    private Menu itemMenuConsulta;
    private String[] args;


    @FXML
    void cadastroCliente(ActionEvent event) {
        System.out.println("Chegou aq!!!");
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("FxmlCadastro.fxml"), resources);
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 264, 444));
            stage.show();

            ((Node)(event.getSource())).getScene().getWindow().hide();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void consultaCliente(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert itemMenuCadastro != null : "fx:id=\"itemMenuCadastro\" was not injected: check your FXML file 'FxmlMenu.fxml'.";
        assert itemMenuConsulta != null : "fx:id=\"itemMenuConsulta\" was not injected: check your FXML file 'FxmlMenu.fxml'.";
    }
}