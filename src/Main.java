public class Main {

    public static void main(String[] args) {
        
        LinkedCollection<Artifact> artifacts = new LinkedCollection<>();

        Artifact artifact1 = new Artifact("A101", "Merlins staff", "1700's");

        Artifact artifact2 = new Artifact("B205", "Cleopatra's crown", "60 BC");

        Artifact artifact3 = new Artifact("C309", "Zeus thunderbolt", "1 BC ");
    


        artifacts.add(artifact1);
        artifacts.add(artifact2);
        artifacts.add(artifact3);

        Artifact artifact4 = new Artifact("B205","", "");
        
        System.out.println(artifacts.contains(artifact4));
        System.out.println(artifacts.get(artifact4));

        artifacts.remove(artifact2);
        
        System.out.println(artifacts.size());

        System.out.println(artifacts.get(artifact1));
        System.out.println(artifacts.get(artifact3));

        artifacts.remove(artifact3);
        System.out.println(artifacts.size());
        System.out.println(artifacts.get(artifact1));


    }

    }

