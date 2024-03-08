package com.teamj.book.repository;

import com.teamj.book.domain.CommonCdDtDTO;
import com.teamj.book.domain.ShowsDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommonRepository {

    private final SqlSessionTemplate sql;

    /**
     * 공통코드 조회시 디테일 반납
     * @param cmId 공통코드
     * @return 공통디테일
     */
    public List<CommonCdDtDTO> selectCmDT(String cmId) {
        return sql.selectList("Common.selectCmDT",cmId);
    }
}
