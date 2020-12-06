package osp;
import javax.swing.*;
import java.awt.event.*;

public class main {
	private static final int MIN_PROGRESS = 0;
	private static final int MAX_PROGRESS = 100;
	private static int currentProgress = 0;
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("爆肝工程師");
        // 設定尺寸
        frame.setSize(1024, 800);
        // JFrame在螢幕居中
        frame.setLocationRelativeTo(null);
        // JFrame關閉時的操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //panel
        JPanel panel = new JPanel();
        
        
        
        //標籤
        final JLabel label = new JLabel("Hello world!");
        panel.add(label);
        
        //button
        JButton btn = new JButton("開始遊戲");
        btn.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ㄥlabel.setText("安安");
        		
        		JFrame f2 = new JFrame("關卡一");
        		f2.setSize(1024,800);
        		f2.setLocationRelativeTo(null);
        		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	}
        });
        panel.add(btn);
        
        //進度條
        final JProgressBar bar = new JProgressBar(MIN_PROGRESS,MAX_PROGRESS);
        bar.setValue(currentProgress);
        bar.setStringPainted(true);
        panel.add(bar);
        
        //顯示JFrame
        frame.setContentPane(panel);
        frame.setVisible(true);
        
        
        
        //進度條按照時間跑 0.5秒跳一次
        new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentProgress++;
                if (currentProgress > MAX_PROGRESS) {
                    currentProgress = MIN_PROGRESS;
                }
                bar.setValue(currentProgress);
            }
        }).start();
	}
	
	public static void main(String[] args) {
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	}

}
