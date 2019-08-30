package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudCheckRetrieveInputModelFraudCheckInstanceAnalysis
 */
public class BQFraudCheckRetrieveInputModelFraudCheckInstanceAnalysis   {
  private String fraudCheckInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fraudCheckInstanceAnalysisReference
  **/

  public String getFraudCheckInstanceAnalysisReference() {
    return fraudCheckInstanceAnalysisReference;
  }

  public void setFraudCheckInstanceAnalysisReference(String fraudCheckInstanceAnalysisReference) {
    this.fraudCheckInstanceAnalysisReference = fraudCheckInstanceAnalysisReference;
  }


}

