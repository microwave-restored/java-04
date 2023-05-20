package org.dstu.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Monitor {
    private int id;
    private String model;
    private String matrix;
    private String diagonal;
    private String resolution;
    private Integer freshrate;
    private Manufacturer manufacturer;

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
    @Column(name = "freshrate")
    public Integer getFreshrate() {
        return freshrate;
    }

    public void setFreshrate(Integer freshrate) {
        this.freshrate = freshrate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manufacturer_id")
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return id == monitor.id && Objects.equals(model, monitor.model) && Objects.equals(matrix, monitor.matrix) && Objects.equals(diagonal, monitor.diagonal) && Objects.equals(resolution, monitor.resolution) && Objects.equals(freshrate, monitor.freshrate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, matrix, diagonal, resolution, freshrate);
    }
}
