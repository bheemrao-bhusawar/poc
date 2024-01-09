package com.app.poc.test.adobe.interview;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {

	@autowired
	private RestTemplate restTemplate;
	
	@value("${salesforce.rest.base.url}")
	private String salesForceHostUrl;
	
	@Autowired
	private AccountRepo repo;
	
	@Override
	public Map<String, Object> readAccountDetails(Long accountId) {
		
		
		String basicToken = Base64.Encoder("apiKey:apiSecret");
		
		AccountVo accountVo = readAccountDetailsFromSalesForce(accountId, basicToken);
		
		
		Map<String,Object> responseMap =  updateAccountDetailsInLocalDB(accountVo);
		
		
		return responseMap;
	}

	@Override
	public AccountVo readAccountDetailsFromSalesForce(Long accountId,String basicToken) {
		
		String url = salesForceHostUrl+"account/"+accountId;
		//String inputPayload = null;
		
		ResponseEntity<AccountVo> responseEntity =   restTemplate.exchange(url,new HttpEntity(inputPayload, basicToken),AccountVo.class,null);
		
		return responseEntity.getBody();
		
	}

	@Override
	public Map<String, Object> updateAccountDetailsInLocalDB(AccountVo accountVo) {
		
		Account account = new Account(accountVo.getAccountId(), accountVo.getAccountName(), accountVo.getAccountType(), accountVo.getIndutry(), accountVo.getAddress());
		
		account = repo.save(account);
		
		Map<String, Object> responseMap = new HashMap<>();
		
		responseMap.put("code", 200);
		
		
		return null;
	}

}
