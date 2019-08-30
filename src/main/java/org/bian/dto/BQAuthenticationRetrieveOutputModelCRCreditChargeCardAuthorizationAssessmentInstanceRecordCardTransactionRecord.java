package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord
 */
public class BQAuthenticationRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord   {
  private String cardHolderReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The identity of the account holder submitting the transaction 
   * @return cardHolderReference
  **/

  public String getCardHolderReference() {
    return cardHolderReference;
  }

  public void setCardHolderReference(String cardHolderReference) {
    this.cardHolderReference = cardHolderReference;
  }


}

