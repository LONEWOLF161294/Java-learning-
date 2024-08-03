public class ChildAircraft extends ParentAirCraft {
    String name = "rafael";

//method overloading
    public void getData(int a) {

        System.out.println(a);


    }

    public void getData(String a) {
        System.out.println(a);


    }

}