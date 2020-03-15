package lk.sack.livescore.beans;

import org.springframework.security.access.method.P;

public class Inning {
    int score;
    int overs;
    int balls;
    boolean isCurrentInning;
    Player playerOne;
    Player playerTwo;

    public Inning() {
    }

    public Inning(int score, int overs, int balls, boolean isCurrentInning, Player playerOne, Player playerTwo) {
        this.score = score;
        this.overs = overs;
        this.balls = balls;
        this.isCurrentInning = isCurrentInning;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
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

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }
}
