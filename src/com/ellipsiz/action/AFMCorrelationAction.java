package com.ellipsiz.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



public class AFMCorrelationAction extends Action {
	private static Logger logger = Logger.getLogger(AFMCorrelationAction.class);

	public ActionForward execute( ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		
//		form01 form_01 = (form01) form;
		/**
		 * 
		 * First page link path : 
		 * 			http://localhost:7000/correlation/AFMCorrelation.do
		 * 
		 * Local workspace deploy path : 
		 * 			C:\Documents and Settings\Ida\My Documents\Dropbox\project\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\correlation\WEB-INF
		 * */
		logger.info("haha");
		System.out.println("system~ haha");
				return mapping.findForward("success");
		
		
	}

}
