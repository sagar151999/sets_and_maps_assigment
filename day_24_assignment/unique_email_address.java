package day_24_assignment;

import java.util.HashSet;
import java.util.Set;

public class unique_email_address {

	public static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) 
        {
            String[] parts = email.split("@");
            String localName = parts[0];
            String domainName = parts[1];
            localName = localName.replace(".", "");
            int plusIndex = localName.indexOf('+');
            if (plusIndex != -1) 
            {
                localName = localName.substring(0, plusIndex);
            }
            String modifiedEmail = localName + "@" + domainName;
            uniqueEmails.add(modifiedEmail);
        }
        return uniqueEmails.size();
    }

    public static void main(String[] args) {
        String[] emails1 = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "teste.mail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails1)); 
    }
}