package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentRetrieveInputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentRetrieveInputModel   {
  private Object creditChargeCardAuthorizationAssessmentRetrieveActionTaskRecord = null;

  private String creditChargeCardAuthorizationAssessmentRetrieveActionRequest = null;

  private CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord creditChargeCardAuthorizationAssessmentInstanceReportRecord = null;

  private CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis creditChargeCardAuthorizationAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditChargeCardAuthorizationAssessmentRetrieveActionRequest
  **/

  public String getCreditChargeCardAuthorizationAssessmentRetrieveActionRequest() {
    return creditChargeCardAuthorizationAssessmentRetrieveActionRequest;
  }

  public void setCreditChargeCardAuthorizationAssessmentRetrieveActionRequest(String creditChargeCardAuthorizationAssessmentRetrieveActionRequest) {
    this.creditChargeCardAuthorizationAssessmentRetrieveActionRequest = creditChargeCardAuthorizationAssessmentRetrieveActionRequest;
  }


  /**
   * Get creditChargeCardAuthorizationAssessmentInstanceReportRecord
   * @return creditChargeCardAuthorizationAssessmentInstanceReportRecord
  **/

  public CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord getCreditChargeCardAuthorizationAssessmentInstanceReportRecord() {
    return creditChargeCardAuthorizationAssessmentInstanceReportRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReportRecord(CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord creditChargeCardAuthorizationAssessmentInstanceReportRecord) {
    this.creditChargeCardAuthorizationAssessmentInstanceReportRecord = creditChargeCardAuthorizationAssessmentInstanceReportRecord;
  }


  /**
   * Get creditChargeCardAuthorizationAssessmentInstanceAnalysis
   * @return creditChargeCardAuthorizationAssessmentInstanceAnalysis
  **/

  public CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis getCreditChargeCardAuthorizationAssessmentInstanceAnalysis() {
    return creditChargeCardAuthorizationAssessmentInstanceAnalysis;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceAnalysis(CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis creditChargeCardAuthorizationAssessmentInstanceAnalysis) {
    this.creditChargeCardAuthorizationAssessmentInstanceAnalysis = creditChargeCardAuthorizationAssessmentInstanceAnalysis;
  }


}

