package service;

import domain.Hero;
import domain.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class HeroService {

    private HeroRepository heroRepository;

    @Transactional
    public Long HeroSaveRequest(Hero hero) {
        return heroRepository.save(hero).getId();
    }
}
