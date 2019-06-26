package sample;

import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;


public class Controller implements Initializable {

    private String filePath;
    private MediaPlayer mediaPlayer;


    @FXML
    private void openFileButton(ActionEvent event) {

        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter(
                "Select a file (*.mp4)", "*.mp4", "*.mp3");
        fileChooser.getExtensionFilters().add(filter);
        File file = fileChooser.showOpenDialog(null);
        filePath = file.toURI().toString();

    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button fastRightRawButton;

    @FXML
    private Button pauseButton;

    @FXML
    private Button closeButton;

    @FXML
    private Button fastLeftRawButton;

    @FXML
    private Button rightRawButton;

    @FXML
    private Button playButton;

    @FXML
    private Button leftRawButton;



    @FXML
    void initialize() {
        assert fastRightRawButton != null : "fx:id=\"fastRightRawButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert openFileButton != null : "fx:id=\"openFileButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert pauseButton != null : "fx:id=\"pauseButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert closeButton != null : "fx:id=\"closeButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert fastLeftRawButton != null : "fx:id=\"fastLeftRawButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert rightRawButton != null : "fx:id=\"rightRawButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert playButton != null : "fx:id=\"playButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert leftRawButton != null : "fx:id=\"leftRawButton\" was not injected: check your FXML file 'sample.fxml'.";

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
