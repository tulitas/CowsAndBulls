module CowsAndBulls {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    exports cab to javafx.graphics, javafx.fxml;
    opens cab to javafx.fxml, javafx.base;
}