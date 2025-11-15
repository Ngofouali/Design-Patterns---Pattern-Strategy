package com.icodi.venteligne;

import java.util.ArrayList;
import java.util.List;

public class VueCatalogue {

    protected List<VueVehicule> contenu = new ArrayList<VueVehicule>();
    protected DessinCatalogue dessin;

    public VueCatalogue(DessinCatalogue dessin) {

        contenu.add(new VueVehicule("Véhicule bon marché"));
        contenu.add(new VueVehicule("Véhicule spacieux"));
        contenu.add(new VueVehicule("Véhicule rapide"));
        contenu.add(new VueVehicule("Véhicule confortable"));
        contenu.add(new VueVehicule("Véhicule sportif"));
        this.dessin = dessin;
    }

    public void dessine(){
        dessin.dessine(contenu);
    }
}
