package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecord
 */
public class BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecord   {
  private String cardTransactionProductInstanceReference = null;

  private String cardHolderAccountPassword = null;

  private String issuedDevicePIN = null;

  private String authenticationSecretQuestionReference = null;

  private String authenticationSecretQuestionTemplate = null;

  private String authenticationSecretQuestionValue = null;

  private String authenticationCheckResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The card account number/identification associated with the card transaction - matched to Issuer's card account instance 
   * @return cardTransactionProductInstanceReference
  **/

  public String getCardTransactionProductInstanceReference() {
    return cardTransactionProductInstanceReference;
  }

  public void setCardTransactionProductInstanceReference(String cardTransactionProductInstanceReference) {
    this.cardTransactionProductInstanceReference = cardTransactionProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The password may be held at the customer or account level 
   * @return cardHolderAccountPassword
  **/

  public String getCardHolderAccountPassword() {
    return cardHolderAccountPassword;
  }

  public void setCardHolderAccountPassword(String cardHolderAccountPassword) {
    this.cardHolderAccountPassword = cardHolderAccountPassword;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  The PIN may be held at device or customer level  
   * @return issuedDevicePIN
  **/

  public String getIssuedDevicePIN() {
    return issuedDevicePIN;
  }

  public void setIssuedDevicePIN(String issuedDevicePIN) {
    this.issuedDevicePIN = issuedDevicePIN;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Use if customer details/questions used to verify identity 
   * @return authenticationSecretQuestionReference
  **/

  public String getAuthenticationSecretQuestionReference() {
    return authenticationSecretQuestionReference;
  }

  public void setAuthenticationSecretQuestionReference(String authenticationSecretQuestionReference) {
    this.authenticationSecretQuestionReference = authenticationSecretQuestionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Question text and expected customer response - given value is compared 
   * @return authenticationSecretQuestionTemplate
  **/

  public String getAuthenticationSecretQuestionTemplate() {
    return authenticationSecretQuestionTemplate;
  }

  public void setAuthenticationSecretQuestionTemplate(String authenticationSecretQuestionTemplate) {
    this.authenticationSecretQuestionTemplate = authenticationSecretQuestionTemplate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Provided value is compared to expected response 
   * @return authenticationSecretQuestionValue
  **/

  public String getAuthenticationSecretQuestionValue() {
    return authenticationSecretQuestionValue;
  }

  public void setAuthenticationSecretQuestionValue(String authenticationSecretQuestionValue) {
    this.authenticationSecretQuestionValue = authenticationSecretQuestionValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the card holder's authentication check 
   * @return authenticationCheckResult
  **/

  public String getAuthenticationCheckResult() {
    return authenticationCheckResult;
  }

  public void setAuthenticationCheckResult(String authenticationCheckResult) {
    this.authenticationCheckResult = authenticationCheckResult;
  }


}

