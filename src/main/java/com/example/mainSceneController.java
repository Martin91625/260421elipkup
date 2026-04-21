/*
* File: mainSceneController.java
* Author: El Miri Martin
* Copyright: 2026, El Miri Martin
* Group: Szoft I/N
* Date: 2026-04-21
* Github: https://github.com/Martin91625/
* Licenc: MIT
*/


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
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }


    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    void startCalc() {
        double height = Double.parseDouble(heightTextField.getText());
        double r1 = Double.parseDouble(r1TextField.getText());
        double r2 = Double.parseDouble(r2TextField.getText());

        double volume = EllipsoidCone.calcVolume(r1, r2, height);
        volumeField.setText(String.format("%.3f", volume));

        String data = height + ":" + r1 + ":" + r2 + ":" + volume + "\n";
        Storage.writeToFile(data);

    }

}
