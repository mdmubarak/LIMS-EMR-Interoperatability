/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.limsemrops.utility;

/**
 * @author MORRISON.I
 */
public class ConstantUtils {
	
	//tables Names
	public final static String ENCOUNTER_TABLE = "encounter";
	
	//forms
	public final static int Laboratory_Encounter_Type_Id = 11;
	
	/* Identifier IDs */
	public static final int PEPFAR_IDENTIFIER_INDEX = 4;
	
	public static final int HOSPITAL_IDENTIFIER_INDEX = 5;
	
	public static final int OTHER_IDENTIFIER_INDEX = 3;
	
	public static final int HTS_IDENTIFIER_INDEX = 8;
	
	public static final int PMTCT_IDENTIFIER_INDEX = 6;
	
	public static final int EXPOSE_INFANT_IDENTIFIER_INDEX = 7;
	
	public static final int PEP_IDENTIFIER_INDEX = 9;
	
	public static final int RECENCY_INDENTIFIER_INDEX = 10;
	
	//URL
	public static final String BASE_URL = "http://192.168.43.245/api";
	
	public static final String POST_SAMPLES = "/samples/create.php";
	
}
