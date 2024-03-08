package com.teamj.book.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonCdDTO {
    //CommonCd 필드
    private String cmId;
    private String cmName;
    private String udv1Nm;
    private String udv2Nm;
    private String udv3Nm;
    private Timestamp regDt;
    private Timestamp chgDt;
    private List<CommonCdDtDTO> commonCdDtDTO;
}
