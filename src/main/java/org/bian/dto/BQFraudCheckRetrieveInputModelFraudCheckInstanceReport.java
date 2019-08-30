package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudCheckRetrieveInputModelFraudCheckInstanceReport
 */
public class BQFraudCheckRetrieveInputModelFraudCheckInstanceReport   {
  private String fraudCheckInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fraudCheckInstanceReportReference
  **/

  public String getFraudCheckInstanceReportReference() {
    return fraudCheckInstanceReportReference;
  }

  public void setFraudCheckInstanceReportReference(String fraudCheckInstanceReportReference) {
    this.fraudCheckInstanceReportReference = fraudCheckInstanceReportReference;
  }


}

