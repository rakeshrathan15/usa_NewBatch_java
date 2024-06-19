package election;

public class ConstituencyTest {

    public static void main(String[] args) {
        ElectionService electionService=new ElectionService();
        State state1= electionService.getState();



       // System.out.println(electionService.getState().toString());
        System.out.println( state1.stateName);
        System.out.println(state1.constituencies.length);
        System.out.println(state1.constituencies[0].numberOfVoters);
        System.out.println(state1.constituencies[0].constituencyName);

       System.out.println(state1.constituencies[0].type);
     //  System.out.println(state1.constituencies[0].state);
    }


}
