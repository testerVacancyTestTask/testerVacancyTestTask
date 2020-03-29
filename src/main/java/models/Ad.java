package models;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.CheckForNull;

@Getter
@Setter
@CheckForNull
public class Ad {
    private String company;
    private String url;
    private String text;

    public Ad() {
    }
}
