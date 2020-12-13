package bankomat;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Slf4j
public class Main {
    public void main(String[] args) {
        Logger log = LoggerFactory.getLogger(Main.class);
        // TODO: 13.12.2020 Убрать в аннотацию 

        Card card = new Card("Ivan", "Ivanov", "123456789", "000");
        Client client = new Client("1234", card);
        ATM atm = new ATM("123456", card, "1234");
        log.info(client.getBalance(atm));
    }
}
