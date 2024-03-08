package com.teamj.book.service;


import com.teamj.book.domain.ShowsDTO;
import com.teamj.book.domain.ShowsDtDTO;
import com.teamj.book.repository.SeatsRepository;
import com.teamj.book.repository.ShowsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatsService {

    private final SeatsRepository seatsRepository;
    public List<ShowsDTO> findSeatsUseY(String showsId,String showsDate) {
        return seatsRepository.selectSeatsUseY(showsId,showsDate);
    }
    public List<ShowsDtDTO> findDateUseYN(String showsId) {
        return seatsRepository.selectDateUseYN(showsId);
    }

}
