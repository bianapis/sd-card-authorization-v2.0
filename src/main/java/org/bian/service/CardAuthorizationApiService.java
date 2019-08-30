/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardAuthorizationApiService {

	SDCardAuthorizationActivateOutputModel activate(SDCardAuthorizationActivateInputModel request);
	
	SDCardAuthorizationConfigureOutputModel configure(String sdReferenceId, SDCardAuthorizationConfigureInputModel request);
	
	CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRCreditChargeCardAuthorizationAssessmentEvaluateInputModel request);
	
	CRCreditChargeCardAuthorizationAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentExchangeInputModel request);
	
	CRCreditChargeCardAuthorizationAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentExecuteInputModel request);
	
	SDCardAuthorizationFeedbackOutputModel feedback(String sdReferenceId, SDCardAuthorizationFeedbackInputModel request);
	
	CRCreditChargeCardAuthorizationAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentGrantInputModel request);
	
	CRCreditChargeCardAuthorizationAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentRequestInputModel request);
	
	CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAuthenticationRetrieveOutputModel retrieveAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCreditCheckRetrieveOutputModel retrieveCreditcheck(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDeviceCheckRetrieveOutputModel retrieveDevicecheck(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFraudCheckRetrieveOutputModel retrieveFraudcheck(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQStandInRetrieveOutputModel retrieveStandin(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCardAuthorizationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCreditChargeCardAuthorizationAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditChargeCardAuthorizationAssessmentUpdateInputModel request);
	
	BQAuthenticationUpdateOutputModel updateAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuthenticationUpdateInputModel request);
	
	BQDeviceCheckUpdateOutputModel updateDevicecheck(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDeviceCheckUpdateInputModel request);
	
}
