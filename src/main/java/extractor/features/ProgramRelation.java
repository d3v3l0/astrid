package extractor.features;

public class ProgramRelation {
    private Property source;
    private Property target;
    private String path;

    ProgramRelation(Property sourceName, Property targetName, String path) {
        source = sourceName;
        target = targetName;
        this.path = path;
    }

    public String toString() {
        return String.format("%s,%s,%s", source.getName(), path,
                target.getName());
    }

}
