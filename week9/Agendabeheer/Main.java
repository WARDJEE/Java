package week9.Agendabeheer;

import java.time.LocalDateTime;

public class Main
{
    public static void main()
    {
        // Maak twee agenda objecten aan, eentje voor Pieter en eentje voor Jan
        Agenda pieterAgenda = new Agenda("Pieter");
        Agenda janAgenda = new Agenda("Jan");

        // Maak vijf afspraak objecten aan
        Afspraak afspraak1 = new Afspraak(AfspraakType.VERGADERING, LocalDateTime.of(2025, 11, 20, 14, 30));
        Afspraak afspraak2 = new Afspraak(AfspraakType.AFSPRAAK, LocalDateTime.of(2025, 11, 21, 9, 00));
        Afspraak afspraak3 = new Afspraak(AfspraakType.TELEFOONGESPREK, LocalDateTime.of(2025, 11, 22, 16, 00));
        Afspraak afspraak4 = new Afspraak(AfspraakType.BORREL, LocalDateTime.of(2025, 11, 23, 17, 30));
        Afspraak afspraak5 = new Afspraak(AfspraakType.LUNCH, LocalDateTime.of(2025, 11, 24, 12, 00));

        // Voeg de afspraken toe aan de agenda's mbv een methode
        voegEnPrintResultaat(pieterAgenda, afspraak1);
        voegEnPrintResultaat(pieterAgenda, afspraak2);
        voegEnPrintResultaat(pieterAgenda, afspraak3);
        voegEnPrintResultaat(janAgenda, afspraak4);
        voegEnPrintResultaat(janAgenda, afspraak5);

        // Print alle afspraken van Pieter
        System.out.printf("%n%s heeft %d afspraken:%n", pieterAgenda.getNaam(), pieterAgenda.getAantal());
        for (int i = 0; i < /* vul aan */pieterAgenda.getAantal(); i++) {
            System.out.println(/* vul aan */pieterAgenda.getAfspraak(i));
        }

        // Print alle afspraken van Jan
        System.out.printf("%n%s heeft %d afspraken:%n", janAgenda.getNaam(), janAgenda.getAantal());
        for (int i = 0; i < /* vul aan */janAgenda.getAantal(); i++) {
            System.out.println(/* vul aan */janAgenda.getAfspraak(i));
        }

        // Print het totaal aantal afspraken
        System.out.printf("%nIn totaal zijn er %d afspraken.", /* vul aan */pieterAgenda.getAantal()+janAgenda.getAantal());
    }

    private static void voegEnPrintResultaat(Agenda agenda, Afspraak afspraak)
    {
        boolean toegevoegd = agenda.voegAfspraakToe(afspraak);
        if (toegevoegd)
        {
            System.out.printf("Afspraak '%s' is toegevoegd aan de agenda van %s.%n", afspraak, agenda.getNaam());
        } else
        {
            System.out.printf("Kon afspraak '%s' niet toevoegen aan de agenda van %s: agenda is vol.%n", afspraak, agenda.getNaam());
        }
    }
}
