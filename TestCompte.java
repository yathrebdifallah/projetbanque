public class TestCompte {
    public static void main(String[] args) {
        Compte c1 = new Compte("yathreb", 2000);
        Compte c2 = new Compte("manar", 3000);

        System.out.println(c1);
        System.out.println(c2.getTitulaire());

        CompteEpargne c3 = new CompteEpargne("Amna", 700, 0);

        /*
         * double montant = 1200;
         * if (c3.getSolde() < montant) {
         * System.out.println(x:"Solde insuffisant !");
         * } else {
         * c3.debiter(montant:1200);
         * }
         */

        try {
            c3.debiter(300);
            System.out.println(c3.getSolde());

        } catch (SoldeInsuffisantException e) {
            System.out.println(e);
        }

        System.out.println(c3);

        // System.out.println("------");

        // Banque bh = new Banque("bh");

        // System.out.println(nom: "bh");

        // stb.addCompte(c1);
        // stb.addCompte(c2);
        // stb.addCompte(c3);
    }
}