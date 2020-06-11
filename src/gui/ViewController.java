package gui;



import gui.utils.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ViewController {
	@FXML
	private Button btTeste;
	 final String AUDIO_URL = getClass().getResource("./bell.mp3").toString();

	 
	 @FXML
	public void onBtTesteAction() {
		Alerts.showAlert("alert title", null, "alert content", AlertType.INFORMATION);
	    final Media media = new Media(AUDIO_URL);
	    final MediaPlayer mediaPlayer = new MediaPlayer(media);
	    //mediaPlayer.play();
	}
	
	@FXML
	public void onMenuConfigPrintAction() {
		System.out.println("Print");
	}
}
