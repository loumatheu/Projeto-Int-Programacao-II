package exceptions;

import models.TipoRefeicao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NaoPossuiTicketDisponivelException extends Exception{

    private TipoRefeicao tipo;

    public NaoPossuiTicketDisponivelException(TipoRefeicao tipo){
        super("Não há tickets de "+tipo.name().toLowerCase()+" disponível. ");
        this.tipo=tipo;
    }




}
