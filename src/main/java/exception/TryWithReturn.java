package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TryWithReturn {
    public static void main(String[] args) throws IOException {
        tryWithResource(null, null);

    }


    public static void tryWithResource(File sourceFile, File destFile) throws IOException {

        FileChannel sourceDire = null;
        FileChannel target = null;

        try {
            sourceDire = new FileInputStream(sourceFile).getChannel();
            target = new FileInputStream(destFile).getChannel();

            sourceDire.transferTo(0, sourceDire.size(), target);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (sourceDire != null) {
                sourceDire.close();
            }
            if (target != null) {
                target.close();
            }
        }


    }
}
