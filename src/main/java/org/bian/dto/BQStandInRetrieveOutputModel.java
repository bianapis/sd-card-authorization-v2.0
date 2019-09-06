package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStandInRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;
import org.bian.dto.BQStandInRetrieveOutputModelStandInInstanceAnalysis;
import org.bian.dto.BQStandInRetrieveOutputModelStandInInstanceRecord;
import org.bian.dto.BQStandInRetrieveOutputModelStandInInstanceReport;

import javax.validation.Valid;
  
/**
 * BQStandInRetrieveOutputModel
 */
public class BQStandInRetrieveOutputModel   {
  private BQStandInRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private BQStandInRetrieveOutputModelStandInInstanceRecord standInInstanceRecord = null;

  private String standInRetrieveActionTaskReference = null;

  private Object standInRetrieveActionTaskRecord = null;

  private String standInRetrieveActionResponse = null;

  private BQStandInRetrieveOutputModelStandInInstanceReport standInInstanceReport = null;

  private BQStandInRetrieveOutputModelStandInInstanceAnalysis standInInstanceAnalysis = null;


  /**
   * Get cRCreditChargeCardAuthorizationAssessmentInstanceRecord
   * @return cRCreditChargeCardAuthorizationAssessmentInstanceRecord
  **/

  @JsonProperty("cRCreditChargeCardAuthorizationAssessmentInstanceRecord")
  public BQStandInRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(BQStandInRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


  /**
   * Get standInInstanceRecord
   * @return standInInstanceRecord
  **/

  public BQStandInRetrieveOutputModelStandInInstanceRecord getStandInInstanceRecord() {
    return standInInstanceRecord;
  }

  public void setStandInInstanceRecord(BQStandInRetrieveOutputModelStandInInstanceRecord standInInstanceRecord) {
    this.standInInstanceRecord = standInInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Stand In instance retrieve service call 
   * @return standInRetrieveActionTaskReference
  **/

  public String getStandInRetrieveActionTaskReference() {
    return standInRetrieveActionTaskReference;
  }

  public void setStandInRetrieveActionTaskReference(String standInRetrieveActionTaskReference) {
    this.standInRetrieveActionTaskReference = standInRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return standInRetrieveActionTaskRecord
  **/

  public Object getStandInRetrieveActionTaskRecord() {
    return standInRetrieveActionTaskRecord;
  }

  public void setStandInRetrieveActionTaskRecord(Object standInRetrieveActionTaskRecord) {
    this.standInRetrieveActionTaskRecord = standInRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return standInRetrieveActionResponse
  **/

  public String getStandInRetrieveActionResponse() {
    return standInRetrieveActionResponse;
  }

  public void setStandInRetrieveActionResponse(String standInRetrieveActionResponse) {
    this.standInRetrieveActionResponse = standInRetrieveActionResponse;
  }


  /**
   * Get standInInstanceReport
   * @return standInInstanceReport
  **/

  public BQStandInRetrieveOutputModelStandInInstanceReport getStandInInstanceReport() {
    return standInInstanceReport;
  }

  public void setStandInInstanceReport(BQStandInRetrieveOutputModelStandInInstanceReport standInInstanceReport) {
    this.standInInstanceReport = standInInstanceReport;
  }


  /**
   * Get standInInstanceAnalysis
   * @return standInInstanceAnalysis
  **/

  public BQStandInRetrieveOutputModelStandInInstanceAnalysis getStandInInstanceAnalysis() {
    return standInInstanceAnalysis;
  }

  public void setStandInInstanceAnalysis(BQStandInRetrieveOutputModelStandInInstanceAnalysis standInInstanceAnalysis) {
    this.standInInstanceAnalysis = standInInstanceAnalysis;
  }


}

