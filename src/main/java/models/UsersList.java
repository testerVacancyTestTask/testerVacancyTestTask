package models;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.CheckForNull;
import java.util.List;

@Getter
@Setter
@CheckForNull
public class UsersList {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<ExistingUser> data;
    private Ad ad;

    public UsersList() {
    }

    public List<ExistingUser> getData() {
        return data;
    }

    public Ad getAd() {
        return ad;
    }
}
