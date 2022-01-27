package sender;

import user.User;

import java.util.Date;
import java.util.Objects;

public class MessageSender {
    private Date date;

    public MessageSender(Date date){
        this.date = date;
    }
    public boolean send(String text, User user, String country){
        if (Objects.equals(user.getCountry(), country) &&
                Math.abs( date.getHours() - user.getLastActiveTime().getHours()) < 1){
            System.out.println(text);
            return true;
        }
        return false;
    }
}