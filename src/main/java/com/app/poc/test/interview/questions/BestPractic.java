package com.app.poc.test.interview.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestPractic {

	
	public static void main(String[] args) {
		
		Map<String, List<SlotVo>> vehicleTypeAndSlotOccupancyMap = new HashMap<>();
		
		
		//SlotVo slotVo = new SlotVo(1, 2, true);
		
		//List<SlotVo> slotList = new Arra
		
		vehicleTypeAndSlotOccupancyMap.put(null, null);
		
		
		String str1 = "Hyderabad,Telangana";
		String str2 = "Bengaluru";
		
		if(str1.length() > str2.length()) {
			
			String temp = str1;
		    str1  = str2;
		    str2 = temp;
			
		}
		
		System.out.println("Str1: "+str1);
		System.out.println("str2: "+str2);
		
		
	}

}


/*
Entry:
	/vehicle/search
input:
{
	"vehicleType":"two", //2
	"pageNo":1,
	"pageSize":10,
	"isEmpty":true
}

output:{
	
	"payload":{
		
		"list":[

		        {
		        	"blockNo":1,
		        	"slotNo":20,
		        	"isEmpty":true,
		        	
		        },
		        {
		        	"blockNo":1,
		        	"slotNo":21,
		        	"isEmpty":true
		        },
		        {
		        	"blockNo":1,
		        	"slotNo":23,
		        	"isEmpty":true
		        }

		        ]
		
	}
	
	
vehicle/parking-space/update

input:
{
	"blockNo":1,
	"slotNo":20,
	"isEmpty":true,
	"vehicleNo":KA30940,
	"allocatedDateTime":"4-oct-2023:3.32PM"
	
}

output:
{
	  
    "code":200,
   	"payload":{
   		
   	},
   	"status":"success",
   	"message":"slotNo:20 assigned to vehicle:KA30940 on 4-oct-2023:1.32PM"
   
}
	
	
*/
	