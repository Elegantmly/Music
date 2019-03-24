package UI;
/**
 * 进度条（音量和音乐播放进度）渐变样式类
 */
import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import Values.mycolor;

public class sliderUI extends BasicSliderUI{
    public sliderUI(JSlider b) {
        super(b);
    }
    @Override
    //绘制游标
    public void paintThumb(Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        BasicStroke stroke=new BasicStroke(1,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);//设置线条规则
        g2d.setStroke(stroke);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.5f));//设置混合模式
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//设置抗锯齿与键值
        GradientPaint gp=new GradientPaint(0,0, mycolor.SLIDERBACKGROUND02,0,thumbRect.height,mycolor.SLIDERBACKGROUND01);//控制渐变
        g2d.setPaint(gp);
        g2d.fillRoundRect(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height, 10, 10);//使用当前颜色填充指定的圆角矩形。 矩形的左边缘和右边缘处于x和x + width - 1分别。 矩形的顶部和底部边缘在y和y + height - 1 。
        BasicStroke stroke1=new BasicStroke(3,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
        g2d.setStroke(stroke1);
        g2d.drawLine(8, thumbRect.height/2,thumbRect.x+8 , thumbRect.height/2);
    }
    @Override
    //绘制滑道
    public void paintTrack(Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        // 设定渐变
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.3f));
        g2d.setPaint(new GradientPaint(0, 0,mycolor.SLIDERBACKGROUND02,0,trackRect.height,mycolor.SLIDERBACKGROUND01, true));
        g2d.setStroke(new BasicStroke(4,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
        g2d.drawLine(8, trackRect.height/2+1, trackRect.width+8, trackRect.height/2+1);
    }
}
