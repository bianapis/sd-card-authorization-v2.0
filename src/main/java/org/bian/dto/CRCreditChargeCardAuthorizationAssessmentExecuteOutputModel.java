package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentExecuteOutputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentExecuteOutputModel   {
  private CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private String creditChargeCardAuthorizationAssessmentExecuteActionTaskReference = null;

  private Object creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Charge Card Authorization Assessment instance execute service call 
   * @return creditChargeCardAuthorizationAssessmentExecuteActionTaskReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentExecuteActionTaskReference() {
    return creditChargeCardAuthorizationAssessmentExecuteActionTaskReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentExecuteActionTaskReference(String creditChargeCardAuthorizationAssessmentExecuteActionTaskReference) {
    this.creditChargeCardAuthorizationAssessmentExecuteActionTaskReference = creditChargeCardAuthorizationAssessmentExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord
  **/

  public Object getCreditChargeCardAuthorizationAssessmentExecuteActionTaskRecord() {
    return creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentExecuteActionTaskRecord(Object creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord) {
    this.creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord = creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

