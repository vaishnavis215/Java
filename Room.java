class Room {
    int roomNo;
    int capacity;

    void checkIn() {
        System.out.println("Thank you for Checking In at Room No: " + roomNo + ". Capacity of the room is: " + capacity);
    }

    void checkOut() {
        System.out.println("Thank you! Visit Again..!");
    }

    public static void main(String args[]) {
        Room r = new Room();      
        r.roomNo = 101;          
        r.capacity = 4;
        r.checkIn();              
        r.checkOut();     
    }
}
