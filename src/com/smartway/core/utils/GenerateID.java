package com.smartway.core.utils;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.smartway.core.model.GenItemid;
import com.smartway.core.model.ListUserDevice;
import com.smartway.core.mysql.service.GenericService;



/* Code to generate the nextid for a given id
 * 
 * 
 */

public class GenerateID {
	private static Logger logger = Logger.getLogger(GenerateID.class);
	
	@Autowired
	 GenericService genItemIdService;
	
	/*public static void main(String[] args) {	
		String customerid="A0AAA00";	
		//logger.debug("current new user id:"+generateNextID(customerid));
		System.out.println(generateNextID());
	}
	
	*/
	/*genrateNextID method gives you the next id for the given id
	 * @params: lastcustomerid
	 * @return: nextcustomerid
	 */
	public  String generateNextID(){
		String lastcustomerid = getlastid();
		char[]  id=lastcustomerid.toCharArray();
		String nextcustomerid = "";
		int len=id.length-1;
		boolean flag=true;
		for(int i=(len);i>=0;i--){
			int g=(int)id[i];
			if(flag){
				if((g>=48 && g<57)||(g>=65 && g<90)){
					g=g+1;
					id[i]=(char)g;
					flag=false;
				}else if(g==57){
					g=48;
					id[i]=(char)g;
				}else if(g==90){
					g=65;
					id[i]=(char)g;
				}
			}
			nextcustomerid=id[i]+nextcustomerid;
		}
		if(flag)
			nextcustomerid="A"+nextcustomerid;
		
		logger.debug("GenerateID::generateNextID:: current new user id:"+nextcustomerid);
		updateNewId(nextcustomerid);
		return nextcustomerid;
	}


	private  void updateNewId(String nextcustomerid) {
		// TODO Auto-generated method stub
		GenItemid getitemid = new GenItemid();
		getitemid.setId(1);
		getitemid.setIotid(nextcustomerid);
		genItemIdService.update(getitemid);
		
	}


	private  String getlastid() {
		// TODO Auto-generated method stub
		Collection<GenItemid> getid = genItemIdService.findBySQLQuery("select * from GEN_ITEMID where ID =1");
		if(getid.size()!=0){
			for (GenItemid getitemid : getid) {
				return getitemid.getIotid();
			}
		}
		return null;
	}

}
