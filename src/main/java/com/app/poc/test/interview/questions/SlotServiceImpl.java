package com.app.poc.test.interview.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Service
public class SlotServiceImpl implements SlotService {

	Map<String, List<Map<String, SlotVo>>> vehicleTypeAndSlotOccupancyMap = new HashMap<>();
	
	
	@Override
	public Map<String, Object> slotSearch(String vehicleType) {
		
		return null;
	}
	
	@Override
	public Map<String, Object> slotSearch(String vehicleType, String vehicleNo) {
		
		return null;
	}

	@Override
	public Map<String, Object> updateSlot(SlotVo slotVo) {
		
		return null;
	}

	@Override
	public Map<String, Object> slotRegister(SlotVo slotVo) {
		
       
		
		List<SlotVo> slotList = new ArrayList<>();
		slotList.add(new SlotVo(1, 2, true,null,null));
		slotList.add(new SlotVo(1, 3, true,null,null));
		slotList.add(new SlotVo(1, 4, true,null,null));
		slotList.add(new SlotVo(1, 5, true,null,null));
		slotList.add(new SlotVo(1, 6, true,null,null));
		slotList.add(new SlotVo(1, 2, true,null,null));
		slotList.add(new SlotVo(1, 2, true,null,null));
		
		vehicleTypeAndSlotOccupancyMap.put(null, null);
		
		return null;
	}

	
}
