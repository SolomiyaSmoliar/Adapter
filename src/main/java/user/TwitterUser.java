package user;

import java.util.Date;

public class TwitterUser extends User{

    public TwitterUser(String country, String email, Date time){
        setCountry(country);
        setUserMail(email);
        setLastActiveTime(time);
    }
}