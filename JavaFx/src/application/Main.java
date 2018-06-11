package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	public Main() {
		System.out.println("Main() 기본 생성자");
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
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400); // 가로*세로 크기
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show(); // 윈도우 보여주기
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("main() 메소드");
		launch(args);
	}
}
