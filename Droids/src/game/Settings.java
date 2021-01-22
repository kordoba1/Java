package game;

public enum Settings {

    ADD_ITEM(1),
    SHOW_ITEM(2),
    SINGLE_ITEM(3),
    TEAM_ITEM(4),
    QUIT_ITEM(5);

    private final int value;

    Settings(int value) {
        this.value = value;
    }

    public int getPoint() {
        return value;
    }

}
