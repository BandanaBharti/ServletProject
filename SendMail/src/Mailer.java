import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
	public static void send(String to,String subject,String msg) {
		final String user="bhartibandana789@gmail.com";
		final String password="Bitni@23";
		
		//get session object
		
		Properties prop=new Properties();
		prop.put("mail.smtp.host","gmail.com");
		prop.put("mail.smtp.auth","true");
		
		
		Session session=Session.getDefaultInstance(prop,new javax.mail.Authenticator()
				{
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user,password);
			}
				});
		
		//compose message
		
		try {
			MimeMessage message=new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
			 message.setSubject(subject);  
			 message.setText(msg);
			 
			//3rd step)send message  
			 Transport.send(message);  
			  
			 System.out.println("Done"); 
			 
		 } catch (MessagingException e) {  
			    throw new RuntimeException(e);  
			 }  
			      
			}  
			}  
		