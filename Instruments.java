package Java;

interface Piano {
    default void play() {
        System.out.println("Playing the piano");
    }
}

interface Guitar {
    default void play() {
        System.out.println("Playing the guitar");
    }
}

class Instrument implements Piano, Guitar {
    
    @Override
    public void play() {
       
        Piano.super.play();
        Guitar.super.play();
    }

    
    void playPiano() {
        Piano.super.play();
    }

    void playGuitar() {
        Guitar.super.play();
    }
}

public class Instruments {
    public static void main(String[] args) {
        Instrument instrument = new Instrument();
        instrument.play();
        System.out.println("---");
        
        instrument.playPiano();
        instrument.playGuitar();
    }
}

