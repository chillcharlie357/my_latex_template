@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RestController
public class AdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceApplication.class, args);
	}

	@Autowired
	private UserFeign userFeign;

	@GetMapping("/port")
	public Object port(){
		return userFeign.port();
	}

}
