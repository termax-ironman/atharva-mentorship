class PlayVideo  {
    void play() {
        for(int i =0;i <=100;i++) {
            System.out.println("Playing video");
        }

    }
}
class PlayAudio {
    void playSound() {
        for(int i =0;i <=100;i++) {
            System.out.println("Playing audio");
        }
    }
}

public class Vlc1 {
    public static void main(String[] args) {
        PlayVideo pv = new PlayVideo();
        pv.play();

        PlayAudio pa = new PlayAudio();
        pa.playSound();
    }
}
