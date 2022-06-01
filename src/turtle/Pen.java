package turtle;

public class Pen {
    private PenPosition position;

    public void isPenUp(){
       position =  PenPosition.UP;
    }
    public boolean getPosition(){
        if(position == PenPosition.DOWN){
            return true;
        }
        return  false;
    }
    public void pensDown(){
        position =  PenPosition.DOWN;
    }

    public void left(){
        if(getPosition()){

        }
    }

    public void right(){
        if(getPosition()){

        }

    }
}
