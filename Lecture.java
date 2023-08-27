public class Lecture {
    public static void main(String[] args) {
        int[][] runsPerOver= {
            {6,4,2,3,4,6},
            {4,5,6,2,3,4},
            {1,1,1,1,1,1}
        };
        int totalRun=0;
        int totalWicket=0;

        for(int i=0;i<runsPerOver.length;i++){
            for(int j=0;j<runsPerOver[i].length;j++){
                if (runsPerOver[i][j]==-63) {
                    totalWicket++;
                }
                else if (runsPerOver[i][j]==-62||runsPerOver[i][j]==-61) {
                    totalRun++;
                } 
                else {
                    totalRun+=runsPerOver[i][j];
                }
            }
        }
        System.out.print(totalRun);
    }
}
