import dao.ClienteDAO;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Cliente;

/**
 * FXML Controller class
 *
 * @author Diego Munhoz
 */
public class CadastroController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button jbtCancelar;

    @FXML
    private Button jbtSalvar;

    @FXML
    private TextField txtCidade;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;


    @FXML
    void cancelar(ActionEvent event) {
        limparTela();
    }

    @FXML
    void salvar(ActionEvent event) {
        ClienteDAO dao = new ClienteDAO();
        Cliente cliente = new Cliente();
        cliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
        cliente.setNome(txtNome.getText());
        cliente.setCidade(txtCidade.getText());
        cliente.setIdade(Integer.parseInt(txtIdade.getText()));
        cliente.setLogin(txtLogin.getText());
        cliente.setSenha(txtSenha.getText());
        try {
            dao.salvar(cliente);
            limparTela();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void initialize() {
        assert jbtCancelar != null : "fx:id=\"jbtCancelar\" was not injected: check your FXML file 'FxmlCadastro.fxml'.";
        assert jbtSalvar != null : "fx:id=\"jbtSalvar\" was not injected: check your FXML file 'FxmlCadastro.fxml'.";
        assert txtCidade != null : "fx:id=\"txtCidade\" was not injected: check your FXML file 'FxmlCadastro.fxml'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'FxmlCadastro.fxml'.";
        assert txtIdade != null : "fx:id=\"txtIdade\" was not injected: check your FXML file 'FxmlCadastro.fxml'.";
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'FxmlCadastro.fxml'.";
        assert txtLogin != null : "fx:id=\"txtLogin\" was not injected: check your FXML file 'FxmlCadastro.fxml'.";
        assert txtSenha != null : "fx:id=\"txtSenha\" was not injected: check your FXML file 'FxmlCadastro.fxml'.";
    }
    
    public void limparTela(){
        txtCodigo.setText(null);
        txtNome.setText(null);
        txtCidade.setText(null);
        txtIdade.setText(null);
        txtLogin.setText(null);
        txtSenha.setText(null);
    }

}