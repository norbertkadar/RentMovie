package domain;

public class Movie  extends Entity{
     private String name;
     private int pret ;
     private String gen;

    public Movie(int id, String name, int pret, String gen) {
        super(id);
        this.name = name;
        this.pret = pret;
        this.gen = gen;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }


}
