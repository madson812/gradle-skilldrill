import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class IOManager {

    Gson gson = new Gson();

    public List<Student> readData (String file) throws FileNotFoundException {
        List<Student> students = null;
        Scanner in = new Scanner(file);
        while(in.hasNextLine()){
            students.add(gson.fromJson(in.nextLine(),Student.class));
        }
        in.close();
        return students;
    }

    public void writeData(String file, Student data) throws IOException{
        try{
            FileWriter writer = new FileWriter(file);
            gson.toJson(student, writer);
            writer.append("/n");
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
