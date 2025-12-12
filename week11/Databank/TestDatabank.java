package week11.Databank;

import java.util.*;

public class TestDatabank {
    static void main() {
        Patiënten patiënten = new Patiënten();
        Huisartsen huisartsen = new Huisartsen();

        Huisarts huisarts = new Huisarts("Paulien Vermeiren");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Haron Verheyen");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Nikolai Van Wouwe");
        huisartsen.insert(huisarts);
        huisarts = new Huisarts("Matthieu Saleh");
        huisartsen.insert(huisarts);

        Patiënt patiënt  = new Patiënt("Flor Wan");
        patiënt.setHuisartsId(0);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Bart Matondo");
        patiënt.setHuisartsId(3);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Elias Magnus");
        patiënt.setHuisartsId(2);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Kevin Koch");
        patiënt.setHuisartsId(1);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Lien Krasnovitski");
        patiënt.setHuisartsId(0);
        patiënten.insert(patiënt);
        patiënt  = new Patiënt("Kay Adib");
        patiënt.setHuisartsId(6);
        patiënten.insert(patiënt);

        // schrijf code om alle patiënten te verwijderen waarvan de foreign key verkeerd staat. Rapporteer de gevonden patiënten.
        for (Patiënt p : patiënten.getAll().values()){
            if (huisartsen.findById(p.getHuisartsId()) == null){
                System.out.println("Patiënt " + p.getNaam() + " heeft geen geldige huisarts. Verwijderen.");
                patiënten.delete(p.getId());
            }
        }

        // schrijf code die alle patiënten laat zien met de naam van hun huisdokter
        // zorg voor een header en teken de tabel zoals te zien is in het voorbeeld hieronder.
        // De patiënten moeten getoond worden in de volgorde van de id’s.
        System.out.println("Alles patiënten: ");
        System.out.println("ID       | NAAM                 | HUISARTS");
        System.out.println("------------------------------------------------------");
        for (Patiënt p : patiënten.getAll().values()) {
            System.out.printf("%8d | %-20s | %s %n", p.getId(), p.getNaam(), huisartsen.findById(p.getHuisartsId()).getNaam());
        }



        // schrijf code die een collection maakt van alle patiënten die bij huisarts Paulien Vermeiren zitten
        // je schrijft dus eigenlijk code die deze query implementeert:
        // SELECT patiënten.id, patiënten.naam, huisartsen.naam
        // FROM patiënten, huisartsen
        // WHERE huisartsId == huisartsen.id AND huisartsId = 0;
        System.out.println();
        System.out.println("Alle patiënten bij P. Vermeiren:");
        System.out.println("ID       | NAAM                 | HUISARTS");
        System.out.println("------------------------------------------------------");
        for (Patiënt p : patiënten.findByHuisarts(0)) {
            System.out.printf("%8d | %-20s | %s %n", p.getId(), p.getNaam(), huisartsen.findById(0).getNaam());

        }
    }
}
