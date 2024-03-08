package com.teamj.book.repository;

import com.teamj.book.domain.ShowsDTO;
import com.teamj.book.domain.ShowsDtDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class SeatsRepository {

    private final SqlSessionTemplate sql;

    public List<ShowsDTO> selectSeatsUseY( String showsId, String showsDate) {
        HashMap<String,String> param = new HashMap<>();
        param.put("showsId",showsId);
        param.put("showsDate",showsDate);
        return sql.selectList("Seats.selectSeatsUseY",param);
    }

    public List<ShowsDtDTO> selectDateUseYN( String showsId) {
        return sql.selectList("Seats.selectDateUseYN",showsId);
    }

}
