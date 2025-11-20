
class Products {

    int pid;
    String pname;
    double pprice;

    Products(int pid, String pname, double pprice) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
    }

    public void display() {
        System.out.println("\nProduct Id:" + pid + "\nProduct Name:" + pname + "\nProduct Price:" + pprice);
    }

}

class ArrayProducts {

    public static void main(String[] args) {
        Products obj[] = new Products[5];
        obj[0] = new Products(101, "iphone", 120);
        obj[1] = new Products(102, "iphone17", 130);
        obj[2] = new Products(103, "iphone16", 150);
        obj[3] = new Products(104, "iphone15", 170);
        obj[4] = new Products(105, "iphone14", 190);
        obj[0].display();
        obj[1].display();
        obj[2].display();
        obj[3].display();
        obj[4].display();

    }
}
