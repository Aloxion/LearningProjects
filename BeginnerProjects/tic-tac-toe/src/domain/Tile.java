package domain;

public class Tile {
    private String type;
    private int x,y;

    public Tile(){

    }

    public Tile(String type, int x, int y){
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public String getType(){
        return type;
    }

}
