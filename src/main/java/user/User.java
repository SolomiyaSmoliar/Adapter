package user;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class User {

    private String UserMail;
    private String Country;
    private Date LastActiveTime;

}