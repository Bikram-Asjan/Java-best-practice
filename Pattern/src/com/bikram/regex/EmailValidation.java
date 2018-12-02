package com.bikram.regex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	private static final String EMAIL_PATTERN2  = 
	"^\\s*[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*\\s*$";
	/*private static final String EMAIL_PATTERN1 = 
	"^\\s*[A-Za-z0-9-!#$%&'*+/=?^_`{|}~-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,6})$";
*/
	private static final String EMAIL_PATTERN  = 
			"^\\s*[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*\\s*$";
	/*public void emailValidation(final List<String> trimmedEmailList) 
			throws ValidationException {
		final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		for (String emailId : trimmedEmailList) {
			Matcher matcher = pattern.matcher(emailId);
			if (matcher.matches()) {
				continue;
			} else {
				throw 
				new ValidationException("Email Id " + emailId + " is not valid");
			}
		}
	}*/
	
	public Map<String, List<String>> 
	  emailValidation(final List<String> trimmedEmailList) {
		
		final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		List<String> validEmails = new ArrayList<>();
		List<String> invalidEmails = new ArrayList<>();
		Map<String, List<String>> validAndInvalidEmail = new HashMap<>();
		for (String emailId : trimmedEmailList) {
			Matcher matcher = pattern.matcher(emailId);
			if (matcher.matches()) {
				validEmails.add(emailId);
				continue;
			} else {
				invalidEmails.add(emailId);
			}
		}
		validAndInvalidEmail.put("Valid Email", validEmails);
		validAndInvalidEmail.put("Invalid Email", invalidEmails);
		
		return validAndInvalidEmail;
	}
	
	public static void main(String[] args){
		EmailValidation eValidation = new EmailValidation();
		List<String> emails = new ArrayList<>();
		emails.add("bikram");
		emails.add("narayana@.com.my");
		emails.add("bikram123@gmail.a");
		emails.add("bikram123@.com");
		emails.add("narayana123@.com.com");
		emails.add(".bikram@bikram.com");
		emails.add("bikram_asjan2@gmail.com");
		emails.add("bikram.asjan@nu_tanix.com");
		emails.add("bikram@nutanix.gk.co.in");
		emails.add("bikram_asjan@gmail.com");
		emails.add("bikram-patra@gma-il.co.in");
		emails.add("narayana.@gmail.com");
		emails.add("bikram()*");
		emails.add("bikram+patra@gmail.com");
		emails.add(".bikram@bikram.com");
		emails.add("bikram@%*.com");
		emails.add("bikram..2002@gmail.com");
		emails.add("bikram.@gmail.com");
		emails.add("bikram@gmail.com.1a");
		emails.add("bikram@bikram@gmail.com ");
		emails.add("BIKRAM.PATRA@gmail.com");
		emails.add("Market+bikram.patra2502994@gmail.com");
		emails.add("wrike+into268098200@wrike.com");
		emails.add("#gbd@gmail.com");
		emails.add("gurleen.+#singh@gmail.com");
		emails.add("gurleen.&#singh@nutanix.com");
		emails.add("bikram._@gmail.com");
		emails.add("rachit+.kansal@nutanix.com");
		emails.add("rachit@nutanix.c&o.in");
		/*try{
		eValidation.emailValidation(emails);
		} catch(ValidationException ex) {
			System.out.println(ex.getErrorMessage());
		} */
		
		Map<String, List<String>> emailMap = eValidation.emailValidation(emails);
		
		List<String> invalidEmailList = emailMap.get("Invalid Email");
		for(String email : invalidEmailList){
			System.out.println("Invalid Eamil : "+email);
		}
			System.out.println("\n");
		List<String> validEmailList = emailMap.get("Valid Email");
		for(String email : validEmailList){
			System.out.println("Valid Eamil : "+email);
		}
	}
	
}
