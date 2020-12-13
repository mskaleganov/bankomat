package bankomat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Card {
    private String name;
    private String firstName;
    private String pan;
    private String CVV;

    public Card(String name, String firstName, String pan, String CVV) {
        this.name = name;
        this.firstName = firstName;
        this.pan = pan;
        this.CVV = CVV;
    }
}
