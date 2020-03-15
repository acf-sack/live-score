package lk.sack.livescore.beans;

public class TestMatch {
    String status;
    Inning teamOneFirstInning;
    Inning teamTwoFirstInning;
    Inning teamOneSecondInning;
    Inning teamTwoSecondInning;

    public TestMatch() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
