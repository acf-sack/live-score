package lk.sack.livescore.beans;

public class TestMatch {
    Inning teamOneFirstInning;
    Inning teamTwoFirstInning;
    Inning teamOneSecondInning;
    Inning teamTwoSecondInning;

    public TestMatch() {
    }

    public TestMatch(Inning teamOneFirstInning, Inning teamTwoFirstInning, Inning teamOneSecondInning, Inning teamTwoSecondInning) {
        this.teamOneFirstInning = teamOneFirstInning;
        this.teamTwoFirstInning = teamTwoFirstInning;
        this.teamOneSecondInning = teamOneSecondInning;
        this.teamTwoSecondInning = teamTwoSecondInning;
    }

    public Inning getTeamOneFirstInning() {
        return teamOneFirstInning;
    }

    public void setTeamOneFirstInning(Inning teamOneFirstInning) {
        this.teamOneFirstInning = teamOneFirstInning;
    }

    public Inning getTeamTwoFirstInning() {
        return teamTwoFirstInning;
    }

    public void setTeamTwoFirstInning(Inning teamTwoFirstInning) {
        this.teamTwoFirstInning = teamTwoFirstInning;
    }

    public Inning getTeamOneSecondInning() {
        return teamOneSecondInning;
    }

    public void setTeamOneSecondInning(Inning teamOneSecondInning) {
        this.teamOneSecondInning = teamOneSecondInning;
    }

    public Inning getTeamTwoSecondInning() {
        return teamTwoSecondInning;
    }

    public void setTeamTwoSecondInning(Inning teamTwoSecondInning) {
        this.teamTwoSecondInning = teamTwoSecondInning;
    }
}
