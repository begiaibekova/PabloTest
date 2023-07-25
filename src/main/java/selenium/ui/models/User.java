package selenium.ui.models;

import lombok.*;

@EqualsAndHashCode
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    public String firstName;
    public String lastName;
    public String fullName;
    public String password;
    public  String userEmail;
    public  String userCurrentAddress;
    public  String userPermanentAddress;
    public String age;
    public String salary;
    public String department;

}
