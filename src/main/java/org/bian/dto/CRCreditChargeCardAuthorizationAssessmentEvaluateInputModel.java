package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentEvaluateInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentEvaluateInputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentEvaluateInputModel   {
  private String cardAuthorizationServicingSessionReference = null;

  private Object creditChargeCardAuthorizationAssessmentEvaluateActionRecord = null;

  private String creditChargeCardAuthorizationAssessmentInstanceStatus = null;

  private CRCreditChargeCardAuthorizationAssessmentEvaluateInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardAuthorizationServicingSessionReference
  **/

  public String getCardAuthorizationServicingSessionReference() {
    return cardAuthorizationServicingSessionReference;
  }

  public void setCardAuthorizationServicingSessionReference(String cardAuthorizationServicingSessionReference) {
    this.cardAuthorizationServicingSessionReference = cardAuthorizationServicingSessionReference;
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

  public CRCreditChargeCardAuthorizationAssessmentEvaluateInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(CRCreditChargeCardAuthorizationAssessmentEvaluateInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


}

