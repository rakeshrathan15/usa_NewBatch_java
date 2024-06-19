package election;

import java.util.Arrays;
import java.util.List;

public class State {


 public   String stateName;


 public Constituency[] constituencies;

 @Override
 public String toString() {
  return "State{" +
          "stateName='" + stateName + '\'' +
          ", constituencies=" + Arrays.toString(constituencies) +
          '}';
 }
}
