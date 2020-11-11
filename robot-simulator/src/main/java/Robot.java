public class Robot {

    private GridPosition position;
    private Orientation orientation;

    public Robot(GridPosition initialPosition, Orientation initialOrientation) {
        this.position = initialPosition;
        this.orientation = initialOrientation;
    }

    public GridPosition getGridPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void turnRight() {
        switch (orientation) {
            case EAST -> orientation = Orientation.SOUTH;
            case SOUTH -> orientation = Orientation.WEST;
            case WEST -> orientation = Orientation.NORTH;
            case NORTH -> orientation = Orientation.EAST;
        }
    }

    public void turnLeft() {
        switch (orientation) {
            case EAST -> orientation = Orientation.NORTH;
            case NORTH -> orientation = Orientation.WEST;
            case WEST -> orientation = Orientation.SOUTH;
            case SOUTH -> orientation = Orientation.EAST;
        }
    }

    public void advance() {
        int currentX = position.x;
        int currentY = position.y;
        int changeX = 0, changeY = 0;

        switch (orientation) {
            case EAST -> changeX = 1;
            case SOUTH -> changeY = -1;
            case WEST -> changeX = -1;
            case NORTH -> changeY = 1;
        }
        position = new GridPosition(currentX + changeX, currentY + changeY);
    }

    public void simulate(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'L' -> turnLeft();
                case 'R' -> turnRight();
                case 'A' -> advance();
                default -> throw new RuntimeException("Unknown instruction: " + instruction);
            }
        }
    }

}