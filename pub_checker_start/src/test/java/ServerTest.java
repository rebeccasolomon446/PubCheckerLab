import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;


    @BeforeEach
    public void setUp(){
        server = new Server();

    }

    // TODO: test that guest can only get served if over 18

    @Test
    public void over18CanBeServed() {
        Guest guest = new Guest("Bob", 21, 10.00, "notBanned", 70, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void under18CanBeServed() {
        Guest guest = new Guest("Gene", 15, 15.00, "notBanned", 70, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    @Test
    public void enoughMoneyCanBeServed() {
        Guest guest = new Guest("Louise", 25,10.00, "notBanned", 70, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void notEnoughMoneyCanBeServed() {
        Guest guest = new Guest("Linda", 25,3.00, "notBanned", 70, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }

    // TODO: test that guest can only get served if guest is not banned from the pub

    @Test
    public void bannedFromPub() {
        Guest guest = new Guest("Rimm", 22,20.00, "banned", 70, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void notBannedFromPub() {
        Guest guest = new Guest("Lisa", 36,12.00, "notBanned", 70, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isTrue();
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    @Test
    public void tooDrunk() {
        Guest guest = new Guest("Peter", 34, 40.00, "notBanned", 40, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();

    }

    @Test
    public void soberenough() {
        Guest guest = new Guest("Alison", 34, 40.00, "notBanned", 85, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isTrue();

    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    @Test
    public void correctCurrency() {
        Guest guest = new Guest("Nina", 25, 30.00, "notBanned", 90, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isTrue();

    }

    @Test
    public void wrongCurrency() {
        Guest guest = new Guest("Cindy", 25, 20.00, "notBanned", 90, '$');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();

    }


    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}
