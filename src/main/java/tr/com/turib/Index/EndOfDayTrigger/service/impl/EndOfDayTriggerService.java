package tr.com.turib.Index.EndOfDayTrigger.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import tr.com.turib.Index.EndOfDayTrigger.service.IEndOfDayTriggerService;
import tr.com.turib.calculateindex.utils.EndOfDay;

import java.sql.Date;

@Service
public class EndOfDayTriggerService implements IEndOfDayTriggerService {
    //@Override
    public HttpStatus endOfDayTrigger(Date date) throws Exception {

        try {
            if (date != null) {
                EndOfDay.calculateEndOfDay(date, true);
            }

        } catch (Exception e) {
            throw new Exception("Something went wrong");
        }
        return HttpStatus.OK;
    }
}
