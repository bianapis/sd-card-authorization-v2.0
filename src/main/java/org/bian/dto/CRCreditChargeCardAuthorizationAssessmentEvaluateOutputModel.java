package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModel   {
  private String creditChargeCardAuthorizationAssessmentInstanceReference = null;

  private String creditChargeCardAuthorizationAssessmentEvaluateActionReference = null;

  private Object creditChargeCardAuthorizationAssessmentEvaluateActionRecord = null;

  private String creditChargeCardAuthorizationAssessmentInstanceStatus = null;

  private CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Charge Card Authorization Assessment instance 
   * @return creditChargeCardAuthorizationAssessmentInstanceReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceReference() {
    return creditChargeCardAuthorizationAssessmentInstanceReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReference(String creditChargeCardAuthorizationAssessmentInstanceReference) {
    this.creditChargeCardAuthorizationAssessmentInstanceReference = creditChargeCardAuthorizationAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return creditChargeCardAuthorizationAssessmentEvaluateActionReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentEvaluateActionReference() {
    return creditChargeCardAuthorizationAssessmentEvaluateActionReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentEvaluateActionReference(String creditChargeCardAuthorizationAssessmentEvaluateActionReference) {
    this.creditChargeCardAuthorizationAssessmentEvaluateActionReference = creditChargeCardAuthorizationAssessmentEvaluateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return creditChargeCardAuthorizationAssessmentEvaluateActionRecord
  **/

  public Object getCreditChargeCardAuthorizationAssessmentEvaluateActionRecord() {
    return creditChargeCardAuthorizationAssessmentEvaluateActionRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentEvaluateActionRecord(Object creditChargeCardAuthorizationAssessmentEvaluateActionRecord) {
    this.creditChargeCardAuthorizationAssessmentEvaluateActionRecord = creditChargeCardAuthorizationAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Credit Charge Card Authorization Assessment instance (e.g. initialised, pending, active) 
   * @return creditChargeCardAuthorizationAssessmentInstanceStatus
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceStatus() {
    return creditChargeCardAuthorizationAssessmentInstanceStatus;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceStatus(String creditChargeCardAuthorizationAssessmentInstanceStatus) {
    this.creditChargeCardAuthorizationAssessmentInstanceStatus = creditChargeCardAuthorizationAssessmentInstanceStatus;
  }


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


}

