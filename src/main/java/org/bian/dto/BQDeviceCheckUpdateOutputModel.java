package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDeviceCheckUpdateOutputModel
 */
public class BQDeviceCheckUpdateOutputModel   {
  private BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord deviceCheckInstanceRecord = null;

  private String deviceCheckUpdateActionTaskReference = null;

  private Object deviceCheckUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get deviceCheckInstanceRecord
   * @return deviceCheckInstanceRecord
  **/

  public BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord getDeviceCheckInstanceRecord() {
    return deviceCheckInstanceRecord;
  }

  public void setDeviceCheckInstanceRecord(BQDeviceCheckUpdateInputModelDeviceCheckInstanceRecord deviceCheckInstanceRecord) {
    this.deviceCheckInstanceRecord = deviceCheckInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return deviceCheckUpdateActionTaskReference
  **/

  public String getDeviceCheckUpdateActionTaskReference() {
    return deviceCheckUpdateActionTaskReference;
  }

  public void setDeviceCheckUpdateActionTaskReference(String deviceCheckUpdateActionTaskReference) {
    this.deviceCheckUpdateActionTaskReference = deviceCheckUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return deviceCheckUpdateActionTaskRecord
  **/

  public Object getDeviceCheckUpdateActionTaskRecord() {
    return deviceCheckUpdateActionTaskRecord;
  }

  public void setDeviceCheckUpdateActionTaskRecord(Object deviceCheckUpdateActionTaskRecord) {
    this.deviceCheckUpdateActionTaskRecord = deviceCheckUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

