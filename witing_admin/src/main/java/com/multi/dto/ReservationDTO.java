package com.multi.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ReservationDTO {
	private Integer year;
    private Integer month;
    private Integer roomid;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date sdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date edate;
}

