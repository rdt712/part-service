package com.toler.dtlp.part;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.toler.dtlp.part.dao.PartDao;
import com.toler.dtlp.part.domain.Part;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PartApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(PartDao partDao) {
		return args -> {
			partDao.save(new Part(1l, "19039352", "Intel i5 7600k", 259.99, 1, "3.8 GHz Quad Core Processor - 6 MB", 1l));
			partDao.save(new Part(2l, "12697299", "Corsair Dominator Platinum DDR4 Ram - 8GB (2 x 4gb)", 110.99, 1, "2 x 4gb sticks of Corsaird Dominator Platinum DDR4 Ram - 2600 MHz", 1l));
			partDao.save(new Part(3l, "18941352", "NZXT S340 Elite - White", 99.99, 1, "Mid-Tower ATX computer case with glass side panel", 1l));
			partDao.save(new Part(4l, "14045072", "EVGA GTX 1070 FTW", 439.99, 1, "NVIDIA GTX 1070 graphics card - 8gb 256-Bit GDDR5, Core Clock 1607 MHZ, Boost Clock 1797 MHz", 1l));
			partDao.save(new Part(5l, "19568546", "Western Digital 2TB HDD", 79.99, 1, "3.5\" 2TB 7200RPM Hard Drive by Western Digital", 1l));
			partDao.save(new Part(6l, "18699942", "Samsung 500GB SSD", 159.99, 1, "2.5\" 850 EVO-Series 500GB Solid State Drive by Samsung", 1l));
			partDao.save(new Part(7l, "10269506", "Air Series AF120 Performance Edition High Airflow 120mm Fan - White (2 pack)", 19.99, 2, "High performance and quiet case fan by Corsair - 2 pack", 1l));
			partDao.save(new Part(8l, "13857396", "MSI Z270 Gaming Pro Carbon", 164.99, 1, "ATX Motherboard - Intel Z270 chipset with LGA 1151 Socket", 1l));
			partDao.save(new Part(9l, "18381036", "EVGA SuperNOVA 650", 79.99, 1, "650 Watt power supply with 80+ Gold efficiency", 1l));
			partDao.save(new Part(10l, "19951537", "Corsair H115i", 124.99, 1, "Corsair H115i CPU cooler - 280mm fan size, 2000RPM, 40.0 dbA", 1l));
			partDao.save(new Part(11l, "16461954", "Windows 10", 99.99, 1, "Windows 10 Operating System from Microsoft", 1l));
		};
	}
}
