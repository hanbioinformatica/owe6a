package Ronald;

class GameOfLife {
    private boolean[][] gamestate;
    private boolean[][] nextgamestate;
    private int dimx;
    private int dimy;

    GameOfLife(int dimensionX, int dimensionY) {
        gamestate = new boolean[dimensionX][dimensionY];
        nextgamestate = new boolean[dimensionX][dimensionY];
        dimx = dimensionX;
        dimy = dimensionY;
        for (int ix = 0; ix < dimx; ix++) {
            for (int iy = 0; iy < dimy; iy++) {
                gamestate[ix][iy] = false;
            }
        }
    }

    // Getters
    boolean[][] getGamestate() {
        return gamestate;
    }
    int getDimx() {
        return dimx;
    }
    int getDimy() {
        return dimy;
    }

    // Setters (Also sort-of setters)
    void setAlive(int x, int y){
        gamestate[x][y] = true;
    }
    void setDead(int x, int y){
        gamestate[x][y] = false;
    }
    void setOpposite(int x, int y) {
        gamestate[x][y] = !(gamestate[x][y] = true);  // What sorcery is this
    }

    /* Rules
    Any live cell with two or three neighbors survives.
    All other live cells die in the next generation. Similarly, all other dead cells stay dead.
    Any dead cell with three live neighbors becomes a live cell.
    */
    void update() {
        boolean cell;
        int nearby;
        for (int ix = 0; ix < dimx; ix++) {
            for (int iy = 0; iy < dimy; iy++) {  // Linear
                cell = gamestate[ix][iy];
                nearby = checkNearby(ix, iy);
                if (cell=true) {
                    if (nearby < 2 || nearby > 3){ cell = false; }  // Alive>Dead when under or overpopulated
                } else {
                    if (nearby > 2) { cell = true; }  // Dead>Alive with 3 or more neighbors.
                }
                nextgamestate[ix][iy] = cell;
            }
        }
        gamestate = nextgamestate.clone();
    }

    //Check nearby cells, but stay in bounds. Bounds: >0, <dimx, <dimy.
    private int checkNearby(int x, int y) {
        int alive = 0;

        if (y >= 0){
            if (x>=0) {if (gamestate[x-1][y-1] = true){ alive++; }}
            if (gamestate[x][y-1] = true){ alive++; }
            if (x<dimx) {if (gamestate[x+1][y-1] = true){ alive++; }}
        }

        if (x>=0) {if (gamestate[x-1][y] = true){ alive++; }}
        if (x<dimx) {if (gamestate[x+1][y] = true){ alive++; }}

        if (y <= dimy){
            if (x>=0) {if (gamestate[x-1][y+1] = true){ alive++; }}
            if (gamestate[x][y+1] = true){ alive++; }
            if (x<dimx) {if (gamestate[x+1][y+1] = true){ alive++; }}
        }

        return alive;
    }
}
