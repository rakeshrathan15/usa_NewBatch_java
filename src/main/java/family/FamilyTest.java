package family;

public class FamilyTest {

    public static void main(String[] args) {
        Family test=new Family();  //here i am creating object
        test = new Family();
        test = new Family();
        //i am assign the new object to test ref so the above object is eligble for garbage collection

        test = new Family();

        test.name="Rakesh";

        Family ref=test;
        Family ref1=test;
        ref1.name="Lokesh";
        Family ref2=test;

        Family a1=new Family();
        a1.name="A";
        a1.name="B";

         Family a=new Family();
        test=a;

        System.out.println(ref2.name);
        System.out.println(ref1.name);
        System.out.println(ref.name);
        System.out.println("from a = "+a.name);
        System.out.println("From a1 = "+a1.name);
        System.out.println(test.name);

    }
}
