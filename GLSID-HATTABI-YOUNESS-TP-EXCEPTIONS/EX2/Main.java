public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList<>();

        try {
            CompteCourant compte1 = new CompteCourant("CC001", 1000, "Jean Dupont", 500);
            CompteEpargne compte2 = new CompteEpargne("CE001", 5000, "Marie Martin", 2.5);
            CompteCourant compte3 = new CompteCourant("CC002", 300, "Pierre Durand", 200);

            comptes.add(compte1);
            comptes.add(compte2);
            comptes.add(compte3);

            System.out.println("=== Liste des comptes créés ===");
            for (CompteBancaire compte : comptes) {
                compte.affichage();
            }
            System.out.println();

            System.out.println("=== Test de dépôt ===");
            compte1.depot(500);
            compte1.affichage();
            System.out.println();

            try {
                System.out.println("=== Test de retrait avec succès ===");
                compte1.retirer(300);
                compte1.affichage();
                System.out.println();
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            try {
                System.out.println("=== Test de retrait avec fonds insuffisants ===");
                compte3.retirer(1000);
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            try {
                System.out.println("=== Test de découvert autorisé ===");
                compte1.retirer(1300);
                compte1.affichage();
                System.out.println();
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            System.out.println("=== Test des intérêts sur compte épargne ===");
            compte2.affichage();
            compte2.calculerInteret();
            compte2.affichage();
            System.out.println();

            try {
                System.out.println("=== Test de transfert avec succès ===");
                CompteBancaire.transfer(compte2, compte3, 1000);
                compte2.affichage();
                compte3.affichage();
                System.out.println();
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            } catch (CompteInexistantException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            try {
                System.out.println("=== Test de transfert avec compte inexistant ===");
                CompteBancaire.transfer(compte2, null, 500);
            } catch (FondsInsuffisantsException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            } catch (CompteInexistantException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println();
            }

            System.out.println("=== Suppression d'un compte ===");
            System.out.println("Nombre de comptes avant suppression: " + comptes.size());
            comptes.remove(compte3);
            System.out.println("Nombre de comptes après suppression: " + comptes.size());
            System.out.println();

            System.out.println("=== Liste finale des comptes ===");
            for (CompteBancaire compte : comptes) {
                compte.affichage();
            }

        } catch (Exception e) {
            System.out.println("Exception non gérée: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
