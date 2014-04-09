package util

import play.Play
import play.api.Play.current

object MailUtil {
  val smtpHost = Play.application.configuration.getString("smtp.host")
  val smtpPort = Play.application().configuration().getInt("smtp.port")
  val smtpUser = Play.application().configuration().getString("smtp.user")
  val smtpPassword = Play.application().configuration().getString("smtp.password")

  def sendEmail(from: String, subject: String, body: String, to: String) : Boolean = {
//    try {
    	import com.typesafe.plugin._
		val mail = use[MailerPlugin].email
		mail.setSubject("mailer")
		mail.addRecipient("Peter Hausel Junior <noreply@email.com>","example@foo.com")
		mail.addFrom("Peter Hausel <noreply@email.com>")
//		mail.sendHtml("<html>html</html>" )
		mail.setReplyTo("diego.naali@gmail.com")
		mail.send( "text", "<html>html</html>")
		true
      
//      } catch {
//      case e: Exception => false
//    }
  }
  
  
//  def sendEmail(from: String, subject: String, body: String, to: String) : Boolean = {
    
      // Render template
//	  String body = email.render(created).body();
	
	  // Prepare email
//    try {
//    val mail = use[MailerPlugin].email
//      MailerAPI mail = play.Play.application().plugin(MailerPlugin.class).email();
      
      
//	  val mail = new SimpleMail
//	  mail.setFrom(from);
//	  mail.setSubject(subject);
//	  mail.setMsg(body);
//	  mail.addTo(to);
//	
//	  // Application de la configuration SMTP
//	  mail.setHostName(smtpHost);
//	  if (smtpPort != null && smtpPort > 1 && smtpPort < 65536) {
//	    mail.setSmtpPort(smtpPort);
//	  }
//	  if (!smtpUser.isEmpty()) {
//	    mail.setAuthentication(smtpUser, smtpPassword);
//	  }
//	
//	  // And finally
//	  mail.send();
//	  true
//    } catch {
//      case e: Exception => false
//    }
//  }

}