package bankomat;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Client {
    private String pin;
    private Card card;

    public Client(String pin, Card card) {
        this.pin = pin;
        this.card = card;
    }

    public String getBalance(Application atm) {
        return atm.getBalance(pin, card);
    }
}
