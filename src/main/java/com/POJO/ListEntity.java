package com.POJO;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 611195959 on 20/06/2018.
 */
/*
The purpose of this class is to just return list of objects as xml
if we are returning a list of objects directly and expecting a xml we will error like 406-not acceptable
 */
@XmlRootElement
public class ListEntity {

    List<OilReserves> lstofoilreserves=new ArrayList<OilReserves>();
    public ListEntity(){

    }

    public ListEntity( List<OilReserves> lstofoilreserves){
       this.lstofoilreserves=lstofoilreserves;
    }

    public List<OilReserves> getLstofoilreserves() {
        return lstofoilreserves;
    }

    public void setLstofoilreserves(List<OilReserves> lstofoilreserves) {
        this.lstofoilreserves = lstofoilreserves;
    }
}
