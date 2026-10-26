
public class Email extends Document{
    private String subject;
    private String to;


    public String getsubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {

        this.subject=subject;
    }
    
        
    

    public  void setTo(String to)
    {
        this.to=to;
    }

    public String getSubject()
    {
        return subject;
    }

    public String getTo()
    {
        return to;
    }
}
