/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardAuthorizationApiServiceImpl implements CardAuthorizationApiService {

	public SDCardAuthorizationActivateOutputModel activate(SDCardAuthorizationActivateInputModel request){
		return JsonReader.read("activate-SDCardAuthorizationActivateOutputModel.json",new TypeReference<SDCardAuthorizationActivateOutputModel>(){});
	}
	
	public SDCardAuthorizationConfigureOutputModel configure(String sdReferenceId, SDCardAuthorizationConfigureInputModel request){
		return JsonReader.read("configure-SDCardAuthorizationConfigureOutputModel.json",new TypeReference<SDCardAuthorizationConfigureOutputModel>(){});
	}
	
	public CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRCreditChargeCardAuthorizationAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModel.json",new TypeReference<CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModel>(){});
	}
	
	public CRCreditChargeCardAuthorizationAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRCreditChargeCardAuthorizationAssessmentExchangeOutputModel.json",new TypeReference<CRCreditChargeCardAuthorizationAssessmentExchangeOutputModel>(){});
	}
	
	public CRCreditChargeCardAuthorizationAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentExecuteInputModel request){
		return JsonReader.read("execute-CRCreditChargeCardAuthorizationAssessmentExecuteOutputModel.json",new TypeReference<CRCreditChargeCardAuthorizationAssessmentExecuteOutputModel>(){});
	}
	
	public SDCardAuthorizationFeedbackOutputModel feedback(String sdReferenceId, SDCardAuthorizationFeedbackInputModel request){
		return JsonReader.read("feedback-SDCardAuthorizationFeedbackOutputModel.json",new TypeReference<SDCardAuthorizationFeedbackOutputModel>(){});
	}
	
	public CRCreditChargeCardAuthorizationAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRCreditChargeCardAuthorizationAssessmentGrantOutputModel.json",new TypeReference<CRCreditChargeCardAuthorizationAssessmentGrantOutputModel>(){});
	}
	
	public CRCreditChargeCardAuthorizationAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentRequestInputModel request){
		return JsonReader.read("request-CRCreditChargeCardAuthorizationAssessmentRequestOutputModel.json",new TypeReference<CRCreditChargeCardAuthorizationAssessmentRequestOutputModel>(){});
	}
	
	public CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModel.json",new TypeReference<CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAuthenticationRetrieveOutputModel retrieveAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAuthenticationRetrieveOutputModel.json",new TypeReference<BQAuthenticationRetrieveOutputModel>(){});
	}
	
	public BQCreditCheckRetrieveOutputModel retrieveCreditcheck(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCreditCheckRetrieveOutputModel.json",new TypeReference<BQCreditCheckRetrieveOutputModel>(){});
	}
	
	public BQDeviceCheckRetrieveOutputModel retrieveDevicecheck(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDeviceCheckRetrieveOutputModel.json",new TypeReference<BQDeviceCheckRetrieveOutputModel>(){});
	}
	
	public BQFraudCheckRetrieveOutputModel retrieveFraudcheck(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFraudCheckRetrieveOutputModel.json",new TypeReference<BQFraudCheckRetrieveOutputModel>(){});
	}
	
	public BQStandInRetrieveOutputModel retrieveStandin(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQStandInRetrieveOutputModel.json",new TypeReference<BQStandInRetrieveOutputModel>(){});
	}
	
	public SDCardAuthorizationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCardAuthorizationRetrieveOutputModel.json",new TypeReference<SDCardAuthorizationRetrieveOutputModel>(){});
	}
	
	public CRCreditChargeCardAuthorizationAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRCreditChargeCardAuthorizationAssessmentUpdateOutputModel.json",new TypeReference<CRCreditChargeCardAuthorizationAssessmentUpdateOutputModel>(){});
	}
	
	public BQAuthenticationUpdateOutputModel updateAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuthenticationUpdateInputModel request){
		return JsonReader.read("update-BQAuthenticationUpdateOutputModel.json",new TypeReference<BQAuthenticationUpdateOutputModel>(){});
	}
	
	public BQDeviceCheckUpdateOutputModel updateDevicecheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceCheckUpdateInputModel request){
		return JsonReader.read("update-BQDeviceCheckUpdateOutputModel.json",new TypeReference<BQDeviceCheckUpdateOutputModel>(){});
	}
	
}
