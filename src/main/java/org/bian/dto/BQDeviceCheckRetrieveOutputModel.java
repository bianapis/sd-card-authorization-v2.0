package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;
import org.bian.dto.BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceAnalysis;
import org.bian.dto.BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceReport;
import org.bian.dto.BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceCheckRetrieveOutputModel
 */
public class BQDeviceCheckRetrieveOutputModel   {
  private BQDeviceCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord deviceCheckInstanceRecord = null;

  private String deviceCheckRetrieveActionTaskReference = null;

  private Object deviceCheckRetrieveActionTaskRecord = null;

  private String deviceCheckRetrieveActionResponse = null;

  private BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceReport deviceCheckInstanceReport = null;

  private BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceAnalysis deviceCheckInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardAuthorizationAssessmentInstanceRecord
   * @return cRCreditChargeCardAuthorizationAssessmentInstanceRecord
  **/

  public BQDeviceCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(BQDeviceCheckRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


  /**
   * Get deviceCheckInstanceRecord
   * @return deviceCheckInstanceRecord
  **/

  public BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord getDeviceCheckInstanceRecord() {
    return deviceCheckInstanceRecord;
  }

  public void setDeviceCheckInstanceRecord(BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord deviceCheckInstanceRecord) {
    this.deviceCheckInstanceRecord = deviceCheckInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Device Check instance retrieve service call 
   * @return deviceCheckRetrieveActionTaskReference
  **/

  public String getDeviceCheckRetrieveActionTaskReference() {
    return deviceCheckRetrieveActionTaskReference;
  }

  public void setDeviceCheckRetrieveActionTaskReference(String deviceCheckRetrieveActionTaskReference) {
    this.deviceCheckRetrieveActionTaskReference = deviceCheckRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return deviceCheckRetrieveActionTaskRecord
  **/

  public Object getDeviceCheckRetrieveActionTaskRecord() {
    return deviceCheckRetrieveActionTaskRecord;
  }

  public void setDeviceCheckRetrieveActionTaskRecord(Object deviceCheckRetrieveActionTaskRecord) {
    this.deviceCheckRetrieveActionTaskRecord = deviceCheckRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return deviceCheckRetrieveActionResponse
  **/

  public String getDeviceCheckRetrieveActionResponse() {
    return deviceCheckRetrieveActionResponse;
  }

  public void setDeviceCheckRetrieveActionResponse(String deviceCheckRetrieveActionResponse) {
    this.deviceCheckRetrieveActionResponse = deviceCheckRetrieveActionResponse;
  }


  /**
   * Get deviceCheckInstanceReport
   * @return deviceCheckInstanceReport
  **/

  public BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceReport getDeviceCheckInstanceReport() {
    return deviceCheckInstanceReport;
  }

  public void setDeviceCheckInstanceReport(BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceReport deviceCheckInstanceReport) {
    this.deviceCheckInstanceReport = deviceCheckInstanceReport;
  }


  /**
   * Get deviceCheckInstanceAnalysis
   * @return deviceCheckInstanceAnalysis
  **/

  public BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceAnalysis getDeviceCheckInstanceAnalysis() {
    return deviceCheckInstanceAnalysis;
  }

  public void setDeviceCheckInstanceAnalysis(BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceAnalysis deviceCheckInstanceAnalysis) {
    this.deviceCheckInstanceAnalysis = deviceCheckInstanceAnalysis;
  }


}

