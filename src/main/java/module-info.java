module com.example.oop_bmi_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_bmi_calculator to javafx.fxml;
    exports com.example.oop_bmi_calculator;
}