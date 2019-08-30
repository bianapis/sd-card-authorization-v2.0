package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentRequestOutputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentRequestOutputModel   {
  private CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private String creditChargeCardAuthorizationAssessmentRequestActionTaskReference = null;

  private Object creditChargeCardAuthorizationAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get cRCreditChargeCardAuthorizationAssessmentInstanceRecord
   * @return cRCreditChargeCardAuthorizationAssessmentInstanceRecord
  **/

  public CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Charge Card Authorization Assessment instance request service call 
   * @return creditChargeCardAuthorizationAssessmentRequestActionTaskReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentRequestActionTaskReference() {
    return creditChargeCardAuthorizationAssessmentRequestActionTaskReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentRequestActionTaskReference(String creditChargeCardAuthorizationAssessmentRequestActionTaskReference) {
    this.creditChargeCardAuthorizationAssessmentRequestActionTaskReference = creditChargeCardAuthorizationAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return creditChargeCardAuthorizationAssessmentRequestActionTaskRecord
  **/

  public Object getCreditChargeCardAuthorizationAssessmentRequestActionTaskRecord() {
    return creditChargeCardAuthorizationAssessmentRequestActionTaskRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentRequestActionTaskRecord(Object creditChargeCardAuthorizationAssessmentRequestActionTaskRecord) {
    this.creditChargeCardAuthorizationAssessmentRequestActionTaskRecord = creditChargeCardAuthorizationAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

