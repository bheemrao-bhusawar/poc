package com.app.poc.test.adobe.interview;

import java.util.Map;

@RestController
@RequestMapping(value="/sales-force/account")
public class AccountDetailsController {
	@Autowired
	private AccountService accountService;

	@RequestMapping(value="/read/{id}",methodType=HttpMethod.POST)
	public @ResponseBody Map<String,Object> syncAccountInfo(@pathParam("id") Long id){
		
		Map<String, Object>responseMap =  accountService.readAccountDetails(id);
		
		return responseMap;
	}
	
}
