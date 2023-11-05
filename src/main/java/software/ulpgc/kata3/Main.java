package software.ulpgc.kata3;

import software.ulpgc.kata3.swing.MainFrame;

public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram("Ejemplo", "x", "y", new double[]{1, 6, 8, 4, 5, 6, 11, 3, 7, 6, 4}, 3);
        MainFrame frame = new MainFrame();
        frame.getHistogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
