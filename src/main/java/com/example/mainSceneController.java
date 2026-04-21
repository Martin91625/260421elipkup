package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class mainSceneController {

    @FXML
    private TextField heightTextField;

    @FXML
    private TextField r1TextField;

    @FXML
    private TextField r2TextField;

    @FXML
    private TextField volumeField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    void startCalc() {
        double height = Double.parseDouble(heightTextField.getText());
        double r1 = Double.parseDouble(r1TextField.getText());
        double r2 = Double.parseDouble(r2TextField.getText());

        Double volume = EllipsoidCone.calcVolume(r1, r2, height);

        volumeField.setText(volume.toString());

        String data = height + ":" + r1 + ":" + r2 + ":" + volume + "\n";
        Storage.writeToFile(data);

    }

}
