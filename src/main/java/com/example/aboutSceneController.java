/*
* File: aboutSceneController.java
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

public class aboutSceneController {

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
