package application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;


public class FPController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	@FXML
	public void openSP(ActionEvent event) {
		Parent rootParent = null;
		try {
			rootParent = javafx.fxml.FXMLLoader.load(getClass().getResource("SP.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(rootParent);
		
		Main.globalStage.setScene(scene);
		Main.globalStage.show();
	}
	
	@FXML
	public void openAD(ActionEvent event) {
		Parent rootParent = null;
		try {
			rootParent = javafx.fxml.FXMLLoader.load(getClass().getResource("AD.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(rootParent);
		
		Main.globalStage.setScene(scene);
		Main.globalStage.show();
	}
	
	@FXML
	public void openLK(ActionEvent event) {
		Parent rootParent = null;
		try {
			rootParent = javafx.fxml.FXMLLoader.load(getClass().getResource("LK.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(rootParent);
		
		Main.globalStage.setScene(scene);
		Main.globalStage.show();
	}
	
	@FXML
	public void openRD(ActionEvent event) {
		Parent rootParent = null;
		try {
			rootParent = javafx.fxml.FXMLLoader.load(getClass().getResource("RD.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(rootParent);
		
		Main.globalStage.setScene(scene);
		Main.globalStage.show();
	}
	
	@FXML
	public void openGMB(ActionEvent event) {
		Parent rootParent = null;
		try {
			rootParent = javafx.fxml.FXMLLoader.load(getClass().getResource("GMB.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(rootParent);
		
		Main.globalStage.setScene(scene);
		Main.globalStage.show();
	}
			
	@FXML
	public void openFP(ActionEvent event) {
		Parent rootParent = null;
		try {
			rootParent = javafx.fxml.FXMLLoader.load(getClass().getResource("FP.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(rootParent);
		
		Main.globalStage.setScene(scene);
		Main.globalStage.show();
	}
	
	@FXML
	public void openPG(ActionEvent event) {
		Parent rootParent = null;
		try {
			rootParent = javafx.fxml.FXMLLoader.load(getClass().getResource("PG.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(rootParent);
		
		Main.globalStage.setScene(scene);
		Main.globalStage.show();
	}
	
	@FXML
	public void openTC(ActionEvent event) {
		Parent rootParent = null;
		try {
			rootParent = javafx.fxml.FXMLLoader.load(getClass().getResource("TC.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(rootParent);
		
		Main.globalStage.setScene(scene);
		Main.globalStage.show();
	}
	
	
	@FXML
	public void openMP(ActionEvent event) {
		Parent rootParent = null;
		try {
			rootParent = javafx.fxml.FXMLLoader.load(getClass().getResource("MP.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(rootParent);
		
		Main.globalStage.setScene(scene);
		Main.globalStage.show();
	}
	
	
	
	
		@FXML
		private Button logButton;

		@FXML
		private Button regButton;

	
		@FXML
	    private Button gamButton;

	    @FXML
	    private Button ticButton;
	
	    @FXML
	    private Label adultPrice;

	    @FXML
	    private Label childPrice;

	    @FXML
	    private Label pensionerPrice;

	    @FXML
	    private TextField howMuchAdult;

	    @FXML
	    private TextField howMuchChild;

	    @FXML
	    private TextField howMuchPensioner;

	    @FXML
	    private Label sumField;
	    
	    @FXML
	    private Button enterButton;
	    
	    @FXML
	    private Button nextButton;
	    
	    @FXML
	    private Button buyButton;
	    
	    @FXML
	    private Button getSumButton;
	    
	    @FXML
	    private Button loginButton;

	    @FXML
	    private PasswordField pasw;

	    @FXML
	    private TextField usern;

	    @FXML
	    private Label wrongLogin;
	    
	    String nameofthefile;

	    @FXML
	    void checkUser(ActionEvent event) throws IOException {
	    	
	    	if(usern.getText().equals("admin") && pasw.getText().equals("123")) {
	    		
	    		nameofthefile = "GMB.fxml";
	    		
	    	}else if(usern.getText().isEmpty() && pasw.getText().isEmpty()) {
	    		wrongLogin.setText("Please enter your data!");
	    		return;
	    		
	    	}else {
	    		wrongLogin.setText("Wrong username or password!");
	    		return;
	    	}
	    	
	    	Parent root = FXMLLoader.load(getClass().getResource(nameofthefile));
	    	Stage newstage = new Stage();
	    	Scene scene = new Scene(root);
	    	newstage.setScene(scene);
	    	newstage.show();
	    			
	    			
	    }

	    @FXML
	    void userLogin(ActionEvent event) throws IOException {
	    	checkUser(event);
	    }
	    
	    
	    @FXML
	    public void getSum(ActionEvent event) {
	        double priceA = Double.parseDouble(adultPrice.getText());
	        int howA = getQuantity(howMuchAdult);
	        double priceC = Double.parseDouble(childPrice.getText());
	        int howC = getQuantity(howMuchChild);
	        double priceP = Double.parseDouble(pensionerPrice.getText());
	        int howP = getQuantity(howMuchPensioner);

	        double totalAdultPrice = priceA * howA;
	        double totalChildPrice = priceC * howC;
	        double totalPensionerPrice = priceP * howP;

	        double sum = totalAdultPrice + totalChildPrice + totalPensionerPrice;
	        sumField.setText(String.valueOf(sum));
	    }

	    private int getQuantity(TextField textField) {
	        try {
	            int quantity = Integer.parseInt(textField.getText());
	            textField.setStyle(null); 
	            return quantity;
	        } catch (NumberFormatException e) {
	            textField.setStyle("-fx-border-color: red;"); 
	            return 0;
	        }
	    }
	    
	    @FXML
	    private PasswordField confPasswordField;
	    
	    @FXML
	    private PasswordField pasPasswordField;

	    @FXML
	    private TextField adressTextField;

	    @FXML
	    private TextField emailTextField;
		   
	    @FXML
	    private TextField nameTextField;

	    @FXML
	    private TextField phoneNumberTextField;

	    @FXML
	    private Button submitButton;

	    @FXML
	    private TextField surnameTextField;
	    
	    @FXML
	    private TextField unameTextField;
	    
	    @FXML
	    private Button goBack;
	    
	    @FXML
	    private Button checkoutButton;

	    @FXML
	    private ToggleButton masterButton;

	    @FXML
	    private Button paypalButton;

	    @FXML
	    private ToggleButton visaButton;
	    
	    @FXML
	    private ToggleButton groupToggleButton;

	   /*@FXML
	    void checkOut(ActionEvent event) {

	    }*/

	    @FXML
	    void ToggleButton(ActionEvent event) {
	    	if(event.getSource() == masterButton) {
	    		masterButton.setStyle("-fx-background-color: #5D0E41; -fx-border-color: #f9d423;");
	    		visaButton.setStyle("-fx-background-color: #5D0E41; -fx-border-color: #5D0E41;");
	    	}
	    	if(event.getSource() == visaButton) {
	    		visaButton.setStyle("-fx-background-color: #5D0E41; -fx-border-color: #f9d423;");
	    		masterButton.setStyle("-fx-background-color: #5D0E41; -fx-border-color: #5D0E41;");
	    	}
	    	
	    }
	    
	    @FXML
	    void paypalPay(ActionEvent event) throws URISyntaxException, IOException {
	    		Desktop.getDesktop().browse(new URI("https://www.paypal.com/us/signin"));
	    }

	  


}


	    
