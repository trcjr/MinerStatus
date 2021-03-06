package me.davidgreene.minerstatus.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

public class DeepbitStatus implements Status, Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6449549746661969052L;
	private BigDecimal confirmed_reward;
	private BigDecimal hashrate;
	private Boolean ipa = Boolean.FALSE;
	private Map<String,WorkerStatus> workers;
	private String apiKey;
	
	public BigDecimal getConfirmed_reward() {
		return (confirmed_reward == null) ? BigDecimal.ZERO : confirmed_reward;
	}

	public void setConfirmed_reward(BigDecimal confirmed_reward) {
		this.confirmed_reward = confirmed_reward;
	}

	public BigDecimal getHashrate() {
		return (hashrate == null) ? BigDecimal.ZERO : hashrate;
	}

	public void setHashrate(BigDecimal hashrate) {
		this.hashrate = hashrate;
	}

	public Boolean getIpa() {
		return ipa;
	}

	public void setIpa(Boolean ipa) {
		this.ipa = ipa;
	}	
	
	@Override
	public String getUsername() {
		return "Worker(s)";
	}

	@Override
	public String getDisplayCol1() {
		return (hashrate == null) ? "0" : hashrate.toString();
	}

	public String getDisplayCol2() {
		return (confirmed_reward == null) ? "0" : confirmed_reward.toString();
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	public String getUsernameLabel() {
		return "";
	}

	@Override
	public String getDisplayCol1Label() {
		return "Hashrate";
	}

	@Override
	public String getDisplayCol2Label() {
		return "Confirmed Reward";
	}

	public void setWorkers(Map<String,WorkerStatus> workers) {
		this.workers = workers;
	}

	public Map<String,WorkerStatus> getWorkers() {
		return workers;
	}

}
