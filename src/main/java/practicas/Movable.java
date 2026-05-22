package practicas;

// lo que se ve es que son 2 interfaces y una clase la cual esta clase va a implentar las interfaces


public interface Movable {
    int offset = 100;
    public void move(int dx);
}
interface Growable{
    public void grow(int dy);
}
class Animal implements Movable, Growable{
    public void move (int dx){}
    public void grow (int dy){}
}
