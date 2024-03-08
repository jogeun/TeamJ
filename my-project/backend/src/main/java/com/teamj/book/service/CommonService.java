package com.teamj.book.service;


import com.teamj.book.domain.CommonCdDtDTO;
import com.teamj.book.repository.CommonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommonService {

    private final CommonRepository commonRepository;

    public List<CommonCdDtDTO> findShowType() {

        return commonRepository.selectCmDT("CG001");
    }
}
