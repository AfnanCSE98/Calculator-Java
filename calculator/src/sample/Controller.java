package sample;

import javafx.fxml.FXML;
import  javafx.event.ActionEvent;
import  javafx.scene.control.Label;
import  javafx.scene.control.Button;


public class Controller {
    @FXML
    private Label result;
    private  boolean start = true;
    private long a = 0;
    private String operator = "";

    private  Model model = new Model();

    public  void ProcessNumber(ActionEvent event){
        if(start){
            result.setText("");
            start=false;
        }

        String value = ((Button)event.getSource()).getText();
        result.setText( result.getText()+value);
    }
    @FXML
    public  void ProcessOperators(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if(!value.equalsIgnoreCase("=")){
          if(!operator.isEmpty())return;

           operator = value;
           a=Long.parseLong(result.getText());
           result.setText("");
        }
        else
        {
            if(operator.isEmpty())return;

            long b = Long.parseLong(result.getText());
            double output = model.calculate(a,b,operator);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }

}
