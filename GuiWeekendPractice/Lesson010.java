package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Lesson010 {

	private JFrame frame;
	private JTextField ID;
	private JPasswordField PW;
	private JTextField nameTxt;
	private JTextField emailTxt;
	private JTextField hintTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson010 window = new Lesson010();
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
	public Lesson010() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		ImagePanel mainPanel = new ImagePanel(new ImageIcon("D:/eclipse-workspace1/GUI_Practice/image/secondPage.PNG").getImage());
//		JPanel mainPanel = new JPanel();
		frame.getContentPane().add(mainPanel, BorderLayout.EAST);
		mainPanel.setBounds(0, 0, 496, 795);
//		welcomePanel.add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(false); // 처음에 안보이게 해야해 그러고 이벤트 창에가서 true
		
		JLabel welcoming = new JLabel("YJ COFFEE");
		welcoming.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		welcoming.setBounds(203, 271, 119, 46);
		mainPanel.add(welcoming);
		
		JLabel signName = new JLabel("이름");
		signName.setHorizontalAlignment(SwingConstants.CENTER);
		signName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		signName.setBounds(36, 340, 159, 46);
		mainPanel.add(signName);
		
		JLabel email = new JLabel("이메일주소");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		email.setBounds(36, 383, 159, 46);
		mainPanel.add(email);
		
		JLabel hint = new JLabel("정보힌트");
		hint.setHorizontalAlignment(SwingConstants.CENTER);
		hint.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		hint.setBounds(36, 427, 159, 46);
		mainPanel.add(hint);
		
		nameTxt = new JTextField();
		nameTxt.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		nameTxt.setBounds(203, 356, 229, 28);
		mainPanel.add(nameTxt);
		nameTxt.setColumns(10);
		
		emailTxt = new JTextField();
		emailTxt.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		emailTxt.setColumns(10);
		emailTxt.setBounds(203, 397, 229, 28);
		mainPanel.add(emailTxt);
		
		hintTxt = new JTextField();
		hintTxt.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		hintTxt.setColumns(10);
		hintTxt.setBounds(203, 440, 229, 28);
		mainPanel.add(hintTxt);
		
		JLabel gender = new JLabel("성별");
		gender.setHorizontalAlignment(SwingConstants.CENTER);
		gender.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		gender.setBounds(36, 471, 159, 46);
		mainPanel.add(gender);
		
		JComboBox genderTxt = new JComboBox(new String[] {"남자","여자"});
		genderTxt.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		genderTxt.setBounds(203, 478, 229, 28);
		mainPanel.add(genderTxt);
		
		JButton submit = new JButton("확인");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nameTxt = signName.getText();
				String emailTxt = email.getText();
				String hintTxt = hint.getText();
				String gender = genderTxt.getSelectedItem().toString();
				Customer customer = new Customer(nameTxt, emailTxt, hintTxt, gender); // 모든 값을 customer라는 클래스에 넣어
			}
		});
		submit.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		submit.setBounds(131, 585, 256, 46);
		mainPanel.add(submit);

//		image 폴더 주소 show in > System Explorer 에서 폴더 주소명을 밑에 ImageIcon에 넣어줘야 Design에 사진도 나타남
		ImagePanel welcomePanel = new ImagePanel(new ImageIcon("D:/eclipse-workspace1/GUI_Practice/image/yjcoffee.png").getImage());
		frame.getContentPane().add(welcomePanel, BorderLayout.EAST);
		
		welcomePanel.setLayout(null);
		ID = new JTextField();
		ID.setBounds(158, 417, 298, 33);
		ID.setFont(new Font("굴림", Font.BOLD, 18));
		ID.setToolTipText("ENTER ID");
		welcomePanel.add(ID);
		ID.setColumns(10);
		
		PW = new JPasswordField();
		PW.setBounds(158, 460, 298, 33);
		PW.setHorizontalAlignment(SwingConstants.LEFT);
		PW.setToolTipText("ENTER PASSWORD");
		welcomePanel.add(PW);
		
		JLabel lblNewLabel_1 = new JLabel("아이디 : ");
		lblNewLabel_1.setBounds(29, 412, 117, 37);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		welcomePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 : ");
		lblNewLabel_1_1.setBounds(41, 454, 105, 37);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		welcomePanel.add(lblNewLabel_1_1);
		
		JButton login = new JButton("로그인하기");
		login.setBounds(29, 678, 434, 50);
		login.setBackground(SystemColor.WHITE);
		login.setForeground(Color.BLACK);
		login.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) { // PW는 String이 아니라..
//				System.out.println(ID.getText());
//				System.out.println(PW.getPassword());
				if(ID.getText().equals("youjin")&&Arrays.equals(PW.getPassword(),"youjin".toCharArray())) {
					JOptionPane.showMessageDialog(null, "Welcome "+ID.getText()+"!");
					welcomePanel.setVisible(false); // 정보가 맞으면 다음페이지로
					mainPanel.setVisible(true);
				}else {JOptionPane.showMessageDialog(null, "Please, check again!");}
			}
			
		});
		welcomePanel.add(login);
		
		JLabel lblNewLabel_2 = new JLabel("안녕하세요.");
		lblNewLabel_2.setBounds(22, 196, 329, 50);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 35));
		welcomePanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("YJ COFFEE입니다.");
		lblNewLabel_2_1.setBounds(22, 239, 329, 50);
		lblNewLabel_2_1.setFont(new Font("맑은 고딕", Font.PLAIN, 35));
		welcomePanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("회원 서비스 이용을 위해 로그인 해주세요.");
		lblNewLabel_3.setBounds(22, 285, 373, 37);
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		welcomePanel.add(lblNewLabel_3);
		
		JButton signin = new JButton("회원가입");
		signin.setBounds(49, 612, 194, 44);
		welcomePanel.add(signin);
		
		JButton find = new JButton("아이디/비밀번호 찾기");
		find.setBounds(255, 612, 194, 44);
		find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		welcomePanel.add(find);
		
		frame.setJMenuBar(menuBar()); // 메뉴바를 만들고 메서드 사용
		frame.pack(); // 이걸써줘야 창이 크게 다 나옴 아니면 배너만 나옴
		frame.setLocationRelativeTo(null); // 가운데 팝업		
//		frame.setBounds(100, 100, 450, 300); 직접설정할거라 주석처리
//		frame.setSize(mainPanel.getWidth(),mainPanel.getHeight());
		frame.setSize(welcomePanel.getWidth(),welcomePanel.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public JMenuBar menuBar() { // 메뉴바 만들기 일단 frame.setJMenuBar(menuBar()); 지정하고 메서드 
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu aboutMenu = new JMenu("About");
		
		bar.add(fileMenu);
		bar.add(aboutMenu);
		
		JMenuItem openFile = new JMenuItem("Open");
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(openFile);
		fileMenu.addSeparator(); // 메뉴목록 사이에 위치. ㅡ 줄표시
		fileMenu.add(exit);
		
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 상단메뉴에 exit을 누르면 팝업 종료				
			}
			
		});
		return bar;
	}
}
class ImagePanel extends JPanel{
	private Image img;

	public ImagePanel(Image img) {
		this.img = img; // 이미지를 밖에서 사용할 수 있도록 생성자에 써줌
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
		
	}
//	그림 사이즈 메서드 설정
	public int getWidth() { return img.getWidth(null); }
	public int getHeight() { return img.getHeight(null); }
	
	public void paintComponent (Graphics g) { // 백그라운드 이미지 넣는 것
		g.drawImage(img,0,0,null);
	}
}