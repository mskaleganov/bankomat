package bankomat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ATM implements Application {
    private String id;
    private Card card;
    private String pin;

    public ATM(String id, Card card, String pin) {
        this.id = id;
        this.card = card;
        this.pin = pin;
    }

    @Override
    public String getBalance(String pin, Card card) {
        if ((this.pin.equals(pin)) & (this.card == card)) {
            return "30 рублей";
        } else {
            return "Пин код не верен";
        }
    }
}
