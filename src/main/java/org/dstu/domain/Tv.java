package org.dstu.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tv {
    private int id;
    private String model;
    private String matrix;
    private String diagonal;
    private String resolution;
    private String wifi;
    private int smartTv;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "matrix")
    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    @Basic
    @Column(name = "diagonal")
    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    @Basic
    @Column(name = "resolution")
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Basic
    @Column(name = "wifi")
    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    @Basic
    @Column(name = "smart_tv")
    public int getSmartTv() {
        return smartTv;
    }

    public void setSmartTv(int smartTv) {
        this.smartTv = smartTv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return id == tv.id && smartTv == tv.smartTv && Objects.equals(model, tv.model) && Objects.equals(matrix, tv.matrix) && Objects.equals(diagonal, tv.diagonal) && Objects.equals(resolution, tv.resolution) && Objects.equals(wifi, tv.wifi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, matrix, diagonal, resolution, wifi, smartTv);
    }
}
