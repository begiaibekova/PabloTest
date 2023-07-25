package lumaTestInside;

import com.github.javafaker.Faker;
import selenium.ui.models.User;

public class Users {
    Faker faker = new Faker();
    public User begimai = User.builder().firstName("Begimai").lastName("Aibekova").userEmail(faker.internet().emailAddress())
            .password("Begimai123").build();

    public  User navat = User.builder().firstName("Navat").lastName("Raibekova").userEmail("aibek").password("jkfnkdf").build();

}
