package contactbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactsController {
	@Autowired
	MyContactsDao dao;
	
	@RequestMapping("/addcontact")
	public ModelAndView addContact() {
		ModelAndView mav=new ModelAndView("addcontact.jsp");
		MyContacts mc= new MyContacts();
		mav.addObject("contact",mc);
		return mav;
	}
	@RequestMapping("/savecontact")
	public ModelAndView savecontact(@ModelAttribute MyContacts mc) {
		ModelAndView mav=new ModelAndView("menu.jsp");
		dao.saveContact(mc);
		return mav;
		
	}
	@RequestMapping("/getAllContacts")
	public ModelAndView viewAllContacts() {
		ModelAndView mav=new ModelAndView("viewall.jsp");
		List<MyContacts> c= dao.getAllContacts();
		mav.addObject("contacts",c);
		return mav;
		
		
	}
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("update.jsp");
		MyContacts mc=dao.getContactByID(id);
		mav.addObject("contact", mc);
		return mav;
	}
	@RequestMapping("/updateContact")
	public ModelAndView updateContact(@ModelAttribute MyContacts mc) {
		ModelAndView mav=new ModelAndView("menu.jsp");
		dao.updateContact(mc);
		return mav;
		
	}
	
	@RequestMapping("/updateContacts")
	public ModelAndView updateContacts() {
		ModelAndView mav=new ModelAndView("updatecontacts.jsp");
		List<MyContacts> c= dao.getAllContacts();
		mav.addObject("contacts",c);
		return mav;
	
		
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("menu.jsp");
		MyContacts mc=dao.getContactByID(id);
		dao.deleteContact(id);
		mav.addObject("contact", mc);
		return mav;
	}
	@RequestMapping("/deleteContacts")
	public ModelAndView deleteContacts() {
		ModelAndView mav=new ModelAndView("delete.jsp");
		List<MyContacts> c= dao.getAllContacts();
		mav.addObject("contacts",c);
		return mav;
		
		
	}
	
}


