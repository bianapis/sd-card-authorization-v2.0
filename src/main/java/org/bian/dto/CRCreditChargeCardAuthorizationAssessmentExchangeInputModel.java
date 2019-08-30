package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentExchangeInputModelCreditChargeCardAuthorizationAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentExchangeInputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentExchangeInputModel   {
  private String cardAuthorizationServicingSessionReference = null;

  private String creditChargeCardAuthorizationAssessmentInstanceReference = null;

  private Object creditChargeCardAuthorizationAssessmentExchangeActionTaskRecord = null;

  private CRCreditChargeCardAuthorizationAssessmentExchangeInputModelCreditChargeCardAuthorizationAssessmentExchangeActionRequest creditChargeCardAuthorizationAssessmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return creditChargeCardAuthorizationAssessmentExchangeActionTaskRecord
  **/

  public Object getCreditChargeCardAuthorizationAssessmentExchangeActionTaskRecord() {
    return creditChargeCardAuthorizationAssessmentExchangeActionTaskRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentExchangeActionTaskRecord(Object creditChargeCardAuthorizationAssessmentExchangeActionTaskRecord) {
    this.creditChargeCardAuthorizationAssessmentExchangeActionTaskRecord = creditChargeCardAuthorizationAssessmentExchangeActionTaskRecord;
  }


  /**
   * Get creditChargeCardAuthorizationAssessmentExchangeActionRequest
   * @return creditChargeCardAuthorizationAssessmentExchangeActionRequest
  **/

  public CRCreditChargeCardAuthorizationAssessmentExchangeInputModelCreditChargeCardAuthorizationAssessmentExchangeActionRequest getCreditChargeCardAuthorizationAssessmentExchangeActionRequest() {
    return creditChargeCardAuthorizationAssessmentExchangeActionRequest;
  }

  public void setCreditChargeCardAuthorizationAssessmentExchangeActionRequest(CRCreditChargeCardAuthorizationAssessmentExchangeInputModelCreditChargeCardAuthorizationAssessmentExchangeActionRequest creditChargeCardAuthorizationAssessmentExchangeActionRequest) {
    this.creditChargeCardAuthorizationAssessmentExchangeActionRequest = creditChargeCardAuthorizationAssessmentExchangeActionRequest;
  }


}

