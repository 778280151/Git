package com.atguigu.mybatis.bean;

import org.apache.ibatis.type.Alias;

//@Alias(value = "fuck") // 这里的alias对应sql映射文件sql语句的返回值类型，是除了设置包扫描器的另外一种
public class hh {
	private int USEID;
	private String USELOGINNAME;
	private String USEPASSWORD;
	private String USENAME;
	private String USEIDCARD;
	private String USEPHONE;
	private int USESEX;
	private String USEADDRESS;
	private String USEEMAIL;
	private int USESTATE;
	private int USEDELETE;
	private int ROLID;

	public int getUSEID() {
		return USEID;
	}

	public void setUSEID(int uSEID) {
		USEID = uSEID;
	}

	public String getUSELOGINNAME() {
		return USELOGINNAME;
	}

	public void setUSELOGINNAME(String uSELOGINNAME) {
		USELOGINNAME = uSELOGINNAME;
	}

	public String getUSEPASSWORD() {
		return USEPASSWORD;
	}

	public void setUSEPASSWORD(String uSEPASSWORD) {
		USEPASSWORD = uSEPASSWORD;
	}

	public String getUSENAME() {
		return USENAME;
	}

	public void setUSENAME(String uSENAME) {
		USENAME = uSENAME;
	}

	public String getUSEIDCARD() {
		return USEIDCARD;
	}

	public void setUSEIDCARD(String uSEIDCARD) {
		USEIDCARD = uSEIDCARD;
	}

	public String getUSEPHONE() {
		return USEPHONE;
	}

	public void setUSEPHONE(String uSEPHONE) {
		USEPHONE = uSEPHONE;
	}

	public int getUSESEX() {
		return USESEX;
	}

	public void setUSESEX(int uSESEX) {
		USESEX = uSESEX;
	}

	public String getUSEADDRESS() {
		return USEADDRESS;
	}

	public void setUSEADDRESS(String uSEADDRESS) {
		USEADDRESS = uSEADDRESS;
	}

	public String getUSEEMAIL() {
		return USEEMAIL;
	}

	public void setUSEEMAIL(String uSEEMAIL) {
		USEEMAIL = uSEEMAIL;
	}

	public int getUSESTATE() {
		return USESTATE;
	}

	public void setUSESTATE(int uSESTATE) {
		USESTATE = uSESTATE;
	}

	public int getUSEDELETE() {
		return USEDELETE;
	}

	public void setUSEDELETE(int uSEDELETE) {
		USEDELETE = uSEDELETE;
	}

	public int getROLID() {
		return ROLID;
	}

	public void setROLID(int rOLID) {
		ROLID = rOLID;
	}

	public hh(int uSEID, String uSELOGINNAME, String uSEPASSWORD, String uSENAME, String uSEIDCARD, String uSEPHONE,
			int uSESEX, String uSEADDRESS, String uSEEMAIL, int uSESTATE, int uSEDELETE, int rOLID) {
		super();
		USEID = uSEID;
		USELOGINNAME = uSELOGINNAME;
		USEPASSWORD = uSEPASSWORD;
		USENAME = uSENAME;
		USEIDCARD = uSEIDCARD;
		USEPHONE = uSEPHONE;
		USESEX = uSESEX;
		USEADDRESS = uSEADDRESS;
		USEEMAIL = uSEEMAIL;
		USESTATE = uSESTATE;
		USEDELETE = uSEDELETE;
		ROLID = rOLID;
	}

	public hh() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "hh [USEID=" + USEID + ", USELOGINNAME=" + USELOGINNAME + ", USEPASSWORD=" + USEPASSWORD + ", USENAME="
				+ USENAME + ", USEIDCARD=" + USEIDCARD + ", USEPHONE=" + USEPHONE + ", USESEX=" + USESEX
				+ ", USEADDRESS=" + USEADDRESS + ", USEEMAIL=" + USEEMAIL + ", USESTATE=" + USESTATE + ", USEDELETE="
				+ USEDELETE + ", ROLID=" + ROLID + "]";
	}

}
