public class DriverClass {
    public static void main(String[] args) {

        Cup myCup = new CupSetFactory().getInstance("Large");

        myCup.specs();
}
