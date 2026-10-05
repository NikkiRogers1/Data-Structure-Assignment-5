import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Collections for each phase
        ArrayCollection<Artifact> arrayArtifacts = new ArrayCollection<>();
        LinkedCollection<Artifact> artifacts = new LinkedCollection<>();
        ArrayList<Artifact> museumList = new ArrayList<>();

        // Artifacts for Phase 1 and Phase 2
        Artifact artifact1 = new Artifact("A101", "Merlins Staff", "1700's");
        Artifact artifact2 = new Artifact("B205", "Cleopatra's crown", "60 BC");
        Artifact artifact3 = new Artifact("C309", "Zeus thunderbolt", "1 BC");
        Artifact artifact4 = new Artifact("B205", "", "");

        // Phase 1: ArrayCollection
        arrayArtifacts.add(artifact1);
        arrayArtifacts.add(artifact2);
        arrayArtifacts.add(artifact3);

        System.out.println("ArrayCollection:");
        System.out.println(arrayArtifacts.contains(artifact4));
        System.out.println(arrayArtifacts.get(artifact4));

        arrayArtifacts.remove(artifact2);
        System.out.println(arrayArtifacts.size());

        // Phase 2: LinkedCollection
        artifacts.add(artifact1);
        artifacts.add(artifact2);
        artifacts.add(artifact3);

        System.out.println("LinkedCollection:");
        System.out.println(artifacts.contains(artifact4));
        System.out.println(artifacts.get(artifact4));

        artifacts.remove(artifact2);

        System.out.println(artifacts.size());
        System.out.println(artifacts.get(artifact1));
        System.out.println(artifacts.get(artifact3));

        artifacts.remove(artifact3);
        System.out.println(artifacts.size());
        System.out.println(artifacts.get(artifact1));

        // Phase 3: ArrayList and Comparable
        Artifact museumArtifact1 = new Artifact("M04", "Artifact One", "Ancient");
        Artifact museumArtifact2 = new Artifact("A01", "Artifact Two", "Ancient");
        Artifact museumArtifact3 = new Artifact("Z99", "Artifact Three", "Ancient");
        Artifact museumArtifact4 = new Artifact("B12", "Artifact Four", "Ancient");

        museumList.add(museumArtifact1);
        museumList.add(museumArtifact2);
        museumList.add(museumArtifact3);
        museumList.add(museumArtifact4);

        System.out.println("Before sorting:");
        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }

        Collections.sort(museumList);

        System.out.println("After sorting:");
        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }
    }
}