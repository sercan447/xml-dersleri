
package com.burakkutbay.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
//@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder = {"kod","ad"})
public class Dersler {
    
    private String kod;
    private String ad;
    
    public Dersler(){}

    public Dersler(String kod, String ad) {
        this.kod = kod;
        this.ad = ad;
    }
    
    

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Dersler{" + "kod=" + kod + ", ad=" + ad + '}';
    }
    
    
    
}
