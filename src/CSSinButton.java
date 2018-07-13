
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Diego Munhoz
 */
public class CSSinButton extends Application {

    VBox vb = new VBox();
    Button button = new Button("Botao de Teste");

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CSS");
        vb.setId("root");
        button.setId("idbotao");
        vb.setPadding(new Insets(30, 50, 50, 50));
        vb.setSpacing(10);
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().add(button);

        //Adicionando VBox na scene
        Scene scene = new Scene(vb);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("botao.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}