package View;

import Moudle.mybutton;

import javax.swing.*;
import java.awt.*;

public class itemSelectPanel extends JPanel {
    private mybutton music;
    private mybutton video;

    itemSelectPanel(){
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 20, 12);
        setLayout(flowLayout);
        setPreferredSize(new Dimension(0,50));
        setBackground(Color.WHITE);
        music = new mybutton("music");
        video = new mybutton("video");


    }
}
