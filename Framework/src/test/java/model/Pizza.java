package model;

import java.util.Objects;

public class Pizza {

    private String name;
    private String cost;
    private String size;
    private String nameXPath;
    private String costXPath;
    private String sizeXPath;

    public Pizza(Boolean xpathOnly, String name, String cost, String size) {
        if (xpathOnly) {
            this.name = null;
            this.cost = null;
            this.size = null;
            this.nameXPath = name;
            this.costXPath = cost;
            this.sizeXPath = size;
        }
        else {
            this.name = name;
            this.cost = cost;
            this.size = size;
            this.nameXPath = null;
            this.costXPath = null;
            this.sizeXPath = null;
        }
    }

    public Pizza(String name, String cost, String size, String nameXPath, String costXPath, String sizeXPath) {
        this.name = name;
        this.cost = cost;
        this.size = size;
        this.nameXPath = nameXPath;
        this.costXPath = costXPath;
        this.sizeXPath = sizeXPath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getCost() {
        return cost;
    }

    public void setNameXPath(String nameXPath) {
        this.nameXPath = nameXPath;
    }

    public void setCostXPath(String costXPath) {
        this.costXPath = costXPath;
    }

    public void setSizeXPath(String sizeXPath) {
        this.sizeXPath = sizeXPath;
    }

    public String getNameXPath() {
        return nameXPath;
    }

    public String getSizeXPath() {
        return sizeXPath;
    }

    public String getCostXPath() {
        return costXPath;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return name.equals(pizza.name) &&
                cost.equals(pizza.cost) &&
                size.equals(pizza.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, size);
    }
}
