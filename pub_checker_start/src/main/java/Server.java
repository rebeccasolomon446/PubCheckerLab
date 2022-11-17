public class Server {

    public boolean canServeGuest(Guest guest){
        if(guest.getAge() < 18) {
            return false;
        }
        if(guest.getMoney() < 5.00) {
            return false;
        }
        if(guest.getBannedOrNot() == "banned") {
            return false;
        }
        if(guest.getSobrietyLevel() < 50 ) {
            return false;
        }
        if (guest.getCurrency() != '£') {
            return false;
        }

        return true ;
    }


        }





