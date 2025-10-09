class Country {
    String name;
    long population;
    String capital;

    void DisplayInfo() {
        System.out.println(name+" is  a  Country  which  have  " +population+ " population  And  " +capital+ "  is capital   of" +name);
    }

    public static void main(String args[]) {
        Country C1 = new Country();      
        C1.name = "India";        
        C1.population = 1430000000 ;
        C1.capital="Delhi";             
        C1.DisplayInfo();     
    }
}
