package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStandInRetrieveInputModelStandInInstanceReport
 */
public class BQStandInRetrieveInputModelStandInInstanceReport   {
  private String standInInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return standInInstanceReportReference
  **/

  public String getStandInInstanceReportReference() {
    return standInInstanceReportReference;
  }

  public void setStandInInstanceReportReference(String standInInstanceReportReference) {
    this.standInInstanceReportReference = standInInstanceReportReference;
  }


}

