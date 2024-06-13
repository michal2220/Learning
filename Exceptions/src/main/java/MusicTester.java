import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;
import static javax.sound.midi.ShortMessage.*;

public class MusicTester {
    public void graj() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Mamy sequencer");
        } catch (MidiUnavailableException e) {
            System.out.println("Masz problem ");
        }
    }

    public static void main(String[] args) {
        MusicTester musicTester = new MusicTester();
        musicTester.graj();
    }
}

