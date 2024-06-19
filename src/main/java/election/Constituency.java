package election;

import java.util.List;

public class Constituency {

    public String constituencyName;

    public String type;

    public int numberOfVoters;

    public State state;

    @Override
    public String toString() {
        return "Constituency{" +
                "constituencyName='" + constituencyName + '\'' +
                ", type='" + type + '\'' +
                ", numberOfVoters=" + numberOfVoters +
                ", state=" + state +
                '}';
    }
}
