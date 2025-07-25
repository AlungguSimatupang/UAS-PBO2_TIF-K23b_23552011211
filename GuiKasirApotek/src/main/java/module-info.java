module org.example.guikasirapotek {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.guikasirapotek to javafx.fxml;
    exports org.example.guikasirapotek;
}