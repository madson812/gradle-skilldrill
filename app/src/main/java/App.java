import javafx.stage.Stage;
import java.util.List;

import static javafx.application.Application.*;

public class App{
    //public defaultValue attribute1;
    //public attribute2;
    //private attribute3;

    public static void start(){
        primaryStage.setTitle("Course View");
        //Looked through lectures for information on how to do this and couldn't find any. Please send help.
    }

    public static void main(String[] args) throws Exception {
        launch(start());
        Student carl = new Student("Carl", "Jenkins");
        carl.addCourse(new Course(2337,"Comp","Advanced Programming"));
    }

}
