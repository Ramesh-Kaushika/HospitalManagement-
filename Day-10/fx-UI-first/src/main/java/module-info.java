module com.rameshfirstfxui.fxuifirst {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rameshfirstfxui.fxuifirst to javafx.fxml;
    exports com.rameshfirstfxui.fxuifirst;
}