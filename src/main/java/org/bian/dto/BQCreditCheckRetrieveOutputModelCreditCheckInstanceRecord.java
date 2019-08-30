package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditCheckRetrieveOutputModelCreditCheckInstanceRecord
 */
public class BQCreditCheckRetrieveOutputModelCreditCheckInstanceRecord   {
  private String cardAccountavailablebalancecheckresult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The returned available balance is used to perform credit check - uses product instance reference to identify account 
   * @return cardAccountavailablebalancecheckresult
  **/

  public String getCardAccountavailablebalancecheckresult() {
    return cardAccountavailablebalancecheckresult;
  }

  public void setCardAccountavailablebalancecheckresult(String cardAccountavailablebalancecheckresult) {
    this.cardAccountavailablebalancecheckresult = cardAccountavailablebalancecheckresult;
  }


}

