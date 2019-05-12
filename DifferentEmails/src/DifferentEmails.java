/*Every email consists of a local name and a domain name, separated by the @ sign.

For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails? 
*/

class DifferentEmails {
    public int numUniqueEmails(String[] emails) {
        
        return populate(emails);
        
    }
    
    
    public int populate(String[] emails) {
        
        HashMap<String, Integer> emailFreq = new HashMap<>(); 
        int count = 0;
        boolean domainReached = false; 
        boolean plusFound = false; 

        for(int i=0; i<emails.length; i++) {
            
            String currentWord = emails[i];
            StringBuilder cleanEmail = new StringBuilder();
            plusFound = false;
            
            for(int j=0; j<currentWord.length(); j++) {
                
                char c = currentWord.charAt(j);
                
                if(plusFound == false) {
                    if(c == '+') {
                        plusFound = true; 
                    }
                    else if(c == '.') continue;  
                    else if(c != '@'){
                        cleanEmail.append(c);
                    }
                }
                
                    if(c == '@') {
                        cleanEmail.append(currentWord.substring(j, currentWord.length()));
                        break;
                    }
                }
            
              System.out.println(cleanEmail.toString());
            
            int freq = 0;
            if(emailFreq.containsKey(cleanEmail.toString())) {
                freq = emailFreq.get(cleanEmail.toString()) + 1;
                emailFreq.put(cleanEmail.toString(), freq);
            }
            else {
                freq = 1;
                count++;
                emailFreq.put(cleanEmail.toString(), freq);
            }
                
            }
            
         
        
        return count; 
        
    }
}