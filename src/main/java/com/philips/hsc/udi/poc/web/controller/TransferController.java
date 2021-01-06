/****************************************************************************
 * $Id: philipscicodetemplates.xml 276 2016-01-01 00:00:00Z philips.java $
 ****************************************************************************
 *                              HSC
 *                © Koninklijke Philips N.V., 2016.
 *
 * All rights are reserved. Reproduction in whole or in part is
 * prohibited without the written consent of the copyright owner.
 *
 *
 * FILE NAME: TransferController.java
 * 
 * CREATED: Jan 5, 2021 3:15:02 PM
 *
 * ORIGINAL AUTHOR(S): qianyf
 *
 ***************************************************************************/
package com.philips.hsc.udi.poc.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TransferController 
 * 
 * @author $Author: $
 * @version $Revision: $
 * @since $Date: $
 */
@Controller
@RequestMapping("/toPage")
public class TransferController {
	
	@GetMapping("/{page}")
	public String redirectToUDIInMiniapp(@PathVariable String page, HttpServletResponse response) throws IOException {
//		response.sendRedirect("https://cn.bing.com/?mkt=zh-CN");
		return page;
	}
}
