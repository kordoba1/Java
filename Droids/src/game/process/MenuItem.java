package game.process;

public enum MenuItem {
    LOWER_LIMIT(1),
    ADD_ITEM(1),
    SHOW_ITEM(2),
    SINGLE_ITEM(3),
    TEAM_ITEM(4),
    QUIT_ITEM(5),
    UPPER_LIMIT(5);

    private final int point;

    MenuItem(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }
}
