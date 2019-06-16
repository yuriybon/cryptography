package ua.bondary.domain;

public class Keys {
    private long key;
    private long general;

    public Keys(long key, long general) {
        this.key = key;
        this.general = general;
    }

    public long getKey() {
        return key;
    }

    public long getGeneral() {
        return general;
    }
}
