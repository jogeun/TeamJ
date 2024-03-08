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
public class ShowsDtDTO {

    Integer showsDtId;
    String showsDate;
    String showsTime;
    String leadActor;
    String subActor;
    Timestamp regDt;
    Timestamp chgDt;

    Character useYN;
    Integer useYSeats;
}
