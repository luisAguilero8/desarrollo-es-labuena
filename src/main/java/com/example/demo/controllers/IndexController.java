package com.example.demo.controllers;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Cliente;
import com.example.demo.models.Computadora;
import com.example.demo.models.Proveedor;
import com.example.demo.models.Ticket;
import com.example.demo.models.Venta;


@Controller
@RequestMapping("/examenUnidad2")
public class IndexController {
	
	@GetMapping("/Index")
	public String index() {
		
		return"index";
	}
	
	
	@GetMapping("/computadora")
	public String computadora(Model modelo) {
		ArrayList<Computadora>computadoras = new ArrayList<Computadora>();
		
		computadoras.add(new Computadora("9ZZ05083Q","Xtreme PC Gaming","AMD Ryzen - 5 2600","Windows 10","16 GB","6 Núcleos"));
		computadoras.add(new Computadora("4A105048W","Lenovo","Intel Core - i5 8400","Windows 10 Pro","8 GB","5 Núcleos"));
		computadoras.add(new Computadora("10B0N04XX","Supertienda Gaming","AMD Ryzen - 5 2400G","Windows 10 Prueba","8 GB","4 Núcleos"));
		computadoras.add(new Computadora("2V996148J","Lenovo 2019","Intel Core - i7 87000 8th Gen","Windows 10","10 GB","4 Núcleos"));
		computadoras.add(new Computadora("6M9X504K6","Computadora armada","AMD Ryzen - 5 3400G","Windows 10","8 GB","6 Núcleos"));
		computadoras.add(new Computadora("3O9X704T4","Notebook Huawei","AMD Ryzen - 5","Windows 10","8 GB","6 Núcleos"));
		computadoras.add(new Computadora("261D7F4V7","Asus","AMD Ryzen - 3","Windows 10","8 GB","6 Núcleos"));
		computadoras.add(new Computadora("689X704N6","ACTEC","Intel Core i3","Windows 10","8 GB","4 Núcleos"));
		computadoras.add(new Computadora("745D7GYJ8","Lenovo","Intel Core i5 - 10210U","Windows 10","8 GB","8 Núcleos"));
		computadoras.add(new Computadora("56G76JUR6","Alienware","Intel Core i7-10700","Windows 10","8 GB","8 Núcleos"));
		modelo.addAttribute("computadoras",computadoras);
		
		modelo.addAttribute("titulo","COMPUTADORAS");
		return"computadora";
	}
	
	@GetMapping("/ticket")
	public String ticket(Model modelo) {
		ArrayList<Ticket>tickets = new ArrayList<Ticket>();
		tickets.add(new Ticket("23768","023","9ZZ05083Q","2","MXN $13,899.00"));
		tickets.add(new Ticket("98451","024","4A105048W","1","MXN $15,999.00"));
		tickets.add(new Ticket("09541","025","10B0N04XX","1","MXN $14,989.00"));
		tickets.add(new Ticket("37595","026","2V996148J","2","MXN $13,990.00"));
		tickets.add(new Ticket("10652","027","6M9X504K6","1","MXN $15,589.00"));
		tickets.add(new Ticket("76533","028","3O9X704T4","2","MXN $14,899.00"));
		tickets.add(new Ticket("12678","029","261D7F4V7","1","MXN $15,999.00"));
		tickets.add(new Ticket("00754","030","689X704N6","1","MXN $16,890.00"));
		tickets.add(new Ticket("40072","031","745D7GYJ8","1","MXN $29,835.00"));
		tickets.add(new Ticket("23005","032","56G76JUR6","1","MXN $72,074.00"));
		modelo.addAttribute("tickets",tickets);
		
		modelo.addAttribute("titulo","TICKETS");
		return"ticket";
	}
	
	@GetMapping("/venta")
	public String venta(Model modelo) {
		ArrayList<Venta>ventas = new ArrayList<Venta>();
		ventas.add(new Venta("023","1001","14-11-2020","MXN $27,798.00","IVA incluido","MXN $0.00","MXN $27,798.00"));
		ventas.add(new Venta("024","1002","14-11-2020","MXN $15,999.00","IVA incluido","MXN $0.00","MXN $15,999.00"));
		ventas.add(new Venta("025","1003","14-11-2020","MXN $14,989.00","IVA incluido","MXN $0.00","MXN $14,989.00"));
		ventas.add(new Venta("026","1004","14-11-2020","MXN $27,980.00","IVA incluido","MXN $0.00","MXN $27,980.00"));
		ventas.add(new Venta("027","1005","15-11-2020","MXN $15,589.00","IVA incluido","MXN $0.00","MXN $15,589.00"));
		ventas.add(new Venta("028","1006","15-11-2020","MXN $29,798.00","IVA incluido","MXN $0.00","MXN $29,798.00"));	
		ventas.add(new Venta("029","1007","16-11-2020","MXN $15,999.00","IVA incluido","MXN $0.00","MXN $15,999.00"));
		ventas.add(new Venta("030","1008","16-11-2020","MXN $16,890.00","IVA incluido","MXN $0.00","MXN $16,890.00"));
		ventas.add(new Venta("031","1009","16-11-2020","MXN $29,835.00","IVA incluido","MXN $0.00","MXN $29,835.00"));
		ventas.add(new Venta("032","1010","16-11-2020","MXN $72,074.00","IVA incluido","MXN $0.00","MXN $72,074.00"));
		modelo.addAttribute("ventas",ventas);
		
		modelo.addAttribute("titulo","VENTAS");
		return"venta";
	}
	
	@GetMapping("/cliente")
	public String cliente(Model modelo) {
		ArrayList<Cliente>clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente("1001","Marlen","Covarrubias Carrazco","5567348723","marlen@gmail.com","Gustavo A. Madero"));
		clientes.add(new Cliente("1002","José Pablo","Martínez Martínez","5527278967","pablo_@gmail.com","Coacalco"));
		clientes.add(new Cliente("1003","María","Hernández Sandoval","5543434219","maria@gmail.com","Gustavo A. Madero"));
		clientes.add(new Cliente("1004","Martha","Higareda Solís","5512213879","solis@gmail.com","Coacalco"));
		clientes.add(new Cliente("1005","Alberto","Solís Guzmán","5567877678","albert@gmail.com","Delg. Cuauhtémoc"));
		clientes.add(new Cliente("1006","María Fernanda","Hernández Campos","5529616766","Fergi@gmail.com","Héroes Tecámac - Bosques"));
		clientes.add(new Cliente("1007","Gerardo","Belard Gúzman","5577852311","Belard@gmail.com","Heroes Tecamac"));
		clientes.add(new Cliente("1008","Daniela","Aguilar Fernandez","5567455338","Dani@gmail.com","Jilotepec Ixtlahuaca"));
		clientes.add(new Cliente("1009","Eduardo","Palazuelos Badeaux","5523987812","Edu@gmail.com","Col. Santa rosa"));
		clientes.add(new Cliente("1010","Luis Eduardo","Aguilera Arias","5576856427","luis@gmail.com","Héroes Tecámac - Francisco villa"));
		modelo.addAttribute("clientes",clientes);
		
		modelo.addAttribute("titulo","CLIENTES");
		return"cliente";
	}
	
	@GetMapping("/proveedor")
	public String proveedor(Model modelo) {
		ArrayList<Proveedor>proveedores = new ArrayList<Proveedor>();
		proveedores.add(new Proveedor("123","Techmicro","Leandro","info@techmicro-systems.es","7921","655408222","Tlalnepantla de Baz, Méx."));
		proveedores.add(new Proveedor("143","Dell","José María","contacto@dell.com","11950","018773848979","Av. Paseo de la Reforma 2620"));
		proveedores.add(new Proveedor("156","HP","Dorotí ","contacto@HP-contact.com","06600","5550912455"," Victoria 7 Sotano Local 8, Victoria, Colonia Centro"));
		proveedores.add(new Proveedor("178","Lenovo","Lenorado Solís","info@tiendalenovo.es","LME050301NM8","911821558","Av. San Antonio 416, Sacramento, Álvaro Obregón"));
		proveedores.add(new Proveedor("198","ABB","Maron","contacto@abb.com","M6789dH78","5550955964","Av. Canal De Tezontle No. 1512"));
		proveedores.add(new Proveedor("765","Comcover","","contacto@comcover.contact.com","C99800","5564352765","Colector 13 280, Magdalena de las Salinas"));
		proveedores.add(new Proveedor("321","Support & PC's","Yoltic","contact@support.com","567483","5578786653","Lago Margarita 16, Chapultepec Morales"));
		proveedores.add(new Proveedor("222","Seccor","Sergio","contacto@sector-innova.com","5656711","5523121232","25 Plaza De La Tecnologia, Eje Central Lázaro Cárdenas"));
		proveedores.add(new Proveedor("333","Comunicaciones integradas","Gerardo","integer@comunication.com","4540002","5555673655","Prolongacion Paseo de la Reforma Col 700"));
		proveedores.add(new Proveedor("443","Tecnonova","Magdalena","contacto@tecnonova.com","663920","556009873","San Rafael, Cuauhtémoc"));
		modelo.addAttribute("proveedores",proveedores);
		
		modelo.addAttribute("titulo","PROVEEDORES");
		return"proveedor";
	}

}