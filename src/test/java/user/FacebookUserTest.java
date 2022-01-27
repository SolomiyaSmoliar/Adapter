package user;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FacebookUserTest {
    private FacebookUser user = new FacebookUser("USA", "dom@gmail.com",  new Date(2021, 12, 12, 12, 12, 12));

    @org.junit.jupiter.api.Test
    void getUserMail() {
        assertEquals(user.getUserMail(), "dom@gmail.com");
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(user.getCountry(), "USA");
    }

    @org.junit.jupiter.api.Test
    void getLastActiveTime() {
        assertEquals(user.getLastActiveTime(),
                new Date(2021, 12, 12, 12, 12, 12));
    }

}