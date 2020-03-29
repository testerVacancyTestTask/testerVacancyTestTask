package models;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.CheckForNull;

@Setter
@Getter
@CheckForNull
public class ExistingUser {
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;

    public ExistingUser() {
    }
}
