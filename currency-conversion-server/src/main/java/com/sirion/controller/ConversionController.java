package com.sirion.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.sirion.entity.ConversionBean;
import com.sirion.proxy.ExchangeProxy;

@RestController
@RequestMapping("conversion")
public class ConversionController {
	@Autowired
	private ExchangeProxy proxy;

//	@GetMapping("/from/{from}/to/{to}/qty/{qty}")
//	public ConversionBean getAmount(@PathVariable String from,@PathVariable String to,@PathVariable int qty) {
//		Map<String, String> params = new HashMap<String,String>();
//		params.put("from", from);
//		params.put("to", to);
//		RestTemplate template = new RestTemplate();
//		ConversionBean obj;
//		try {
//			ResponseEntity<ConversionBean> res = template.getForEntity("http://localhost:8081/exchange/from/{from}/to/{to}", ConversionBean.class, params);
//			obj = res.getBody();
//			obj.setQty(qty);
//			obj.setTotalAmount(qty*obj.getRate());
//		}catch(RestClientException e) {
//			throw new RuntimeException("Server not available ....");
//		}
//		return obj;
//	}
	@GetMapping("/from/{from}/to/{to}/qty/{qty}")
	public ConversionBean getAmount(@PathVariable String from, @PathVariable String to, @PathVariable int qty) {
		ConversionBean cb = proxy.getExchangeValue(from, to);
		cb.setQty(qty);
		cb.setTotalAmount(qty * cb.getRate());
		return cb;
	}

}
