import java.io.*;
import java.awt.Desktop;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class encryptor extends Application{
    public void start(Stage s){
        s.setTitle("encryption and decryption");
        Label name=new Label("enter path:");
        Button encry=new Button("encryption");
        Button decry=new Button("decryption");
        Button browse=new Button("browser...");
        TextField pathset=new TextField();
        pathset.setPromptText("file name");
        pathset.setFocusTraversable(false);

        EventHandler<ActionEvent> browbut=new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                FileChooser f=new FileChooser();
                File fi=f.showOpenDialog(null);
                String entpath=fi.getAbsolutePath();
                pathset.appendText(entpath);
            }
        };
        browse.setOnAction(browbut);

        EventHandler<ActionEvent> encrybut=new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                try {
                    FileInputStream ifile=new FileInputStream(pathset.getText());
                    int ch;
                    String con="";
                    while((ch=ifile.read())!=-1){
                        char c=((char)(ch-4));
                        con+=c;
                    }
                    ifile.close();
                    FileWriter ofile=new FileWriter(pathset.getText(),false);
                    ofile.write(con);
                    pathset.clear();
                    ofile.close();
                }
                catch (Exception e1) {
                    e1.printStackTrace();
                } 
            }
        };
        encry.setOnAction(encrybut);

        EventHandler<ActionEvent> decrybut=new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e){
                Desktop desktop=Desktop.getDesktop();
                File opFile=new File(pathset.getText());
                try {
                    FileInputStream ienfile=new FileInputStream(pathset.getText());
                    int ch;
                    String co="";
                    while((ch=ienfile.read())!=-1){
                        char c1=((char)(ch+4));
                        co+=c1;
                    }
                    ienfile.close();
                    FileWriter ofile=new FileWriter(pathset.getText(),false);
                    ofile.write(co);
                    pathset.clear();
                    ofile.close();

                    desktop.open(opFile);
                } catch (Exception e1) {

                }
                }
            };
        decry.setOnAction(decrybut);

        GridPane grid=new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(20); 
        grid.addRow(3,name,pathset,browse);
        grid.addRow(5,encry,decry);
        BorderPane b=new BorderPane();
        b.setCenter(grid);
        Scene sc=new Scene(b,1080,540);
        s.setScene(sc);
        s.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
