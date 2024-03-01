module org.example.project2fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.project2fx to javafx.fxml;
    exports org.example.project2fx;
}