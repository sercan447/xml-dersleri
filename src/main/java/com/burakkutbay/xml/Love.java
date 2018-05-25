
package com.burakkutbay.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Love {
    
    public static void main(String[] args){
    
      
        try{
 /*  File file =
       new File("C:\\Users\\Sercan\\Documents\\NetBeansProjects\\XML-3\\src\\main\\java\\com\\burakkutbay\\xml\\ortogon.xml");
            JAXBContext o = JAXBContext.newInstance(Ogrenciler.class);
            Unmarshaller unmar = o.createUnmarshaller();
            
           // unmar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
          Ogrenciler og = (Ogrenciler) unmar.unmarshal(file);
           
          System.out.println(og);
          */
          
          // BUNLA XML DOSYA OLUSTURDUM BI GUZEL
          //YUKARIDAKI KODLAR ISE KENDI YAZDIGIM XML DOSSYASINI OKUMAKTI FAKAT BECEREMEDIM 
          
           List<Adres> adres = new ArrayList<Adres>();
                        adres.add(new Adres("mugla","merkez","yatagan"));
                        adres.add(new Adres("aydın","nazilli","kucukmahalle"));
           List<Dersler> ders = new ArrayList<Dersler>();
                         ders.add(new Dersler("654","Turkce"));
                         ders.add(new Dersler("64","Biyoloji"));
                         ders.add(new Dersler("546","Matematik"));
           Ogrenciler ogrenciler = new Ogrenciler(45,"hakan","altun",adres,ders);
           
           JAXBContext con = JAXBContext.newInstance(Ogrenciler.class);
           Marshaller mars = con.createMarshaller();
           
           mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
           mars.marshal(ogrenciler, System.out);
          
        }catch(JAXBException w){
        
        }
        
            
        
    }
    
    
    
}
