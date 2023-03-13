package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.services.map.VetMapService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

        VetMapService vetMapService = ctx.getBean("vetMapService", VetMapService.class);
    }
}
