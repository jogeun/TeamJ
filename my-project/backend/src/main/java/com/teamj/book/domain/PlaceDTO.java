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
public class PlaceDTO {

    Integer placeId;
    String placeName;
    String adress;
    Timestamp regDt;
    Timestamp chdDt;

    PlaceRoomDTO placeRoom;
}
