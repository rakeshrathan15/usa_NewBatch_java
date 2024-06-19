package election;

public class ElectionService {

    public State getState(){
        State tg=new State();
        tg.stateName="TG";

        Constituency[] constituencies=new Constituency[2];
        Constituency constituency= new Constituency();
        tg.constituencies=constituencies;
        constituency.constituencyName="HYD";
        constituency.numberOfVoters=10000;
         constituency.type="MP";
         constituency.state=tg;
         constituencies[0]=constituency;
         return tg;
    }
}
