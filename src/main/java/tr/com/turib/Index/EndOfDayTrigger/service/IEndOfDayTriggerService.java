package tr.com.turib.Index.EndOfDayTrigger.service;

import org.springframework.http.HttpStatus;

import java.sql.Date;

public interface IEndOfDayTriggerService {
    HttpStatus endOfDayTrigger(Date date) throws Exception;
}
