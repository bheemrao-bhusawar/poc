package com.app.poc.test.interview.questions;

import java.util.Map;

public interface SlotService {

	public Map<String,Object> slotSearch(String vehicleType);
	public Map<String, Object> slotSearch(String vehicleType, String vehicleNo);
	public Map<String,Object> updateSlot(SlotVo slotVo);
	public Map<String,Object> slotRegister(SlotVo slotVo);
	
	
}
