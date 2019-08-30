package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFraudCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;
import org.bian.dto.BQFraudCheckRetrieveOutputModelFraudCheckInstanceAnalysis;
import org.bian.dto.BQFraudCheckRetrieveOutputModelFraudCheckInstanceRecord;
import org.bian.dto.BQFraudCheckRetrieveOutputModelFraudCheckInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFraudCheckRetrieveOutputModel
 */
public class BQFraudCheckRetrieveOutputModel   {
  private BQFraudCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private BQFraudCheckRetrieveOutputModelFraudCheckInstanceRecord fraudCheckInstanceRecord = null;

  private String fraudCheckRetrieveActionTaskReference = null;

  private Object fraudCheckRetrieveActionTaskRecord = null;

  private String fraudCheckRetrieveActionResponse = null;

  private BQFraudCheckRetrieveOutputModelFraudCheckInstanceReport fraudCheckInstanceReport = null;

  private BQFraudCheckRetrieveOutputModelFraudCheckInstanceAnalysis fraudCheckInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardAuthorizationAssessmentInstanceRecord
   * @return cRCreditChargeCardAuthorizationAssessmentInstanceRecord
  **/

  public BQFraudCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(BQFraudCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


  /**
   * Get fraudCheckInstanceRecord
   * @return fraudCheckInstanceRecord
  **/

  public BQFraudCheckRetrieveOutputModelFraudCheckInstanceRecord getFraudCheckInstanceRecord() {
    return fraudCheckInstanceRecord;
  }

  public void setFraudCheckInstanceRecord(BQFraudCheckRetrieveOutputModelFraudCheckInstanceRecord fraudCheckInstanceRecord) {
    this.fraudCheckInstanceRecord = fraudCheckInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Check instance retrieve service call 
   * @return fraudCheckRetrieveActionTaskReference
  **/

  public String getFraudCheckRetrieveActionTaskReference() {
    return fraudCheckRetrieveActionTaskReference;
  }

  public void setFraudCheckRetrieveActionTaskReference(String fraudCheckRetrieveActionTaskReference) {
    this.fraudCheckRetrieveActionTaskReference = fraudCheckRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fraudCheckRetrieveActionTaskRecord
  **/

  public Object getFraudCheckRetrieveActionTaskRecord() {
    return fraudCheckRetrieveActionTaskRecord;
  }

  public void setFraudCheckRetrieveActionTaskRecord(Object fraudCheckRetrieveActionTaskRecord) {
    this.fraudCheckRetrieveActionTaskRecord = fraudCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fraudCheckRetrieveActionResponse
  **/

  public String getFraudCheckRetrieveActionResponse() {
    return fraudCheckRetrieveActionResponse;
  }

  public void setFraudCheckRetrieveActionResponse(String fraudCheckRetrieveActionResponse) {
    this.fraudCheckRetrieveActionResponse = fraudCheckRetrieveActionResponse;
  }


  /**
   * Get fraudCheckInstanceReport
   * @return fraudCheckInstanceReport
  **/

  public BQFraudCheckRetrieveOutputModelFraudCheckInstanceReport getFraudCheckInstanceReport() {
    return fraudCheckInstanceReport;
  }

  public void setFraudCheckInstanceReport(BQFraudCheckRetrieveOutputModelFraudCheckInstanceReport fraudCheckInstanceReport) {
    this.fraudCheckInstanceReport = fraudCheckInstanceReport;
  }


  /**
   * Get fraudCheckInstanceAnalysis
   * @return fraudCheckInstanceAnalysis
  **/

  public BQFraudCheckRetrieveOutputModelFraudCheckInstanceAnalysis getFraudCheckInstanceAnalysis() {
    return fraudCheckInstanceAnalysis;
  }

  public void setFraudCheckInstanceAnalysis(BQFraudCheckRetrieveOutputModelFraudCheckInstanceAnalysis fraudCheckInstanceAnalysis) {
    this.fraudCheckInstanceAnalysis = fraudCheckInstanceAnalysis;
  }


}

