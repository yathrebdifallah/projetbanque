class Compte {
    private String titulaire;
    private double solde;

    public Compte(String titulaire) {
        this.titulaire = titulaire;
        this.solde = 0.0;
    }
    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void debiter(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Débit de " + montant + " effectué. Nouveau solde : " + solde);
        } else {
            System.out.println("Débit impossible. Solde insuffisant.");
        }
    }
    
    public void crediter(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Crédit de " + montant + " effectué. Nouveau solde : " + solde);
        } else {
            System.out.println("Crédit impossible. Montant invalide.");
        }
    }

    @Override
    public String toString() {
        return "Compte [titulaire=" + titulaire + ", solde=" + solde + "]";
    }

}
