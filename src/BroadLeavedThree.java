import java.util.Arrays;
import java.util.List;

public class BroadLeavedThree implements Tree{

    int year = 0;
    List<String> timeOfYear = Arrays.asList("Autumn", "Winter","Spring", "Summer");
    boolean hasLeaves = true;
    int stem = 1;
    int branches = 0;

    public BroadLeavedThree(int year, List<String> timeOfYear, boolean hasLeaves, int stem, int branches) {
        this.year = year;
        this.timeOfYear = timeOfYear;
        this.hasLeaves = hasLeaves;
        this.stem = stem;
        this.branches = branches;
    }

    @Override
    public void grow(int year) {
        for (int i =0; i<= timeOfYear.size(); i++){
            if (i == 4){
                i = 0;
                year++;
                branches +=3;
                stem++;
            }
        }
    }

    @Override
    public void discardTheLeaves(List<String> timeOfYear) {
        for (int i =0; i<=timeOfYear.size(); i++) {
            if (timeOfYear.get(i).equals("Winter")){
               hasLeaves = false;
            }
        }
    }

    @Override
    public void rustleTheLeaves(boolean hasLeaves) {
        for (int i =0; i<=timeOfYear.size(); i++) {
            if (timeOfYear.get(i).equals("Winter")) {
                hasLeaves = false;
                System.out.println("My leaves gone!");
            } else {
                System.out.println("Every day I`m rustling");
            }
        }
    }

}
