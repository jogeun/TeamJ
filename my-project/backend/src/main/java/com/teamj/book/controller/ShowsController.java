package com.teamj.book.controller;

import com.teamj.book.domain.*;
import com.teamj.book.service.ShowsService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class ShowsController {

    private final ShowsService showsService;

    @GetMapping("/api/show/{id}")
    public ResponseEntity<Result> findShowsList(@PathVariable String id){
        Result result = new Result();
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        System.out.println(id);
        if(!id.isEmpty()){

            List<ShowsDTO> findShowsList = showsService.findShowList(id);
            if (!findShowsList.isEmpty()) {
                result.setStatus(StatusEnum.OK);
                result.setMessage("Success");
                result.setData(findShowsList);
            }else{
                result.setStatus(StatusEnum.NOT_FOUND);
            }
        }

        return new ResponseEntity<>(result,headers, HttpStatus.BAD_REQUEST);

    }

    @GetMapping("/api/show/detail/{id}")
    public ResponseEntity<Result> findShowsDtList(@PathVariable String id){
        Result result = new Result();
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        if(!id.isEmpty()){

            List<ShowsDTO> findShowsList = showsService.findShowDtList(id);
            if (!findShowsList.isEmpty()) {
                result.setStatus(StatusEnum.OK);
                result.setMessage("Success");
                result.setData(findShowsList);
            }else{
                result.setStatus(StatusEnum.NOT_FOUND);
            }
        }

        return new ResponseEntity<>(result,headers, HttpStatus.BAD_REQUEST);

    }
    @GetMapping("/api/show/detail/act/{id}")
    public ResponseEntity<Result> findShowDtActList(@PathVariable String id){
        Result result = new Result();
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        if(!id.isEmpty()){

            List<ShowsDtDTO> findShowsList = showsService.findShowDtActList(id);

            if (!findShowsList.isEmpty()) {
                result.setStatus(StatusEnum.OK);
                result.setMessage("Success");
                result.setData(findShowsList);
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
