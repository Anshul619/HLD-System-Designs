package SpringBoot.SampleApp;

@SpringBootApplication
public class MyApplication implements CommandLineRunner{

    public static void main(String[] args) {

        SpringApplication.run(MyApplication.class);
        // other statements
    }

    @Override
    public void run(String...args) throws Exception {

        /*RestTemplate restTemplate = new RestTemplate();
        Country country = restTemplate.getForObject("http://www.services.groupkt.com/country/get/iso2code/US", Country.class);
        log.info(country.toString());*/
    }
}
