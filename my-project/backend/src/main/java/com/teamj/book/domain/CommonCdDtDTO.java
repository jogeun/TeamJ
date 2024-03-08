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
public class CommonCdDtDTO {

    private String cmDtId;
    private String cmDtName;
    private String cmId;
    private String udv1Val;
    private String udv2Val;
    private String udv3Val;
    private Timestamp regDt;
    private Timestamp chgDt;




}
