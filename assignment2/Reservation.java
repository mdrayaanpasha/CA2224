abstract class Reservations{
    abstract void Reserve();
}

class BusReservation extends Reservations{
    void Reserve(){
        System.out.println("Bus Reservation...");
    }
}


class TrainReservation extends Reservations{
    void Reserve(){
        System.out.println("Train Reservation...");
    }
}


class Reservation{
    public static void main(String[] args) {
        BusReservation BR = new BusReservation();
        TrainReservation TR =  new TrainReservation();
        System.out.println("= = ABSTRACT CLASS USAGE = = \n Mohammed Rayaan Pasha \n 10-03-25\n"); 
        BR.Reserve();
        TR.Reserve();
    }
}