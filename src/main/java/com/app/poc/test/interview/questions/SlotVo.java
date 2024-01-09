package com.app.poc.test.interview.questions;

import java.io.Serializable;
import java.time.LocalDateTime;


public class SlotVo implements Serializable {
	
	private Integer blockNo;
	private Integer  slotNo;
	private Boolean isEmpty;
	private String vehicleNo;
	private LocalDateTime allocatedDateTime;
	
	public SlotVo(Integer blockNo, Integer slotNo, Boolean isEmpty, String vehicleNo, LocalDateTime allocatedDateTime) {
		super();
		this.blockNo = blockNo;
		this.slotNo = slotNo;
		this.isEmpty = isEmpty;
		this.vehicleNo = vehicleNo;
		this.allocatedDateTime = allocatedDateTime;
	}
	
}