package lecture_20221204;

class Tv {
    String color;
    boolean power;
    int channel;
    void power(){ power = !power; }
    void channelUp(){ ++channel; }
    void channelDown(){ --channel; }
}