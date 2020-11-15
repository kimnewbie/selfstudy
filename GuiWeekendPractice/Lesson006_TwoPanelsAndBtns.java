package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lesson006_TwoPanelsAndBtns {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson006_TwoPanelsAndBtns window = new Lesson006_TwoPanelsAndBtns();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson006_TwoPanelsAndBtns() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("YJ COFFEE");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null); // 화면 가운데
		frame.setResizable(false); // 사이즈 고정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel gotoend = new JPanel();
		JPanel gotonext = new JPanel();
		gotoend.setBounds(0, 0, 794, 571);
		gotoend.setLayout(null);		
		gotonext.setBounds(0, 0, 794, 571);
		frame.getContentPane().add(gotonext);
		frame.getContentPane().add(gotoend);
		gotonext.setLayout(null);
		
		JButton btnNext = new JButton("Go to Next");
		btnNext.setBounds(33, 68, 272, 450);
		gotonext.add(btnNext);
		JButton btnEnd = new JButton("Go to Last");
		btnEnd.setBounds(467, 81, 277, 425);
		gotoend.add(btnEnd);
		gotoend.setVisible(false); // 첫페이지 나올 때 두번째 버튼 안보이게 하기 위해서 false 먼저 사용
		btnNext.addActionListener(new ActionListener() { // 첫번째 버튼 누르면 사라지고 두번째 버튼 등장

			@Override
			public void actionPerformed(ActionEvent arg0) {
				gotoend.setVisible(true);
				gotonext.setVisible(false);
			}			
		});
		btnEnd.addActionListener(new ActionListener() { // 두번째 버튼 누르면 사라지고 첫번째 버튼 등장
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gotonext.setVisible(true);
				gotoend.setVisible(false);
			}			
		});
		
		
	}
}
