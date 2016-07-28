package com.smartway.core.utils;

import org.apache.log4j.Logger;



/* Code to generate the nextid for a given id
 * 
 * 
 */

public class GenerateID {
	private static Logger logger = Logger.getLogger(GenerateID.class);

	public static void main(String[] args) {	
		String customerid="A0AAZ99";	
		logger.debug("current new user id:"+generateNextID(customerid));
	}
	
	
	/*genrateNextID method gives you the next id for the given id
	 * @params: lastcustomerid
	 * @return: nextcustomerid
	 */
	public static String generateNextID(String lastcustomerid){

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
		return nextcustomerid;
	}

}
