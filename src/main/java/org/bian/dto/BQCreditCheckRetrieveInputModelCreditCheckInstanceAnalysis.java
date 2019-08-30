package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditCheckRetrieveInputModelCreditCheckInstanceAnalysis
 */
public class BQCreditCheckRetrieveInputModelCreditCheckInstanceAnalysis   {
  private String creditCheckInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return creditCheckInstanceAnalysisReference
  **/

  public String getCreditCheckInstanceAnalysisReference() {
    return creditCheckInstanceAnalysisReference;
  }

  public void setCreditCheckInstanceAnalysisReference(String creditCheckInstanceAnalysisReference) {
    this.creditCheckInstanceAnalysisReference = creditCheckInstanceAnalysisReference;
  }


}

