package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModel   {
  private CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private String creditChargeCardAuthorizationAssessmentRetrieveActionTaskReference = null;

  private Object creditChargeCardAuthorizationAssessmentRetrieveActionTaskRecord = null;

  private String creditChargeCardAuthorizationAssessmentRetrieveActionResponse = null;

  private CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord creditChargeCardAuthorizationAssessmentInstanceReportRecord = null;

  private CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis creditChargeCardAuthorizationAssessmentInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardAuthorizationAssessmentInstanceRecord
   * @return cRCreditChargeCardAuthorizationAssessmentInstanceRecord
  **/

  @JsonProperty("cRCreditChargeCardAuthorizationAssessmentInstanceRecord")
  public CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Charge Card Authorization Assessment instance retrieve service call 
   * @return creditChargeCardAuthorizationAssessmentRetrieveActionTaskReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentRetrieveActionTaskReference() {
    return creditChargeCardAuthorizationAssessmentRetrieveActionTaskReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentRetrieveActionTaskReference(String creditChargeCardAuthorizationAssessmentRetrieveActionTaskReference) {
    this.creditChargeCardAuthorizationAssessmentRetrieveActionTaskReference = creditChargeCardAuthorizationAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditChargeCardAuthorizationAssessmentRetrieveActionTaskRecord
  **/

  public Object getCreditChargeCardAuthorizationAssessmentRetrieveActionTaskRecord() {
    return creditChargeCardAuthorizationAssessmentRetrieveActionTaskRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentRetrieveActionTaskRecord(Object creditChargeCardAuthorizationAssessmentRetrieveActionTaskRecord) {
    this.creditChargeCardAuthorizationAssessmentRetrieveActionTaskRecord = creditChargeCardAuthorizationAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditChargeCardAuthorizationAssessmentRetrieveActionResponse
  **/

  public String getCreditChargeCardAuthorizationAssessmentRetrieveActionResponse() {
    return creditChargeCardAuthorizationAssessmentRetrieveActionResponse;
  }

  public void setCreditChargeCardAuthorizationAssessmentRetrieveActionResponse(String creditChargeCardAuthorizationAssessmentRetrieveActionResponse) {
    this.creditChargeCardAuthorizationAssessmentRetrieveActionResponse = creditChargeCardAuthorizationAssessmentRetrieveActionResponse;
  }


  /**
   * Get creditChargeCardAuthorizationAssessmentInstanceReportRecord
   * @return creditChargeCardAuthorizationAssessmentInstanceReportRecord
  **/

  public CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord getCreditChargeCardAuthorizationAssessmentInstanceReportRecord() {
    return creditChargeCardAuthorizationAssessmentInstanceReportRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReportRecord(CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord creditChargeCardAuthorizationAssessmentInstanceReportRecord) {
    this.creditChargeCardAuthorizationAssessmentInstanceReportRecord = creditChargeCardAuthorizationAssessmentInstanceReportRecord;
  }


  /**
   * Get creditChargeCardAuthorizationAssessmentInstanceAnalysis
   * @return creditChargeCardAuthorizationAssessmentInstanceAnalysis
  **/

  public CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis getCreditChargeCardAuthorizationAssessmentInstanceAnalysis() {
    return creditChargeCardAuthorizationAssessmentInstanceAnalysis;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceAnalysis(CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis creditChargeCardAuthorizationAssessmentInstanceAnalysis) {
    this.creditChargeCardAuthorizationAssessmentInstanceAnalysis = creditChargeCardAuthorizationAssessmentInstanceAnalysis;
  }


}

