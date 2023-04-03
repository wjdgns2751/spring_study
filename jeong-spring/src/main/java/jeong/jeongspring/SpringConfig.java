package jeong.jeongspring;

import jeong.jeongspring.repository.MemberRepository;
import jeong.jeongspring.repository.MemoryMemberRepository;
import jeong.jeongspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
