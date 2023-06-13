import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, SignatureException {
        File defFile = new File("test.txt");
        boolean res = false;
        if (!defFile.exists()) res = defFile.createNewFile();
        if (res) System.out.println("CREATED");
        else System.out.println("ALREADY EXIST");
        Path path = defFile.toPath();
        File file3 = new File("file3");
        Mixer.staticInvoke(file3);
        Mixer.staticInvoke2(defFile);
        File name = null;
        if (defFile.canExecute() && defFile.getName().equals("test"))
            name = new File(defFile.getName());
        Mixer mixer = new Mixer();
        staticInvoke4(file3);
        mixer.aLotOfOps(defFile, path);
    }

    public File getRandomFile() throws IOException {
        File file1 = new File("file1");
        staticInvoke3(file1);
        File file2 = new File("file2");
        file1.createNewFile();
        file2.createNewFile();
        file1.delete();
        return file2.getParentFile();
    }

    public static void staticInvoke3(File file) {
        file.delete();
    }
    public static void staticInvoke4(File file) throws IOException {
        file.createNewFile();
    }
}
