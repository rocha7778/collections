package model;

import java.util.Objects;

public class Chair {
    private int height;
    private int width;
    private String brand;
    private String color;
    
    

    @Override
	public String toString() {
		return "Chair [height=" + height + ", width=" + width + ", brand=" + brand + ", color=" + color + "]";
	}

	public Chair(int height, int width, String brand, String color){
        this.height = height;
        this.width =width;
        this.brand = brand;
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

     public void setColor(String color) {
        this.color = color;
    }
    
	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return width;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, color, height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chair other = (Chair) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color) && height == other.height
				&& width == other.width;
	}
	
	
    
}
