package com.example.binary;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    ObservableList<String> numeralSystems = FXCollections.observableArrayList("Binary", "Octal", "Hexadecimal");

    @FXML
    private TextField input;

    @FXML
    private TextArea output;

    @FXML
    private ComboBox<String> systemBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        systemBox.setItems(numeralSystems);
    }
    public void vypocet(ActionEvent event){
        int cislo = Integer.valueOf(input.getText());
        String comboValue = systemBox.getValue();
        switch (comboValue){
            case "Binary":
                output.setText(Integer.toBinaryString(cislo));
                break;
            case "Octal":
                output.setText(Integer.toOctalString(cislo));
                break;
            case "Hexadecimal":
                output.setText(Integer.toHexString(cislo));
                break;
        }
    }

    @FXML
    void copy(ActionEvent event) {
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(output.getText());
        System.out.println(content);
        clipboard.setContent(content);
    }
}
