import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;

public class Mixer {

    public Mixer() throws NoSuchAlgorithmException, SignatureException {
        File testFile = new File("aaaa");
        boolean exec = testFile.canExecute();
        Signature sign = Signature.getInstance("SHA256WithDSA");
        byte[] data = "abcdefghijklmnopqrstuvxyz".getBytes(StandardCharsets.UTF_8);
        sign.update(data);
        byte[] digitalSignature = sign.sign();
    }

    public void aLotOfOps(File file, Path path) throws IOException {
        System.out.println(path.getFileName());
        file.delete();
        double rand = Math.random();
        if (rand > 0.5) {
            File file3 = new File("my_file_3");
            File parent = file3.getParentFile();
            parent.delete();
            file3.delete();
        } else {
            File file4 = new File("my_file_4");
            File[] parent = file4.listFiles();
            file4.delete();
        }
        Main main = new Main();
        File someFile = main.getRandomFile();
    }

    public static void staticInvoke(File file) {
        file.delete();
    }

    public static void staticInvoke2(File file) throws IOException {
        file.createNewFile();
    }
}
