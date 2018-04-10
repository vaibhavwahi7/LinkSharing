package linksharing;

public enum Seriousness {

    SERIOUS, VERYSERIOUS, CASUAL;

    static Seriousness stringAs(String name) {

        return Seriousness.valueOf(name.toLowerCase());
    }
}
