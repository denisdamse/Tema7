package tema.controler;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tema.orders.dao.OrderDAO;
import tema.orders.pojo.Order;
import tema.phones.dao.PhonesDAO;
import tema.phones.pojo.Phone;

@Controller
public class OrdersAndPhonesControlers {
	@GetMapping("/order")
	public ModelAndView order(@RequestParam int id) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("Order.jsp");
		Order order = OrderDAO.getById(id);
		mav.addObject("order",order);
		return mav;
	}
	@GetMapping("/orders")
	public ModelAndView allOrders(ModelAndView model) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("Orders.jsp");
		ArrayList<Order> orders = OrderDAO.getAll();
		mav.addObject("orders",orders);
		return mav;
	}
	@GetMapping("/phone")
	public ModelAndView phone(@RequestParam int id) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("Phone.jsp");
		Phone phone = PhonesDAO.getById(id);
		mav.addObject("phone",phone);
		return mav;
	}
	@GetMapping("/phones")
	public ModelAndView phones(ModelAndView model) throws ClassNotFoundException, SQLException {
		ModelAndView mav = new ModelAndView("Phones.jsp");
		ArrayList<Phone> phones = PhonesDAO.getAll();
		mav.addObject("phones",phones);
		return mav;
	}
}
