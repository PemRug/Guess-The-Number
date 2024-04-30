public abstract class Player {
    private String name;
    private String ready;
    protected int[] guesses;


    public Player(String name) {
        this.name = name;
        guesses = new int[100];

    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    void setReady(String ready) {
        this.ready = ready;
    }

    public abstract void makeGuess(int guess);
}
