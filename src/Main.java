import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrameTest a = new JFrameTest();
            a.createGUI();
        });
    }
}
