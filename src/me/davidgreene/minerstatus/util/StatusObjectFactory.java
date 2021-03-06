package me.davidgreene.minerstatus.util;

import me.davidgreene.minerstatus.beans.BitclockersStatus;
import me.davidgreene.minerstatus.beans.MtredStatus;
import me.davidgreene.minerstatus.beans.SwepoolStatus;
import me.davidgreene.minerstatus.beans.BitpoolStatus;
import me.davidgreene.minerstatus.beans.BtcMine;
import me.davidgreene.minerstatus.beans.BtcguildStatus;
import me.davidgreene.minerstatus.beans.DeepbitStatus;
import me.davidgreene.minerstatus.beans.SlushStatus;
import me.davidgreene.minerstatus.beans.Status;

import com.google.gson.Gson;

public class StatusObjectFactory {
	
	public static Status getStatusObject(String result, String identifier){
		if (identifier == null){
			return null;
		}
		Gson gson = new Gson();
		if (identifier.equals("bitcoinpool")){
			return gson.fromJson(result, BitpoolStatus.class);
		} else if (identifier.equals("slush")){
			return gson.fromJson(result, SlushStatus.class);
		} else if (identifier.equals("deepbit")){
			return gson.fromJson(result, DeepbitStatus.class);
		} else if (identifier.equals("btcmine")){
			return gson.fromJson(result, BtcMine.class);
		} else if (identifier.equals("btcguild")){
			return gson.fromJson(result, BtcguildStatus.class);
		} else if (identifier.equals("bitclockers")){
			return gson.fromJson(result, BitclockersStatus.class);
		} else if (identifier.equals("swepool")){
			return gson.fromJson(result, SwepoolStatus.class);
		} else if (identifier.equals("mtred")){
			return gson.fromJson(result, MtredStatus.class);
		}
		return null;
	}
}
