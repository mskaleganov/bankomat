package bankomat;

public class ATM implements Application {
    @Override
    public String GetBalance(String pin, Card card) {
        public String GetBalance (Host server){
            return server.GetBalance(pin, card);
        }
    }
}
