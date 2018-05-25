package com.burakkutbay.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Adres {
    
    private String sehir;
    private String cadde;
    private String mahalle;

    public Adres(){}
    
    
    public Adres(String sehir, String cadde, String mahalle) {
        this.sehir = sehir;
        this.cadde = cadde;
        this.mahalle = mahalle;
    }

    
    
    @XmlElement
    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    @XmlElement
    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }
    
    @XmlElement
    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    @Override
    public String toString() {
        return "Adres{" + "sehir=" + sehir + ", cadde=" + cadde + ", mahalle=" + mahalle + '}';
    }
    
    
    
}
