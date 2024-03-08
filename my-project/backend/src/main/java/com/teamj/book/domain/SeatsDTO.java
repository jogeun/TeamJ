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
public class SeatsDTO {

    Integer seatsId;
    Character placeRoomId;
    Integer placeId;
    Integer seatRow;
    Integer seatCol;
    Character seatFlag;
    Character seatType;
    Timestamp regDt;
    Timestamp chgDt;

    PlaceRoomDTO placeRoom;
    PlaceDTO place;
}
