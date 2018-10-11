package domain;

import java.util.Objects;

public class Inchirieri extends Entity{

    private String idClient;
    private String idMovie;

    public Inchirieri(int id, String idClient, String idMovie) {
        super(id);
        this.idClient = idClient;
        this.idMovie = idMovie;
    }

    public String getIdClient() { return idClient; }

    public void setIdClient(String idClient) { this.idClient = idClient; }

    public String getIdMovie() { return idMovie; }

    public void setIdMovie(String idMovie) { this.idMovie = idMovie;}

    @Override
    public String toString() {
        return "Inchiriere("+
                "idClient=" + idClient + '\'' +
                ", idMovie=" + idMovie + '\'' +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inchirieri that = (Inchirieri) o;
        return Objects.equals(idClient, that.idClient) &&
                Objects.equals(idMovie, that.idMovie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, idMovie);
    }
}
