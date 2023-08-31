public class Events {
    private String eventName = null;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public enum events{
        outOfFood,
        outOfDiapers,
        babyCrying,
        babySmiling,
        babySleeping,
        babyEating

    }
}
