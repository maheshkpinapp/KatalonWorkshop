
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "commonUtils.Common.navigateToURL"(
    	String url	) {
    (new commonUtils.Common()).navigateToURL(
        	url)
}

def static "commonUtils.Common.login"(
    	String username	
     , 	String password	) {
    (new commonUtils.Common()).login(
        	username
         , 	password)
}

def static "commonUtils.Common.redirectToLogin"() {
    (new commonUtils.Common()).redirectToLogin()
}

def static "commonUtils.Common.logoutFromAppUser"() {
    (new commonUtils.Common()).logoutFromAppUser()
}

def static "commonUtils.Common.logoutFromAppAdmin"() {
    (new commonUtils.Common()).logoutFromAppAdmin()
}

def static "commonUtils.Common.closeBrowser"() {
    (new commonUtils.Common()).closeBrowser()
}

def static "addHotel.AddHotel.createHotel"(
    	String hotel	
     , 	String description	
     , 	String location	) {
    (new addHotel.AddHotel()).createHotel(
        	hotel
         , 	description
         , 	location)
}

def static "invoice.downloadAndVerifyInvoice.downloadInvoice"() {
    (new invoice.downloadAndVerifyInvoice()).downloadInvoice()
}

def static "invoice.downloadAndVerifyInvoice.verifyInvoicedownloaded"() {
    (new invoice.downloadAndVerifyInvoice()).verifyInvoicedownloaded()
}

def static "verifyHotel.hotelStarRating.starRating"() {
    (new verifyHotel.hotelStarRating()).starRating()
}
