/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.swordsAndHorses.model;

import java.io.Serializable;

/**
 *
 * @author Justen
 */
public class Location implements Serializable{
    private int row;
    private int column;
    private boolean hasItem;

    public Location() {
    }

    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getHasItem() {
        return hasItem;
    }

    public void setHasItem(boolean hasItem) {
        this.hasItem = hasItem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.row;
        hash = 13 * hash + this.column;
        hash = 13 * hash + (this.hasItem ? 1 : 0);
        return hash;
    }

    

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", hasItem=" + hasItem + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.hasItem != other.hasItem) {
            return false;
        }
        return true;
    }

    public void setScene(Scene scene) {
        System.out.println("this is unsupported currently");
    }
    
    
    
}
