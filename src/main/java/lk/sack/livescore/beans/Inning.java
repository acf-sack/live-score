package lk.sack.livescore.beans;

public class Inning {
    int score;
    int overs;
    int balls;
    boolean isCurrentInning;

    public Inning() {
    }

    public Inning(int score, int overs, int balls, boolean isCurrentInning) {
        this.score = score;
        this.overs = overs;
        this.balls = balls;
        this.isCurrentInning = isCurrentInning;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public boolean isCurrentInning() {
        return isCurrentInning;
    }

    public void setCurrentInning(boolean currentInning) {
        isCurrentInning = currentInning;
    }
}
