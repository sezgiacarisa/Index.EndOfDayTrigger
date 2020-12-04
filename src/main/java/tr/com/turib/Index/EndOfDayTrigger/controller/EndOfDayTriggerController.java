package tr.com.turib.Index.EndOfDayTrigger.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tr.com.turib.Index.EndOfDayTrigger.service.impl.EndOfDayTriggerService;

import java.util.Date;

@RestController
public class EndOfDayTriggerController {
    EndOfDayTriggerService endOfDayTriggerService;

    @Autowired
    public EndOfDayTriggerController(EndOfDayTriggerService endOfDayTriggerService){
        this.endOfDayTriggerService = endOfDayTriggerService;
    }

    @GetMapping(path = "/endOfDayTrigger/{date}")
    public ResponseEntity<HttpStatus> endOfDayTrigger(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) throws Exception {
        
        java.sql.Date sDate = new java.sql.Date(date.getTime());
        return new ResponseEntity<>(endOfDayTriggerService.endOfDayTrigger(sDate), HttpStatus.OK);
    }
}
