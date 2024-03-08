package com.teamj.book.repository;

import com.teamj.book.domain.CommonCdDtDTO;
import com.teamj.book.domain.ShowsDTO;
import com.teamj.book.domain.ShowsDtDTO;
import com.teamj.book.domain.UserBookDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ShowsRepository {

    private final SqlSessionTemplate sql;

    /**
     * 공연 타입 기준 -> 공연리스트
     * @param cmId
     * @param cmDtId
     * @return
     */
    public List<ShowsDTO> selectShowList(String cmId, String cmDtId) {
        HashMap<String, String> param = new HashMap<>();
        param.put("cmId", cmId);
        param.put("cmDtId", cmDtId);
        return sql.selectList("Shows.selectShowList", param);
    }

    /**
     * 공연 상세 정보
     * @param showsId
     * @return
     */
    public List<ShowsDTO> selectShowDtList(String showsId) {
        HashMap<String, String> param = new HashMap<>();
        param.put("showsId", showsId);
        return sql.selectList("Shows.selectShowDtList", param);
    }

    public List<ShowsDtDTO> selectShowDtActList(String showsId) {
        return sql.selectList("Shows.selectShowDtActList", showsId);
    }
}
