package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditCheckRetrieveInputModelCreditCheckInstanceReport
 */
public class BQCreditCheckRetrieveInputModelCreditCheckInstanceReport   {
  private String creditCheckInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditCheckInstanceReportReference
  **/

  public String getCreditCheckInstanceReportReference() {
    return creditCheckInstanceReportReference;
  }

  public void setCreditCheckInstanceReportReference(String creditCheckInstanceReportReference) {
    this.creditCheckInstanceReportReference = creditCheckInstanceReportReference;
  }


}

