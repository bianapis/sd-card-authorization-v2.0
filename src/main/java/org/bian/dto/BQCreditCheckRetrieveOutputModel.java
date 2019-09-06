package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCreditCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;
import org.bian.dto.BQCreditCheckRetrieveOutputModelCreditCheckInstanceAnalysis;
import org.bian.dto.BQCreditCheckRetrieveOutputModelCreditCheckInstanceRecord;
import org.bian.dto.BQCreditCheckRetrieveOutputModelCreditCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCreditCheckRetrieveOutputModel
 */
public class BQCreditCheckRetrieveOutputModel   {
  private BQCreditCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private BQCreditCheckRetrieveOutputModelCreditCheckInstanceRecord creditCheckInstanceRecord = null;

  private String creditCheckRetrieveActionTaskReference = null;

  private Object creditCheckRetrieveActionTaskRecord = null;

  private String creditCheckRetrieveActionResponse = null;

  private BQCreditCheckRetrieveOutputModelCreditCheckInstanceReport creditCheckInstanceReport = null;

  private BQCreditCheckRetrieveOutputModelCreditCheckInstanceAnalysis creditCheckInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardAuthorizationAssessmentInstanceRecord
   * @return cRCreditChargeCardAuthorizationAssessmentInstanceRecord
  **/

  @JsonProperty("cRCreditChargeCardAuthorizationAssessmentInstanceRecord")
  public BQCreditCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(BQCreditCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


  /**
   * Get creditCheckInstanceRecord
   * @return creditCheckInstanceRecord
  **/

  public BQCreditCheckRetrieveOutputModelCreditCheckInstanceRecord getCreditCheckInstanceRecord() {
    return creditCheckInstanceRecord;
  }

  public void setCreditCheckInstanceRecord(BQCreditCheckRetrieveOutputModelCreditCheckInstanceRecord creditCheckInstanceRecord) {
    this.creditCheckInstanceRecord = creditCheckInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Check instance retrieve service call 
   * @return creditCheckRetrieveActionTaskReference
  **/

  public String getCreditCheckRetrieveActionTaskReference() {
    return creditCheckRetrieveActionTaskReference;
  }

  public void setCreditCheckRetrieveActionTaskReference(String creditCheckRetrieveActionTaskReference) {
    this.creditCheckRetrieveActionTaskReference = creditCheckRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditCheckRetrieveActionTaskRecord
  **/

  public Object getCreditCheckRetrieveActionTaskRecord() {
    return creditCheckRetrieveActionTaskRecord;
  }

  public void setCreditCheckRetrieveActionTaskRecord(Object creditCheckRetrieveActionTaskRecord) {
    this.creditCheckRetrieveActionTaskRecord = creditCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditCheckRetrieveActionResponse
  **/

  public String getCreditCheckRetrieveActionResponse() {
    return creditCheckRetrieveActionResponse;
  }

  public void setCreditCheckRetrieveActionResponse(String creditCheckRetrieveActionResponse) {
    this.creditCheckRetrieveActionResponse = creditCheckRetrieveActionResponse;
  }


  /**
   * Get creditCheckInstanceReport
   * @return creditCheckInstanceReport
  **/

  public BQCreditCheckRetrieveOutputModelCreditCheckInstanceReport getCreditCheckInstanceReport() {
    return creditCheckInstanceReport;
  }

  public void setCreditCheckInstanceReport(BQCreditCheckRetrieveOutputModelCreditCheckInstanceReport creditCheckInstanceReport) {
    this.creditCheckInstanceReport = creditCheckInstanceReport;
  }


  /**
   * Get creditCheckInstanceAnalysis
   * @return creditCheckInstanceAnalysis
  **/

  public BQCreditCheckRetrieveOutputModelCreditCheckInstanceAnalysis getCreditCheckInstanceAnalysis() {
    return creditCheckInstanceAnalysis;
  }

  public void setCreditCheckInstanceAnalysis(BQCreditCheckRetrieveOutputModelCreditCheckInstanceAnalysis creditCheckInstanceAnalysis) {
    this.creditCheckInstanceAnalysis = creditCheckInstanceAnalysis;
  }


}

