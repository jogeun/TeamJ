package com.teamj.book.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.sql.Timestamp;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShowsDTO {

    Integer showsId;
    String showsName;
    Integer placeId;
    Integer showsDtId;
    String showsExplain;
    String showsNotice;
    String openDate;
    String openTime;
    String startDate;
    String endDate;
    String price;
    String limitAge;
    Integer max_shows_cnt;
    String showsTimes;
    Timestamp regDt;
    Timestamp chgDt;

    PlaceDTO place;
    ShowsDtDTO showsDt;
}
