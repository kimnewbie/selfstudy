package ChattingWGui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class ServerGui extends JFrame implements ActionListener {
 
    private static final long serialVersionUID = 1L;
    private JTextArea jta = new JTextArea(40, 25);
    private JTextField jtf = new JTextField(20);
    private ServerBackground server = new ServerBackground();
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel();
    private JButton button = new JButton("전송");
 
    public ServerGui() throws IOException {
    	
    	
        setTitle("TALK SERVER");
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
        server.setGui(this);
        server.setting();        
        
    }
 
    public static void main(String[] args) throws IOException {
        new ServerGui();
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = "서버 : " + jtf.getText() + "\n";
        System.out.print(msg);
        server.sendMessage(msg);
        jtf.setText("");
    }
 
    public void appendMsg(String msg) {
        jta.append(msg);
    }
 
}