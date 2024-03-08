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
public class UserBookDTO {

    String bookId;

    Integer placeId;
    Integer seatsId;
    Integer showsDtId;
    String userTel;
    String userEmail;
    String userBirth;
    Character bookFlag;
    Timestamp regDt;
    Timestamp chgDt;

    PlaceDTO place;

    ShowsDtDTO ShowsDt;
}
