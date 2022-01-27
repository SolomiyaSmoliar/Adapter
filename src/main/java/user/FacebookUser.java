package user;

import java.util.Date;

public class FacebookUser extends User{

    public FacebookUser(String country, String email, Date time){
        setCountry(country);
        setUserMail(email);
        setLastActiveTime(time);
    }
}