class Inot extends Sportivi
{
    int rank;
    String divizie, categorie, nationala;

    Inot()
    {

    }Inot(int cod ,String nume, String prenume, String gen , String DataNasterii ,
          double GreutateaInKilograme, double InaltimeaInCentimentri, boolean StudiiSuperioare,int rank, String divizie, String categorie, String nationala)
    {
        super(cod, nume, prenume, gen, DataNasterii, GreutateaInKilograme, InaltimeaInCentimentri, StudiiSuperioare);
        this.rank = rank;
        this.divizie = divizie;
        this.categorie = categorie;
        this.nationala = nationala;
    }

    @Override
    String getProbaSportiva()
    {
        return "inot";
    }

    int getRank()
    {
        return rank;
    }

    String getDivizie()
    {
        return divizie;
    }

    String getCategorie()
    {
        return categorie;
    }

    String getNationala()
    {
        return nationala;
    }
}
