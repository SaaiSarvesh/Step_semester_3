package week_7.class_problems;

public final class NameTag {
    private final String firstName;
    private final String lastInitial;

    public NameTag(String fullName) {
        String[] parts = fullName.split(" ");
        this.firstName = parts[0];
        this.lastInitial = parts[1].substring(0, 1);
    }

    public String getNickname() {
        return this.firstName + " " + this.lastInitial + ".";
    }

    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        
        System.out.println("tag.getNickname() -> " + tag.getNickname());
    }
}