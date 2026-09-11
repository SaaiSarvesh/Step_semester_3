package week_5.class_problems;
public class DuplicateTeamFinder {

    public static String findDuplicateTeam(String[] teamNames) {
        if (teamNames == null || teamNames.length == 0) {
            return "No Duplicates";
        }

        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i] != null && teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }

        return "No Duplicates";
    }

    public static void main(String[] args) {
        String[] teams = {"ByteForce", "CodeCrafters", "ByteForce"};
        System.out.println(findDuplicateTeam(teams));
    }
}