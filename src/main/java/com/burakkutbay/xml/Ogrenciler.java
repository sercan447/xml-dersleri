
package com.burakkutbay.xml;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ogrenciler")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"numara","isim","soyad","adres","dersler"})
public class Ogrenciler {
    
    @XmlAttribute
    private int numara;
    
    @XmlElement
    private String isim;
    @XmlElement
    private String soyad;
    
   // @XmlElementWrapper(name="adresler")
    @XmlElement(name="adres")
    private List<Adres> adres;
    @XmlElementWrapper(name="dersler")
    @XmlElement(name="ders")
    private List<Dersler> dersler;

    public Ogrenciler(){}
    
    
    public Ogrenciler(int numara, String isim, String soyad, List<Adres> adres, List<Dersler> dersler) {
        this.numara = numara;
        this.isim = isim;
        this.soyad = soyad;
        this.adres = adres;
        this.dersler = dersler;
    }

    
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public List<Adres> getAdres() {
        return adres;
    }

    public void setAdres(List<Adres> adres) {
        this.adres = adres;
    }

    public List<Dersler> getDersler() {
        return dersler;
    }

    public void setDersler(List<Dersler> dersler) {
        this.dersler = dersler;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Ogrenciler{" + "numara=" + numara + ", isim=" + isim + ", soyad=" + soyad + ", adres=" + adres + ", dersler=" + dersler + '}';
    }

    
    
    
    
}
