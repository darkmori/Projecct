package application;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {
	@FXML
	private Button myButton;

	@FXML
	private void initialize() {
		//
		myButton.setOnAction((event) -> {
			System.out.println("취소 버튼 클릭");
			Platform.exit();
		});
	}
}
