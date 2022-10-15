package resources

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.nio.charset.*;

/**
 * @Author: Rick
 * @Date: 2022/10/14 14:45
 */
public class T03_ResourceTest {
    public static void main(String[] args) throws IOException {
        Class cl = T03_ResourceTest.class;
        URL aboutURL = cl.getResource("about.gif");
        // URL aboutURL = new URL("file:src/main/java/com/rick/chap_05/course05_reflection/resource/about.gif");
        var icon = new ImageIcon(aboutURL);

        // InputStream stream = cl.getResourceAsStream("file:src/main/java/com/rick/chap_05/course05_reflection/resource/file:src/main/java/com/rick/chap_05/course05_reflection/resource/data/about.txt");
        InputStream stream = cl.getResourceAsStream("/data/about.txt");
        var about = new String(stream.readAllBytes(), "UTF-8");

        InputStream stream2 = cl.getResourceAsStream("/corejava/title.txt");
        var title = new String(stream2.readAllBytes(), StandardCharsets.UTF_8).trim();

        JOptionPane.showMessageDialog(null, about, title, JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
