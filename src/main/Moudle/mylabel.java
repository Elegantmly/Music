package Moudle;

import Values.mycolor;
import Values.myfont;
import Values.size;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class mylabel extends JLabel{
    //图Label
    public mylabel(int width,int height,int x,int y,String photoName){
        super();
        //设置label大小
        setSize(new Dimension(width,height));
        //设置label位置
        setLocation(x,y);
        //设置图片自适应Label大小
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(photoName));
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(width,height,Image.SCALE_DEFAULT));
        setIcon(imageIcon);
    }

    //字Label
    public mylabel(String text,int width,int height,int x,int y,Font font){
        super();
        //设置label大小
        setSize(width,height);
        //设置label位置
        setLocation(x,y);
        //设置内容
        setText(text);
        //自定义字体
        setFont(font);
    }


    public mylabel(String photoname,String text,int y){
        setSize(new Dimension(size.LEFTLIST_WIDTH,size.LEFTLIST_BUTTON_HEIGHT));
        setLocation(0,y);
        setBackground(mycolor.leftlistColor);
        //设置绝对布局
        setLayout(null);
        //分类名
        mylabel mytext = new mylabel(text,80,30,50,10, myfont.LEFTLISTBUTTON_FONT);
        //图标
        mylabel myicon = new mylabel(30,30,10,10,photoname);
        //小手光标
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(mytext);
        add(myicon);
    }
    //歌曲列表
    public mylabel(int no,String songsName,int y){
        String num = Integer.toString(no);
        //一条内容的高宽
        setSize(new Dimension(50000, size.JLabel_HEIGHT));
        //位置
        setLocation(30,y);
        //设置绝对布局
        setLayout(null);
        //序号
        mylabel myno = new mylabel(num,50,size.JLabel_HEIGHT,10,5,myfont.LEFTLISTBUTTON_FONT);
        //歌曲名
        mylabel mysong = new mylabel(songsName,1000,size.JLabel_HEIGHT,60,5,myfont.LEFTLISTBUTTON_FONT);
        //小手光标
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(myno);
        add(mysong);

    }
}
