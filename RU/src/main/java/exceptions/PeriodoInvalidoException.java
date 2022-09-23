package exceptions;

import eu.hansolo.tilesfx.events.LocationEventListener;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PeriodoInvalidoException extends Exception {
    private LocalDate inicio;
    private LocalDate fim;

    public PeriodoInvalidoException (LocalDate inicio, LocalDate fim){
        super("O período de "+inicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" a "+fim.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" é inválido!");
        this.inicio=inicio;
        this.fim=fim;
    }
}