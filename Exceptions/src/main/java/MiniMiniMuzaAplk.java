import javax.sound.midi.*;

import static javax.sound.midi.ShortMessage.NOTE_OFF;
import static javax.sound.midi.ShortMessage.NOTE_ON;

public class MiniMiniMuzaAplk {

    public static void main(String[] args) {
        MiniMiniMuzaAplk mini = new MiniMiniMuzaAplk();
        mini.graj();
    }

    public void graj() {
        try {
            Sequencer sekwenser = MidiSystem.getSequencer();
            sekwenser.open();
            Sequence sekw = new Sequence(Sequence.PPQ, 4);
            Track sciezka = sekw.createTrack();

            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(NOTE_ON, 1, 44, 100);
            MidiEvent nutaPocz = new MidiEvent(msg1, 1);
            sciezka.add(nutaPocz);
            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(NOTE_OFF, 1, 44, 100);
            MidiEvent nutaKon = new MidiEvent(msg2, 16);
            sciezka.add(nutaKon);

            sekwenser.setSequence(sekw);
            sekwenser.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
