package com.teamj.book.service;


import com.teamj.book.domain.CommonCdDtDTO;
import com.teamj.book.domain.ShowsDTO;
import com.teamj.book.domain.ShowsDtDTO;
import com.teamj.book.domain.UserBookDTO;
import com.teamj.book.repository.CommonRepository;
import com.teamj.book.repository.ShowsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowsService {

    private final ShowsRepository showsRepository;

    public List<ShowsDTO> findShowList(String cmDtId) {
        return showsRepository.selectShowList("CG001",cmDtId);
    }

    public List<ShowsDTO> findShowDtList(String showsId) {
        return showsRepository.selectShowDtList(showsId);
    }
    public List<ShowsDtDTO> findShowDtActList(String showsId) {
        return showsRepository.selectShowDtActList(showsId);
    }

}
