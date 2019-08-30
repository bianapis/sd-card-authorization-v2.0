package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudCheckRetrieveOutputModelFraudCheckInstanceRecord
 */
public class BQFraudCheckRetrieveOutputModelFraudCheckInstanceRecord   {
  private String fraudCheckResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Result of the fraud check 
   * @return fraudCheckResult
  **/

  public String getFraudCheckResult() {
    return fraudCheckResult;
  }

  public void setFraudCheckResult(String fraudCheckResult) {
    this.fraudCheckResult = fraudCheckResult;
  }


}

