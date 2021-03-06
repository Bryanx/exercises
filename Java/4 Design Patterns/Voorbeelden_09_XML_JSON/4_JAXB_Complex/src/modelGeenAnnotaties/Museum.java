package modelGeenAnnotaties;

import javax.xml.bind.annotation.*;

/**
 * http://examples.javacodegeeks.com/core-java/xml/bind/jaxb-marshal-example/
 */

public class Museum {
    private String name;
    private String city;
    private Boolean childrenAllowed;
    private Exhibition special;
    private Exhibition permanent;

	public Museum() {
	}

	public Museum(
		String name,
		String city,
		Boolean childrenAllowed,
		Exhibition special,
		Exhibition permanent
	) {
		this.name = name;
		this.city = city;
		this.childrenAllowed = childrenAllowed;
		this.special = special;
		this.permanent = permanent;
	}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setChildrenAllowed(Boolean childrenAllowed) {
        this.childrenAllowed = childrenAllowed;
    }

    public Boolean getChildrenAllowed() {
        return childrenAllowed;
    }

    public Exhibition getSpecial() {
        return special;
    }

    public void setSpecial(Exhibition special) {
        this.special = special;
    }

    public Exhibition getPermanent() {
        return permanent;
    }

    public void setPermanent(Exhibition permanent) {
        this.permanent = permanent;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "childrenAllowed=" + childrenAllowed +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", special=" + special +
                ", permanent=" + permanent +
                '}';
    }
}
