module com.jojos.proyectoipc {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            
    opens com.jojos.proyectoipc to javafx.fxml;
    exports com.jojos.proyectoipc;
}