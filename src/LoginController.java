/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.ClienteDAO;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Cliente;

/**
 * FXML Controller class
 *
 * @author Diego Munhoz
 */
public class LoginController implements Initializable {

    @FXML
    PasswordField txtSenha;

    @FXML
    TextField txtUsuario;
    
    private String[] args;

    public void cancelar(ActionEvent event) {
        txtUsuario.setText(null);
        txtSenha.setText(null);
    }

    public void salvar(ActionEvent event) {
        String login = txtUsuario.getText();
        String senha = txtSenha.getText();
        ClienteDAO dao = new ClienteDAO();
        try {
            List<Cliente> listaCliente = dao.buscarTodos();
            for (Cliente cliente : listaCliente) {
                if (cliente.getLogin().equals(login) && cliente.getSenha().equals(senha)) {
                    System.out.println("Login e senha válidos");
                    TesteCadastro cadastro = new TesteCadastro();
                    cadastro.main(args);
                }else{
                    System.out.println("Login e senha inválido");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {        
    }
}
