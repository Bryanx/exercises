package be.kdg.dictee.model;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Dictee {
    private String voiceName;
    private String tekst;

    public Dictee() {
        this.voiceName = "kevin16";
        this.tekst = "That's one small step for a man, one giant leap for mankind";
    }
    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
    public String getTekst() {
        return tekst;
    }
    public void leesVoor() {
        Voice voice = VoiceManager.getInstance().getVoice(voiceName);
        voice.allocate();
        voice.speak(tekst);
        voice.deallocate();
    }
    public static void main(String[] args) {
        Dictee d = new Dictee();
        d.leesVoor();
    }
}