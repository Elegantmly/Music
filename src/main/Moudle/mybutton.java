package Moudle;

import Values.myfont;
import Values.size;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mybutton extends JButton {
    public String mouseEnter;
    public String mouseExit;

    public mybutton(int width, int height, int x, int y, String photoName) {
        super();
        mouseEnter = null;
        mouseExit = null;
        //设置按钮大小
        setSize(width, height);

        //设置按钮位置
        setLocation(x, y);

        //初始化按钮图标
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(mouseEnter));
        ImageIcon imageIcon2 = new ImageIcon(getClass().getResource(mouseExit));
        //创建此图像的缩放版本，采用区域平均图像缩放算法
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING));
        imageIcon2.setImage(imageIcon2.getImage().getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING));
        setIcon(imageIcon2);

        //设置按钮透明
        setContentAreaFilled(false);

        //设置按钮无边框
        setBorder(null);

        //按钮退出进入响应
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                setIcon(imageIcon);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                setIcon(imageIcon2);
            }
        });

    }

    public mybutton(String photoName, int width, int height, int x, int y) {
        super();
        mouseExit = null;

        //设置按钮大小
        setSize(width, height);

        //设置按钮位置
        setLocation(x, y);

        ImageIcon imageIcon2 = new ImageIcon(getClass().getResource(mouseExit));
        //创建此图像的缩放版本，采用区域平均图像缩放算法
        imageIcon2.setImage(imageIcon2.getImage().getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING));
        setIcon(imageIcon2);

        //设置按钮透明
        setContentAreaFilled(false);

        //设置按钮无边框
        setBorder(null);
    }

    public mybutton(String text){
        setText(text);
        //setPreferredSize使得大小适应窗口，Dimension类封装单个对象中组件的宽度和高度（以整数精度）
        setPreferredSize(new Dimension (size.ITEMSELECTPANEL_BUTTON_WIDTH,size.ITEMSELECTPANEL_BUTTON_HEIGHT));

        //背景色
        setBackground(Color.GRAY);

        //小手光标
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    //video的button
    public mybutton(String songsName,String photoPath) {
        //设置按钮大小
        setPreferredSize(new Dimension(350, 250));
        //设置背景色
//        setBackground(mycolor);
        //按钮无边框
        setBorder(null);
        //绝对布局
        setLayout(null);
        //设置小手点击
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        mylabel cover = new mylabel(350, 200, 0, 0, photoPath);
        mylabel song = new mylabel(songsName, 350, 50, 0, 200, myfont.VIDEO_FONT);
        add(cover);
        add(song);
    }
}
