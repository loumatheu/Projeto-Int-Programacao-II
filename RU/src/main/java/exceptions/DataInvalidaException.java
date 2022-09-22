package exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataInvalidaException extends Exception{

    private LocalDate data;

    public DataInvalidaException(LocalDate data){
        super("A data "+data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" é inválida!");
        this.data=data;
    }




}
