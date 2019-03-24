package UI;
/**
 * 进度条（音量和音乐播放进度）渐变样式类
 */
import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
public class sliderUI extends BasicSliderUI{
    public sliderUI(JSlider b) {
        super(b);
    }
    @Override
    //绘制游标
    public void paintThumb(Graphics g){
    }
    @Override
    //绘制滑道
    public void paintTrack(Graphics g){

    }
}
