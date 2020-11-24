package Day041_2_Mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage; 

public class MailNaver {
	public static void main(String[] args)   throws Exception{
		String subject = "메러디스 하이루~";
		String content = "오늘도 이제 끝이야....";
		String host = "smtp.naver.com";
		final String user = "zzang5086@naver.com"; 
		final String password = "cancho429";
				
		String to = "gracecancho@gmail.com";  //받는사람 이메일 주소
	      
		Properties props = new Properties();
	    props.put("mail.smtp.host", host);
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "587");
	    props.put("mail.smtp.ssl.enabel", "true");
	    props.put("mail.smtp.ssl.trust", "smtp.naver.com");
	    Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
	       protected PasswordAuthentication getPasswordAuthentication() {
	          return new PasswordAuthentication(user,password);
	       }
	    });
	    System.out.println("1");      
	    try {   MimeMessage message = new MimeMessage(session);
	    		message.setFrom(new InternetAddress(user));
	    		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//	    		1.메일 제목
	    		message.setSubject(subject);
//	    		2.메일 내용
	    		message.setText(content);
	    		System.out.println("2");
	    		Transport.send(message);
	    		System.out.println("3 successfully!!"); }
	    catch(AddressException e) { e.printStackTrace(); }
	    catch(MessagingException e) { e.printStackTrace(); }
   }
}
/**
1. 다운로드
2. jar파일 - build path
3. naver 가서 smtp 체크 (스팸처리 안당하게)
POP 서버명 : pop.naver.com
	서버명 : smtp.naver.com
	포트 : 995
	보안연결(SSL) 필요SMTP 포트 : 465
	필요아이디 : zzang5086
	비밀번호 : 네이버 로그인 비밀번호
	
	https://mvnrepository.com/artifact/javax.activation/activation/1.1 download
*/