package application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
public class controller {
@FXML
	
	private Circle myCircle;
//declare the coordinates of circle
	private double x;
	private double y;
	public void up(ActionEvent e) {
		myCircle.setCenterY(setY(-1));
	}
	public void down(ActionEvent e) {
		myCircle.setCenterY(setY(+1));
	}
	public void left(ActionEvent e) {
		myCircle.setCenterX(setX(-1));
	}
	public void right(ActionEvent e) {
		myCircle.setCenterX(setX(+1));
	}
	public double getY() {
		return y;
	}
	public double setY(double y) {
		this.y = y;
		return y;
	}
	public double getX() {
		return x;
	}
	public double setX(double x) {
		this.x = x;
		return x;
	}
	public void changeToScene2(ActionEvent e) throws IOException
	{
		Parent root1 = FXMLLoader.load(getClass().getResource("Main_1.fxml"));
		Scene scene1 = new Scene(root1,400,400);
		Stage s1=(Stage) (((Node) e.getSource()).getScene().getWindow());
		s1.setScene(scene1);
		s1.show();
	}
	public void changeToScene1(ActionEvent e) throws IOException
	{
		Parent root1 = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene1 = new Scene(root1,400,400);
		Stage s1=(Stage) (((Node) e.getSource()).getScene().getWindow());
		s1.setScene(scene1);
		s1.show();
	}


}
