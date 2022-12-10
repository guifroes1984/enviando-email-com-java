package enviando.email;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	
	
	@org.junit.Test /*É a mesma coisa que método main*/
	public void testeEmail() throws Exception {
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		
		stringBuilderTextoEmail.append("Olá, <br/><br/>");
		stringBuilderTextoEmail.append("Você esta recebendo o acesso ao curso de Java. <br/><br/>");
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo. <br/><br/>");
		
		stringBuilderTextoEmail.append("<b>Login:</b> gui@gmail.com<br/><br/>");
		stringBuilderTextoEmail.append("<b>Senha:</b> abcdef123<br/><br/>");
		
		stringBuilderTextoEmail.append("<a target=\"_black\" href=\"https://projetojavaweb.com/certificado-aluno/inicio\" style=\"color:#2525a7; padding: 14px 25 px; text-aling:center; text-decoration: none; display:inline-block; border-radius: 30px; font-size:20px; font-family:courier; border: 3px solid green; background-color:#99DA39;\">Acessar Portal do Aluno</a><br/><br/");
		
		stringBuilderTextoEmail.append("<span style=\"font-size:6px\">Ass.: Guilherme Froes</span>");
		
		ObjetoEnviaEmail enviaEmail = 
				new ObjetoEnviaEmail("guilhermefroes26@gmail.com",
									"Guilherme Henrique Froes", 
									"Testando e-mail com Java", 
									stringBuilderTextoEmail.toString());
		
		enviaEmail.enviarEmailAnexo(true);
		
		
		
		/*Caso o e-mail não esteja sendo enviado então
		 * coloqur um tempo de espera mais isso só pode
		 * ser usado para testes.*/
		Thread.sleep(5000);
		
		
	}
   
}
