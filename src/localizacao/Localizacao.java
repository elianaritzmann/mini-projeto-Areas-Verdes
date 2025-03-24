package localizacao;

import areaverde.AreaVerde;

public class Localizacao  {
    private int id;
    private double latitude;
    private double longitude;
    private AreaVerde idAreaVerde;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Localizacao{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", idAreaVerde=" + idAreaVerde +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public AreaVerde getIdAreaVerde() {
        return idAreaVerde;
    }

    public void setIdAreaVerde(AreaVerde idAreaVerde) {
        this.idAreaVerde = idAreaVerde;
    }
}




