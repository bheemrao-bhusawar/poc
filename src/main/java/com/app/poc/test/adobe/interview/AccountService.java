package com.app.poc.test.adobe.interview;

import java.util.Map;

public interface AccountService {

	public Map<String,Object> readAccountDetails(Long accountId);
	
	public AccountVo readAccountDetailsFromSalesForce(Long accountId,String basicToken);
	
	public Map<String,Object> updateAccountDetailsInLocalDB(AccountVo accountVo);
	
}
 