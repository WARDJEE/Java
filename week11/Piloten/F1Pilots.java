package week11.Piloten;

import java.util.*;

public class F1Pilots{
    private Map<String, F1Pilot> pilots;

    public F1Pilots() {
        this.pilots = new HashMap<>();

        F1Pilot[] champions = {
                new F1Pilot("Duits", "Michael Schumacher", 7),
                new F1Pilot("Argentijns", "Juan Manuel Fangio", 5),
                new F1Pilot("Frans", "Alain Prost", 4),
                new F1Pilot("Duits", "Sebastian Vettel", 4),
                new F1Pilot("Australisch", "Jack Brabham", 3),
                new F1Pilot("Brits", "Jackie Stewart", 3),
                new F1Pilot("Oostenrijks", "Niki Lauda", 3),
                new F1Pilot("Braziliaans", "Nelson Piquet", 3),
                new F1Pilot("Braziliaans", "Ayrton Senna", 3)
        };

        int[][] seasons = {
                {1994, 1995, 2000, 2001, 2002, 2003, 2004},
                {1951, 1954, 1955, 1956, 1957},
                {1985, 1986, 1989, 1993},
                {2010, 2011, 2012, 2013},
                {1959, 1960, 1966},
                {1969, 1971, 1973},
                {1975, 1977, 1984},
                {1981, 1983, 1987},
                {1988, 1990, 1991}
        };

        for (int i = 0; i < champions.length; i++) {
            F1Pilot pilot = champions[i];
            for (int year : seasons[i]) {
                pilot.addSeason(year);

            }
            this.pilots.put(pilot.getName(), pilot);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        List<F1Pilot> pilots = new ArrayList<>(this.pilots.values());
        Collections.sort(pilots, new CompareByLastName());
        for (F1Pilot p : pilots) {
            sb.append(p.toString()).append("\n");
        }
            
        return sb.toString();
    }
}
