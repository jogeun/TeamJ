package com.teamj.book.controller;

import com.teamj.book.domain.ShowsDTO;
import com.teamj.book.domain.ShowsDtDTO;
import com.teamj.book.domain.StatusEnum;
import com.teamj.book.service.SeatsService;
import com.teamj.book.service.ShowsService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class SeatsController {

    private final SeatsService seatsService;

    @GetMapping("/api/seat/{id}/date/{id2}")
    public ResponseEntity<Result> findSeatsUseY(@PathVariable String id,@PathVariable String id2){
        Result result = new Result();
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        if(!id.isEmpty()){

            List<ShowsDTO> findSeatsList = seatsService.findSeatsUseY(id,id2);
            System.out.println(findSeatsList.size());
            if (!findSeatsList.isEmpty()) {
                result.setStatus(StatusEnum.OK);
                result.setMessage("Success");
                result.setData(findSeatsList);
            }else{
                result.setStatus(StatusEnum.NOT_FOUND);
            }
        }

        return new ResponseEntity<>(result,headers, HttpStatus.BAD_REQUEST);

    }

    @GetMapping("/api/date/{id}")
    public ResponseEntity<Result> findDateUseYN(@PathVariable String id){
        Result result = new Result();
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        if(!id.isEmpty()){

            List<ShowsDtDTO> findSeatsList = seatsService.findDateUseYN(id);
            if (!findSeatsList.isEmpty()) {
                result.setStatus(StatusEnum.OK);
                result.setMessage("Success");
                result.setData(findSeatsList);
            }else{
                result.setStatus(StatusEnum.NOT_FOUND);
            }
        }

        return new ResponseEntity<>(result,headers, HttpStatus.BAD_REQUEST);

    }
    @Getter
    @Setter
    static class Result<T>{
        private StatusEnum status;
        private String message;
        private Object data;
        public Result(){
            this.status = StatusEnum.BAD_REQUEST;
            this.data = null;
            this.message = "Fail";
        }
    }
}
