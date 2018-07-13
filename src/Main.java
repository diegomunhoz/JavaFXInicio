
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Diego Munhoz
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group grupo = new Group();
        Scene cena = new Scene(grupo, 500, 500, Color.BLACK);

        Rectangle retangulo = new Rectangle(20, 20, 150, 300);
        retangulo.setFill(Color.WHITE);
        grupo.getChildren().add(retangulo);

        stage.setTitle("Primeira Aplicação!");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
