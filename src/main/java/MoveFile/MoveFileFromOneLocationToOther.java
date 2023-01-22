package MoveFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFileFromOneLocationToOther {

    public static void main(String[] args) {

        try {
            File source = new File("C:\\Users\\i074924\\Desktop\\Test");
            Path dest = Paths.get("/home/folder1/folder2/image.png");
            File[] content = source.listFiles();

            for(int i = 0; i < content.length; i++) {
                if(content[i].getName().toLowerCase().endsWith(".mp4"));
               Path filepath= Paths.get(content[i].getAbsolutePath());
                Files.move(filepath, dest);
            }


        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
