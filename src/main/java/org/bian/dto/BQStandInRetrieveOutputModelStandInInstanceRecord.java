package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStandInRetrieveOutputModelStandInInstanceRecord
 */
public class BQStandInRetrieveOutputModelStandInInstanceRecord   {
  private String negativeFileReference = null;

  private String cardAccountStandInAuthorizationResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the file where lost/stolen card details are maintained. This is a file accessed using external service access 
   * @return negativeFileReference
  **/

  public String getNegativeFileReference() {
    return negativeFileReference;
  }

  public void setNegativeFileReference(String negativeFileReference) {
    this.negativeFileReference = negativeFileReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the stand in authorization check 
   * @return cardAccountStandInAuthorizationResult
  **/

  public String getCardAccountStandInAuthorizationResult() {
    return cardAccountStandInAuthorizationResult;
  }

  public void setCardAccountStandInAuthorizationResult(String cardAccountStandInAuthorizationResult) {
    this.cardAccountStandInAuthorizationResult = cardAccountStandInAuthorizationResult;
  }


}

