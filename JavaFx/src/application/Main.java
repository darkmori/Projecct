package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Main extends Application {
	public Main() {
		System.out.println("Main() 기본 생성자 메소드");
	}

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init() 메소드");
		super.init();
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("stop() 메소드");
		super.stop();
	}

	@Override
	public void start(Stage primaryStage) {
		System.out.println("start() 메소드");

		VBox root = new VBox();
		root.setPrefWidth(350); // VBox의 너비 설정
		root.setPrefHeight(150); // VBox의 높이 설정
		root.setAlignment(Pos.CENTER); // 컨트롤을 중앙으로 정렬
		root.setSpacing(20); // 컨트롤의 수직간격

		Label label = new Label();
		label.setText(" Hello JavaFx");
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("JAVA FX");
		button.setOnAction(event -> Platform.exit());

		root.getChildren().add(label);
		root.getChildren().add(button);

		Scene scene = new Scene(root);

		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("JAVA FX 제목");
		primaryStage.setScene(scene);
		primaryStage.show();

		try {
			// BorderPane root = new BorderPane();
			// Scene scene = new Scene(root, 400, 400); // 가로*세로 크기
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// primaryStage.setScene(scene);
			// primaryStage.show(); // 윈도우 보여주기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("main() 메소드");
		launch(args);
	}
}
