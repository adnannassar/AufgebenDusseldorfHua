package IOC.Speakers;

public class SpeakerFactory {

    public static Speaker createSpeaker(SpeakerType type) {
        if (type == null) {
            return null;
        }
        if (type.equals(SpeakerType.SONY)) {
            return new SonySpeaker();
        }
        else if(type.equals(SpeakerType.BOSE)){
            return new BoseSpeakers();
        }
        return null;
    }
}
