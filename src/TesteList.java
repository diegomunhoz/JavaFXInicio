
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Diego Munhoz
 */
public class TesteList extends Application{

    VBox vb = new VBox();
    Label lbl = new Label();
    ListView<String> list = new ListView<>();
    ObservableList<String> data = FXCollections.observableArrayList(
            "Cobol",
            "Java",
            "Php",
            "C#");
    
    public static void main(String[] args){
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Testando List View");
        list.setItems(data);
        initActions();
        vb.getChildren().addAll(list, lbl);
        Scene scene = new Scene(vb, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void initActions(){
        list.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent t) {
                if (list.getSelectionModel().getSelectedIndex() >= 0) {
                    lbl.setText("Clicado na lista");
                }
            }
        });
    }
    
}
