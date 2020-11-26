package ChattingWGui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class ClientGui extends JFrame implements ActionListener {
 
    private static final long serialVersionUID = 1L;
    private JTextArea jta = new JTextArea(40, 25);
    private JTextField jtf = new JTextField(25);
    private ClientBackground client = new ClientBackground();
    private static String nickName;
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel();
    private JButton button = new JButton("전송");
 
    public ClientGui() {

        setTitle("TALK CLIENT");
//      전체배치
        setLayout(new BorderLayout());
//      층배치
        add(label, BorderLayout.NORTH);
        add(jta, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);
//      밑, 컴포넌트배치
        panel.setLayout(new FlowLayout());
        panel.add(jtf); panel.add(button); 
//      인테리어
        jtf.setMargin(new Insets(4,4,4,4));
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.LIGHT_GRAY);
        setVisible(true);        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,450);
        
        
        jtf.addActionListener(this);

        client.setGui(this);
        client.setNickname(nickName);
        client.connet();
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 닉네임부터 설정하세요 : ");
        nickName = scanner.nextLine();
        scanner.close();
 
        new ClientGui();
 
    }
 
    @Override
    // 말치면 보내는 부분
    public void actionPerformed(ActionEvent e) {
        String msg = nickName + ":" + jtf.getText() + "\n";
        client.sendMessage(msg);
        jtf.setText("");
    }
 
    public void appendMsg(String msg) {
        jta.append(msg);
    }
 
}