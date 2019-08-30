package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentExchangeOutputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentExchangeOutputModel   {
  private String creditChargeCardAuthorizationAssessmentExchangeActionTaskReference = null;

  private Object creditChargeCardAuthorizationAssessmentExchangeActionTaskRecord = null;

  private String creditChargeCardAuthorizationAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Charge Card Authorization Assessment instance exchange service call 
   * @return creditChargeCardAuthorizationAssessmentExchangeActionTaskReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentExchangeActionTaskReference() {
    return creditChargeCardAuthorizationAssessmentExchangeActionTaskReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentExchangeActionTaskReference(String creditChargeCardAuthorizationAssessmentExchangeActionTaskReference) {
    this.creditChargeCardAuthorizationAssessmentExchangeActionTaskReference = creditChargeCardAuthorizationAssessmentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return creditChargeCardAuthorizationAssessmentExchangeActionResponse
  **/

  public String getCreditChargeCardAuthorizationAssessmentExchangeActionResponse() {
    return creditChargeCardAuthorizationAssessmentExchangeActionResponse;
  }

  public void setCreditChargeCardAuthorizationAssessmentExchangeActionResponse(String creditChargeCardAuthorizationAssessmentExchangeActionResponse) {
    this.creditChargeCardAuthorizationAssessmentExchangeActionResponse = creditChargeCardAuthorizationAssessmentExchangeActionResponse;
  }


}

