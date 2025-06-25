class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    //Default Constructor
    HotelBooking(){
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }
    //Parameterized Constructor
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    // Copy Constructor
    HotelBooking(HotelBooking other){
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    void BookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
    public static void main(String[] args){
        HotelBooking h1 = new HotelBooking();
        System.out.println("Default Booking:");
        h1.BookingDetails();
        HotelBooking h2 = new HotelBooking("Akshay Agarwal", "Deluxe", 3);
        System.out.println("Detailed Booking: ");
        h2.BookingDetails();
        System.out.println("Copy Details Booking: ");
        HotelBooking h3 = new HotelBooking(h2);
        h3.BookingDetails();
    }
}