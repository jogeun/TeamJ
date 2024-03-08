package com.teamj.book.controller;

import com.teamj.book.domain.CommonCdDtDTO;
import com.teamj.book.domain.StatusEnum;
import com.teamj.book.service.CommonService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommonController {

    private final CommonService commonService;//final이 붙은 필드만 - 클래스 주입 받겠다 의미

    @GetMapping("/api/cm/type")
    public ResponseEntity<Result> findShowsType(Model model){
        Result result = new Result();
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        List<CommonCdDtDTO> findShowType = commonService.findShowType();
        if (!findShowType.isEmpty()) {
            result.setStatus(StatusEnum.OK);
            result.setMessage("Success");
            result.setData(findShowType);
        }else{
            result.setStatus(StatusEnum.NOT_FOUND);
        }

        return new ResponseEntity<>(result,headers,HttpStatus.BAD_REQUEST);

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
