package fr.univ_amu.iut.exercice4;


import java.util.HashMap;

public class Robot {
    private GridPosition gridPosition;
    private Orientation orientation;

    public Robot(GridPosition gridPosition, Orientation orientation) {
        this.gridPosition = gridPosition;
        this.orientation = orientation;

    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void turnRight() {
        switch(orientation){
            case EAST:
                orientation = Orientation.SOUTH;
                break;
            case SOUTH:
                orientation = Orientation.WEST;
                break;
            case WEST:
                orientation = Orientation.NORTH;
                break;
            case NORTH:
                orientation = Orientation.EAST;
                break;
        }
    }

    public void turnLeft() {
        switch (orientation){
            case EAST:
                orientation = Orientation.NORTH;
                break;
            case SOUTH:
                orientation = Orientation.EAST;
                break;
            case WEST:
                orientation = Orientation.SOUTH;
                break;
            case NORTH:
                orientation = Orientation.WEST;
                break;
        }

    }

    public void advance() {
        throw new RuntimeException("Not yet implemented !");
    }
}

