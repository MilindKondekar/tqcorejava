package com.ex1;

import java.util.Arrays;

public class Doctor 
{

	private int docId;
	private String docName;
	private Patient patient[];
	
	
	Doctor()
	{
		
	}
	
	Doctor(int docId,String docName, Patient patient[])
	{
		this.docId = docId;
		this.docName = docName;
		this.patient = patient;
	}

	public int getDocId() 
	{
		return docId;
	}

	public void setDocId(int docId)
	{
		this.docId = docId;
	}
	
	public String getDocName()
	{
		return docName;
	}
	
	public void setDocName(String docName)
	{
		this.docName=docName;
	}
	
	public Patient[] getPatient()
	{
		return patient;
	}
	
	public void setPatient(Patient patient[])
	{
		this.patient=patient;
	}

	@Override
	public String toString()
	{
		return "Doctor docId=" + docId + ", docName=" + docName + ", patient=" + Arrays.toString(patient) ;
	}
	
	
	
	
}
