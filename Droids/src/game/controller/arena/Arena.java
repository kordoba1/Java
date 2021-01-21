package game.controller.arena;

public abstract class Arena {
    public abstract String startBattle();
    protected abstract void setOpponents();
    protected abstract void printRoundInformation(int round);
}
