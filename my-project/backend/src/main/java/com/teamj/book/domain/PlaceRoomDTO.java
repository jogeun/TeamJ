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
public class PlaceRoomDTO {

    Character placeRoomId;
    Integer placeId;
    Integer placeRoomFloor;
    Timestamp regDt;
    Timestamp chgDt;

    PlaceDTO place;
}
