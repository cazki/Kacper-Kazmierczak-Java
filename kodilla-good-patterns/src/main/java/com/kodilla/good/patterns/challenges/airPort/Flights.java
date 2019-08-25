package com.kodilla.good.patterns.challenges.airPort;

import java.util.Objects;

public class Flights {
    private String from;
    private String to;
    private String through;

    public Flights(String from, String to, String through) {
        this.from = from;
        this.to = to;
        this.through = through;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getThrough() {
        return through;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", through='" + through + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flights)) return false;
        Flights flights = (Flights) o;
        return Objects.equals(getFrom(), flights.getFrom()) &&
                Objects.equals(getTo(), flights.getTo()) &&
                Objects.equals(getThrough(), flights.getThrough());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrom(), getTo(), getThrough());
    }
}
