module rjm.blackjackfx {
    requires transitive javafx.controls;
    requires javafx.fxml;

    requires core.fx;

    opens dev.rjm to javafx.fxml;

    exports dev.rjm;
}
