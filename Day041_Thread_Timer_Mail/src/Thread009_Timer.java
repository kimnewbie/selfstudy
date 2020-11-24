import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Gui extends Thread {
	JFrame f;
	JTextField txt;
	JButton[] b;
	JPanel p;
	JLabel l;
	JTextArea txtArea;
	String time = getCurrentTime();
	
	public Gui() {
		f = new JFrame("[JAVA TALK!]");
		txt = new JTextField("",20);
		b = new JButton[] {new JButton("전송"),new JButton("닫기")};
		p = new JPanel();
		l = new JLabel(time);
		txtArea = new JTextArea();
	}
	
	public void create() {
		f.setVisible(true);
		f.setLayout(new BorderLayout());
		f.setSize(400,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p, BorderLayout.SOUTH);
		f.add(txtArea, BorderLayout.CENTER);
		f.add(l, BorderLayout.NORTH);
		f.setLocationRelativeTo(null); // 가운데 팝업
		l.setFont(new Font(Font.SANS_SERIF,Font.BOLD,15)); // 시간 폰트
		l.setHorizontalAlignment(JLabel.RIGHT); // 시간 왼쪽으로
		l.setOpaque(true); // 라벨에 투명도 설정
		l.setBackground(Color.DARK_GRAY);
		l.setForeground(Color.white);
		p.add(txt);
		txtArea.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		for(int i=0; i<b.length; i++) {
			p.add(b[i]); 
			b[i].setBackground(Color.DARK_GRAY);
			b[i].setForeground(Color.WHITE);
		}
		
		Thread t1 = new Thread(this);
		t1.start();		
		
		b[0].addActionListener(new ActionListener() {
			@Override public void actionPerformed(ActionEvent e) {		
				String msg = txt.getText();
				txt.setText("");
				txtArea.append("[김유진] "+msg+"\n"); // 필드에 글쓰과 확인 누르면 에어리어에 쌓임
			} });
		
		//엔터키 눌렀을 때 반응하기
		txt.addKeyListener(new KeyAdapter() { // 키보를 눌렀을 때 호출되는 메소드를 가진 인터페이스
			@Override
			public void keyPressed(KeyEvent e) { // 키보드를 눌렀을 때 호출, 모든 키보드에 반응
				super.keyPressed(e);
			//입력받은 키가 엔터인지 알아내기, KeyEvent 객체가 키에대한 정보 갖고있음
				int keyCode = e.getKeyCode();
				switch(keyCode) {
					case KeyEvent.VK_ENTER:
						String msg = txt.getText();
						txt.setText("");
						txtArea.append("[김유진] "+msg+"\n");
						txtArea.setCaretPosition(txtArea.getText().length()); // 스크롤 따라가게
						break;
				}
			}
		});			
		
		b[1].addActionListener(new ActionListener() { // 닫기 버튼 누르면 시스템 종료
			@Override public void actionPerformed(ActionEvent e) { System.exit(0); } });
	}

	@Override
	public void run() {
		while(true) {
			try { 
				Thread.sleep(1000); 
				time = getCurrentTime();
				l.setText(time);
				f.repaint(); // 화면 자동갱신. 메모리를 위해서, 누적 전에 지우고 지우고~
			}
			catch (InterruptedException e) { e.printStackTrace(); }			
		}		
	}

	private String getCurrentTime() {
		Calendar cal = Calendar.getInstance(); // Calendar 객체 얻어오기 (시스템의 현재날짜와 시간정보)
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		
		return time = h +"시 "+ m +"분 "+ s + "초";
	}

	
}
public class Thread009_Timer {
	public static void main(String[] args) {
		new Gui().create();
	}
}
